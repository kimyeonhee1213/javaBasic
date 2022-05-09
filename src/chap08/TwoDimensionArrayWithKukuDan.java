package chap08;

import java.util.Scanner;

public class TwoDimensionArrayWithKukuDan {



    public static void main(String[] args){

        int[][] kukuDan = new int[9][9];

        for(int dan = 0; dan < 9; dan++){
            for(int i = 0; i < 9; i++){
                kukuDan[dan][i] = (dan + 1) * (i + 1);
            }
        }

        for(int dan = 0; dan < 9; dan++){
            System.out.print((dan+1)+ "단 : ");
            for(int i = 0; i < 9; i++){
                System.out.print(kukuDan[dan][i] + "\t");
            }
            System.out.println();
        }
    }
}
