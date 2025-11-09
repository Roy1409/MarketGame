import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int money=1000;
        Scanner scan= new Scanner(System.in);
        Work work= new Work(scan);
        Stock stock= new Stock(scan,money);
        Casino casino= new Casino(scan,money);

        String answer="";
        while (!answer.equalsIgnoreCase("x")) {
            System.out.println("Money:"+money+"\nHello, Welcome to the one and only MarketGame!\nWe are going to strike rich!\nEnter the corresponding Letter for an action\n(a) Work\n(b) Casino\n(c) StockMarket" );
            answer=scan.nextLine();
            if (answer.equalsIgnoreCase("a")) {
                work.dialogue();
                money+=work.money();
                stock.change(money);
                casino.change(money);
            }
            if (answer.equalsIgnoreCase("b")) {
                casino.change(money);
                casino.dialogue();
                money=casino.add();
            }
            if (answer.equalsIgnoreCase("c")) {
                stock.change(money);
                stock.dialogue();
                money=stock.add();
            }
        }
    }
}