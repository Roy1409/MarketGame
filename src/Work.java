import java.util.Scanner;

public class Work {
    private int total;
    private Scanner scan1;
    private int ans;
    public Work(Scanner scan) {
        scan1=scan;
    }
    public void dialogue() {
        int guess=0;
        int num=0;
        System.out.println("Hello, Welcome to work.\nBelow are five places where you can work.\nIn order to get your paycheck, you will need to guess a random number.\nThe difficulty ranges from 1-4\n(1)McDonald's\n(2)Plumber\n(3)Engineer\n(4)Lawyer\n(5)Exit");
        ans= scan1.nextInt();
        while(ans!=5) {
            if (ans == 1) {
                System.out.println("Welcome to McDonald's!");
                num = (int) (Math.random() * 5 + 1);
                while (num != guess) {
                    System.out.println("Guess the correct number to receive your paycheck!(1-5)");
                    guess = scan1.nextInt();
                    if (num>guess) {
                        System.out.println("Higher");
                    }
                    if (num<guess) {
                        System.out.println("Lower");
                    }
                }
                System.out.println("You guessed the right number! Here is your paycheck of 1,000 dollars");
                add(1000);
            } else if (ans == 2) {
                System.out.println("Welcome to the plumbing business!");
                num = (int) (Math.random() * 15 + 1);
                while (num != guess) {
                    System.out.println("Guess the correct number to receive your paycheck!(1-15)");
                    guess = scan1.nextInt();
                    if (num>guess) {
                        System.out.println("Higher");
                    }
                    if (num<guess) {
                        System.out.println("Lower");
                    }
                }
                System.out.println("You guessed the right number! Here is your paycheck of 3,000 dollars");
                add(3000);

            } else if (ans == 3) {
                System.out.println("Welcome to the engineering firm!");
                num = (int) (Math.random() * 40 + 1);
                while (num != guess) {
                    System.out.println("Guess the correct number to receive your paycheck!(1-40)");
                    guess = scan1.nextInt();
                    if (num>guess) {
                        System.out.println("Higher");
                    }
                    if (num<guess) {
                        System.out.println("Lower");
                    }
                }
                System.out.println("You guessed the right number! Here is your paycheck of 20,000 dollars");
                add(20000);
            } else if (ans == 4) {
                System.out.println("Welcome to the law firm!");
                num = (int) (Math.random() * 75 + 1);
                while (num != guess) {
                    System.out.println("Guess the correct number to receive your paycheck!(1-75)");
                    guess = scan1.nextInt();
                    if (num>guess) {
                        System.out.println("Higher");
                    }
                    if (num<guess) {
                        System.out.println("Lower");
                    }
                }
                System.out.println("You guessed the right number! Here is your paycheck of 100,000 dollars");
                add(100000);

            }System.out.println("Hello, Welcome to work.\nBelow are five places where you can work.\nIn order to get your paycheck, you will need to guess a random number.\nThe difficulty ranges from 1-4\n(1)McDonald's\n(2)Plumber\n(3)Engineer\n(4)Lawyer\n(5)Exit");
            ans=scan1.nextInt();
            scan1.nextLine();
        }
    }
    public void add(int x) {
        total+=x;
    }
    public int money(){
        return total;
    }
}


