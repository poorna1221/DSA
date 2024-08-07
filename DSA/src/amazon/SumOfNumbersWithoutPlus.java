package amazon;

public class SumOfNumbersWithoutPlus {
    static void tF() {

    }

    public static void main(String[] args) {

/*
        sum of 486 & 799 by keeping carry on top of same element position sum will be
                sum = 175 & carry=111, if we left shift carry it wll become 175+1110=1285*/
//https://www.youtube.com/watch?v=gIlZOcZHtlQ

        int a = 486;
        int b = 799;
        int sum = a ^ b;
        int carry = a & b;
        System.out.println(a ^ b);
        System.out.println(a & b);


        while (carry != 0) {//while(carry>0)
            carry = carry << 1;

            int tempSum = sum ^ carry;
            int tempCarry = sum & carry;

            sum = tempSum;//this is required becauase if in line 21 if we say sum=sum^carry; next line will use
            //new sum instead of old sum hence we need to store the result in new tempSum
            carry = tempCarry;//This can be commented

        }
        System.out.println("sum is " + sum);

    }
}
