package chap19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileData {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter((
                    new FileWriter(("output1.txt"))
                    )));
            pw.println("* 나라별 감사말 감사합니다");
            pw.println("한국어 - 감사합니다.");
            pw.println("영어 - Thank you");

            pw.close();
            System.out.println("파일 쓰기가 완료되었습니다");
        } catch (IOException e) {
            System.out.println(e+"입출력 오류입니다.");
        }
    }
}
