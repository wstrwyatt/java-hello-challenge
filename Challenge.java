/* 
    TODO:
    1. Ask user for name 
    2. Ask user for age
    3. Use Scanner to read name and age
    4. Read back response with message
    
*/

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your name? ");
        String name = sc.nextLine();
        
        System.out.println("What is your age? ");
        int age = sc.nextInt();
        
        System.out.println("Hello " + name + ", you are " + age + "years old.");
        
    }
}