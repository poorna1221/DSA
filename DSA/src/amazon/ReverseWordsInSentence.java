package amazon;

public class ReverseWordsInSentence {
    static void tF() {

    }

    public static void main(String[] args) {

        String sentense = "Hello World Are You";

        String sen[] = sentense.split(" ");

        for (int i = sen.length - 1; i >= 0; i--) {
            System.out.print(sen[i] + " ");

        }

        int mid = sen.length / 2;

        for (int i = 0; i < mid; i++) {
            int lastIndex = (sen.length - i - 1);
            String temp = sen[lastIndex];
            sen[lastIndex] = sen[i];
            sen[i] = temp;
        }

        System.out.println("------");
        for (String str : sen) {
            System.out.print(str + " ");
        }


    }
}
