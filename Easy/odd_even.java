/*In a programming contest, you get a question: determine whether a given number is prime. You remember a prime number is a number greater
    than 1 that has no divisors other than 1 and itself. To solve this, you decide to check divisibility from 2 up to the square root of the number.
    This way, you can quickly find if any divisor exists and decide primality.*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
        int number =sc.nextInt();  

            if(number % 2==0){
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
       }
    }
}

