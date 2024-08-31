import java.util.Scanner;

public class age_checker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        if (age <= 1 ){
            System.out.println("You haven't been born yet");
        }

        else if (age < 18){
            System.out.print("You are a Minor");
        }

        else {
            System.out.println("You are an adult");
        }
    }
}
