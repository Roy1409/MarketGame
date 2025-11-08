import java.util.Scanner;

public class Casino {
    private Scanner scan;
    private int money;
    public Casino(Scanner scan,int money) {
        this.scan=scan;
        this.money=money;
    }

    public void dialogue() {
        System.out.println("Welcome to Casino!\nThese are your game options\n(1)Single draw lotto\n(2)Triple draw lotto\n(3)Roulette\n(4)Exit");
        int ans=0;
        int num=0;
        int guess=0;
        while (ans!=4) {
            ans=scan.nextInt();
            if (ans==1) {
                System.out.println("Enter bet amount: ");
                int bet=scan.nextInt();
                scan.nextLine();
                num=(int) (Math.random()*10+1);
                guess=(int) (Math.random()*10+1);
                if (guess==num) {
                    money+=5*bet;
                    System.out.println("You won "+5*bet);
                } else {
                    money -= bet;
                    System.out.println("You lost " + bet);
                }
                System.out.println("You have "+money+" left");
            }else if (ans==2) {
                System.out.println("Enter bet amount: ");
                int bet=scan.nextInt();
                scan.nextLine();
                num=(int) (Math.random()*2+1);
                guess=(int) (Math.random()*2+1);
                if (guess==num) {
                    money+=2*bet;
                    System.out.println("You won "+2*bet);
                } else {
                    money -= bet;
                    System.out.println("You lost "+bet);
                }
                System.out.println("You have "+money+" left");
            }else if (ans==3) {
                System.out.println("You spin the wheel and pray the gods answer you\nEnter bet amount: ");
                int bet=scan.nextInt();
                scan.nextLine();
                num=(int) (Math.random()*100+1);
                guess=(int) (Math.random()*100+1);
                if (guess==num) {
                    money+=100000*bet;
                    System.out.println("You won "+100000*bet);
                } else {
                    money -= bet;
                    System.out.println("You lost "+bet);
                }
                System.out.println("You have "+money+" left");
            }
            if (ans!=4) {System.out.println("Welcome to Casino!\nThese are your game options\n(1)Single draw lotto\n(2)Triple draw lotto\n(3)Roulette\n(4)Exit");
        }}
        scan.nextLine();



    }
}
