package DeleteMePractice;

public class SumWithoutPlus {
    static void SumWithoutPlus() {

        int a = 999, b = 999;
        int sum, carry, newSum, newCarry;

        sum = a ^ b;
        carry = a & b;

        while (carry > 0) {
            carry = carry << 1;
            newSum = sum ^ carry;
            carry = sum & carry;

            sum = newSum;

        }
        System.out.println(sum);


    }

    public static void main(String[] args) {

        SumWithoutPlus();
    }
}
