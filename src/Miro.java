import java.io.IOException;

public class Miro {
    public static void main(String[] args) throws IOException {
        record Position(int x, int y) {}
        int[][] map = {
                {1, 1 ,1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 0, 1, 0, 0, 1, 1},
                {1, 1, 0, 0, 0, 1, 1, 1},
                {1, 1, 0, 1, 0, 0, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1}
        };
        var current = new Position(1, 3);
        var upper = false;
        var goal = new Position(6, 2);
        for (;;) {
            // 미로 표시
            /*for (int x = current.y()-2; x <= current.y() +2 ; ++x) {
                for (int y = current.x() - 2; y <= current.x() +2 ; ++y) {
                    if(x < 0 || x >= map.length || y < 0 || y >= map[x].length){
                        System.out.print("#");
                    }else if(x == current.y() && y == current.x()){
                        System.out.print("O");
                    } else if (map[y][x] == 1) {
                        System.out.print("*");
                    } else if (x == goal.x() && y == goal.y()){
                        System.out.print("G");
                    }else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
*/
            for (int y = 0; y < map.length; y++) {
                for (int x = 0; x < map[y].length; x++) {
                    if (x == current.x() && y == current.y()) {
                        System.out.print(upper ? "O" : "o");
                    } else if (map[y][x] == 1) {
                        System.out.print("*");
                    } else if (x == goal.x() && y == goal.y()){
                        System.out.print("G");
                    }else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            // Goal 결정
            if (current.equals(goal)) {
                System.out.println("GOAL!");
                break;
            }
            // 키입력
            int ch = System.in.read();
            if(ch == '\n') continue;
            // 눌려진 방향 좌표 얻기
            var next = switch (ch) {
                case 'u' ->
                        new Position(current.x() - 1, current.y());
                case 'h' ->
                        new Position(current.x(), current.y() - 1);
                case 'j' ->
                        new Position(current.x() + 1, current.y());
                case 'n' ->
                        new Position(current.x(), current.y() + 1);
                default ->
                        current;
            };
            // 누른 방향이 통로라면 진행
            if (map[next.y()][next.x()] == 0) {
                if(!current.equals(next)){
                    upper = !upper;
                }
                current = next;
            }
            // 엔터키 입력을 버립니다.
            System.in.read();
        }

    }
}
