package chap19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileShowData {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("src/chap19/sample.txt"));

            while (sc.hasNextLine()){
                String strLine = sc.nextLine();
                System.out.println(strLine);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("입력파일을 찾을 수 없습니다.");
        }
    }
}
