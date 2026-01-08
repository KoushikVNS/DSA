/*One day, while teaching your little sibling about numbers, you wonder how a computer can tell if a number is even or odd. 
You recall that even numbers are divisible by 2 without a remainder, and odd numbers are not. 
To make it clear, you decide to write a simple program that checks the divisibility by 2 to classify any given number.*/

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

