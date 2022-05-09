package chap18;

public class AssignValueOfClassType1 {
    public static void main(String[] args) {
        System.out.println("com1을 선언합니다.");
        Computer1 com1 = new Computer1();

        com1.setComputer("Window11",32);

        System.out.println("com2를 선언합니다.");
        Computer1 com2;

        System.out.println("com2에 com1을 할당했습니다.");
        com2 = com1;

        System.out.println("\n=[정보변경 전 PC정보 표시]======");
        System.out.print("com1은 ");
        com1.show();
        System.out.println();
        System.out.print("com2는 ");
        com2.show();

        System.out.println("===================================\n");
    }
}
