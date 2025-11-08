import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int money=1000;
        Scanner scan= new Scanner(System.in);
        Work work= new Work(scan);
        String answer="";
        while (!answer.equalsIgnoreCase("x")) {
            System.out.println("Money:"+money+"\nHello, Welcome to the one and only MarketGame!\nWe are going to strike rich!\nEnter the corresponding Letter for an action\n(a) Work\n(b) Casino" );
            answer=scan.nextLine();
            if (answer.equalsIgnoreCase("a")) {
                work.dialogue();
                money+=work.money();
            }
            if (answer.equalsIgnoreCase("b")) {
                Casino casino= new Casino(scan,money);
                casino.dialogue();
            }
        }
    }
}