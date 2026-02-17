import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = keyboard.nextInt();

        if (age < 13 || age > 55) {
            System.out.println("Discounted ticket!");
        } else {
            System.out.println("Regular price.");
        }
    }
}

/* 
    Compile 
    javac App.java

    Run
    java App
*/

/*
    Run
    java App.java
*/