package leetcode;

import java.io.*;

public class TenthLine_195 {


    public void test() throws IOException {
        int rowNumber = 0;
        BufferedReader br = new BufferedReader(new FileReader("D:\\LearningTools\\ClipboardHealth\\DSA\\src\\leetcode\\tenth.txt"));
        while (br.readLine() != null) {
            rowNumber++;
            if (rowNumber == 9) {
                System.out.println(br.readLine());
            }
        }

    }

    public static void main(String[] args) throws IOException {
        TenthLine_195 s = new TenthLine_195();
        s.test();
    }
}
