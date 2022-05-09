//public class CheckFloat {
//
//    enum FloatState{
//        START, INT, FRACSTART, FRAC, ZERO
//    }
//
//    static boolean check(String data){
//        var state = FloatState.START;
//        for(char ch : data.toCharArray()){
//            switch (state){
//                case START -> {
//                    if(ch == '0'){
//                        state = FloatState.ZERO;
//                    } else if(ch >= '1' && ch <= '9'){
//                        state = FloatState.INT;
//                    }else {
//                        return false;
//                    }
//                }
//                case ZERO -> {
//                    if(ch == '.'){
//                        state = FloatState.FRACSTART;
//                    }else {
//                        return false;
//                    }
//                }
//            }
//        }
//   // }
//}
