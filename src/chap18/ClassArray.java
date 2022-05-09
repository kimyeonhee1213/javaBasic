package chap18;

public class ClassArray {
    public static void main(String[] args) {
        Computer1[] coms = new Computer1[3];

        for(int i = 0; i < coms.length; i++){
            coms[i] = new Computer1();
        }

        coms[0].setComputer("Window11",32);
        coms[1].setComputer("Window10",16);
        coms[2].setComputer("WindowXP",8);

        for(int i = 0; i<coms.length; i++){
            coms[i].show();
        }
    }
}
