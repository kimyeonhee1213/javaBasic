package chap18;

public class ObjectAsReturnValue {
    public static Computer3 makeComputer(String os){
        int reasonableMemory;

        if(os.equals("Window11")){
            reasonableMemory = 32;
        }else if(os.equals("Window10")){
            reasonableMemory = 16;
        }else{
            reasonableMemory = 8;
        }

        Computer3 com = new Computer3(os,reasonableMemory);

        return com;
    }

    public static void main(String[] args) {
        String os1 = "Window11";
        String os2 = "Window10";

        Computer3 com1 = makeComputer(os1);
        Computer3 com2 = makeComputer(os2);

        System.out.print("제작한 첫번째 ");
        com1.show();
        System.out.println("====================");
        System.out.print("제작한 두번째 ");
        com2.show();
    }
}
