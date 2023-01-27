import java.util.Scanner;

public class ChatBox {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, welcome to your automated ChatBox!");
        
        System.out.println("Can I start by taking your name?");
        String name = scan.nextLine();

        System.out.println("Hi " +name + " I'm ChatBox, here to assist you, can I ask where you are dialling in from?");
        String location = scan.nextLine();

        System.out.println("I have never been to " +location + " but I'm sure it is great! I'm from AI world. How old are you?");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("So you're " +age + "!");
        System.out.println("I am " + (age*4) + " so I am 4 times older than you!");

        scan.close();
    }
    
}
