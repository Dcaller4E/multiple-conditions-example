import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Enter a day
        System.out.print("Enter a day: ");
        int day = keyboard.nextInt();
        boolean validDay = ( 1 <= day && day <= 31 );
        
        // Enter a month
        System.out.print("Enter a month: ");
        int month = keyboard.nextInt();
        boolean validMonth = ( 1 <= month && month <= 12 );

        // check data
        if (!validDay) {
            System.out.println("Invalid day!");
        }

        if (!validMonth) {
            System.out.println("Invalid month!");
        }

        if (validDay && validMonth) {
            System.out.println("Looks like a valid date.");
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