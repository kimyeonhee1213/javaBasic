package chap18;

public class ObjectAsArgument {

    public static void checkMemory(Computer2 com){
        int reasonableMemory;
        String os = com.getOs();
        int memory = com.getMemory();
        com.show();

        if(os.equals("Window 11")){
            reasonableMemory = 32;
        }else if(os.equals("Window 10")){
            reasonableMemory = 16;
        }else{
            reasonableMemory = 8;
        }

        if(memory >= reasonableMemory){
            System.out.println("메모리 크기는 알맞습니다.");
        }else{
            System.out.println("메모리를 추가하는 것이 좋습니다.");
        }
        System.out.println("==================================");
    }


    public static void main(String[] args) {
        Computer2 com1 = new Computer2();
        Computer2 com2 = new Computer2();

        com1.setOs("Window 11");
        com1.setMemory(32);
        com2.setOs("Window 11");
        com2.setMemory(16);

        System.out.println("========================");
        checkMemory(com1);
        checkMemory(com2);
    }
}
