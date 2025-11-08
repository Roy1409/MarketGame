import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Work work= new Work(scan);
        System.out.println("Hello, Welcome to the one and only MarketGame!\nWe are going to strike rich!\nEnter the corresponding Letter for an action\n(a) Work"  );
        String answer=scan.nextLine();
        if (answer.equalsIgnoreCase("a")) {
            work.dialogue();

        }

    }
}