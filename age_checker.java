import java.util.Scanner;

public class age_checker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        separator();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        separator();
        if (age <= 1 ){
            System.out.println("You haven't been born yet");
            separator();
        }

        else if (age < 18){
            System.out.print("You are a Minor");
            separator();
        }

        else {
            System.out.println("You are an adult");
            separator();
        }
    }

    private static void separator(){
        System.out.print("--------------------\n");
    }
}
