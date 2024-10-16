import java.util.Random;
import java.util.Scanner;

/*
Presents user with a math equation. The user then tries to answer the equation.
Displays is user is correct or incorrect.

----TODO:
make it a loop
15 times?
show how many correct vs incorrect
add options:
        - 1-? user picks the highest number it asks about.
        - add option for division and multiplication.
        -

 */
public class Main {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num1 = random.nextInt(10) + 1; // sets num1 to random integer 1-10
        int num2 = random.nextInt(10) + 1; // Sets num2 to random int 1-10

        char operator = random.nextBoolean() ? '+' : '-'; // Sets random operator = or -
        int answer;
        if (operator == '+'){
            answer = num1 + num2; // calculates and sets to answer for user comparison
        } else {
            if (num1 < num2){ // checks if num1 is less than num2 for subtraction
                int tempNum = num1; // sets temp number to num1 to switch
                num1 = num2; // sets num1 to num2
                num2 = tempNum; // sets num 2 to tempNum(num1)
            }
            answer = num1 - num2; // calculates for subtraction
        }
        System.out.println(num1 + " "+ operator + " " + num2 + " = ?" );

        System.out.println("Enter the answer: ");
        int user = scanner.nextInt();

        if (user == answer){
            System.out.println("Correct!");
        } else{
            System.out.println("Incorrect");
        }
    }
}
