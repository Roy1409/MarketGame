import java.util.Scanner;

public class Stock {
    private Scanner scan;
    private int appleStock;
    private int teslaStock;
    private int nvidiaStock;
    private int money;
    private double appleStockx;
    private double teslaStockx;
    private double nvidiaStockx;
    public Stock(Scanner scan,int money) {
        this.scan=scan;
        this.money=money;
    }
    public void dialogue() {
        appleStockx=(Math.random()+1);
        teslaStockx=(Math.random()+1);
        nvidiaStockx=(Math.random()+1);
        int ans=0;
        while (ans!=4) {
            System.out.println("Welcome to the stock Market\nBelow are 4 options:\n(1)Buy Stocks\n(2)Sell Stocks\n(4)Exit");
            ans=scan.nextInt();
            if (ans==1) {
                System.out.println("You have a total of "+money+"\nHere are your stock options:\n(1)Apple $150 each\n(2)Tesla 200$ each\n(3)Nvidia 500$ each\n(4)Exit");
                int ans1=0;
                while (ans1!=4) {
                    ans1=scan.nextInt();
                    if (ans1 == 1) {
                        System.out.println("How much stock?");
                        int ans2 = scan.nextInt();
                        if (money>=ans2*150) {
                            money -= ans2 * 150;
                            System.out.println("You just bought " + ans2 + " apple stocks!");
                            appleStock += ans2;}
                        else {
                            System.out.println("Not enough money. Come back later.");
                        }
                        System.out.println("You have a total of "+money+"\nHere are your stock options:\n(1)Apple $150 each\n(2)Tesla 200$ each\n(3)Nvidia 500$ each\n(4)Exit");
                    }
                    if (ans1 == 2) {
                        System.out.println("How much stock?");
                        int ans2 = scan.nextInt();
                        if (money >= ans2 * 200) {
                            money -= ans2 * 200;
                            System.out.println("You just bought " + ans2 + " tesla stocks!");
                            teslaStock += ans2;
                        } else {
                            System.out.println("Not enough money. Come back later.");
                        }
                        System.out.println("You have a total of " + money + "\nHere are your stock options:\n(1)Apple $150 each\n(2)Tesla 200$ each\n(3)Nvidia 500$ each\n(4)Exit");
                    }
                    if (ans1 == 3) {
                        System.out.println("How much stock?");
                        int ans2 = scan.nextInt();
                        if (money>=ans2*500) {
                            money -= ans2 * 500;
                            System.out.println("You just bought " + ans2 + " nvidia stocks!");
                            nvidiaStock += ans2;}

                        else {
                            System.out.println("Not enough money. Come back later.");

                        }
                        System.out.println("You have a total of "+money+"\nHere are your stock options:\n(1)Apple $150 each\n(2)Tesla 200$ each\n(3)Nvidia 500$ each\n(4)Exit");
                    }
                }
            }
            if (ans==2) {
                int answer=0;
                while (answer!=4) {
                    System.out.println("What stocks do you want to sell?\nThe below is what stocks you have\n(1)Apple stock: "+appleStock+"x price: "+150*appleStockx+"\n(2)Telsa stock: "+teslaStock+"x price: "+200*teslaStockx+"\n(3)Nvidia stock: "+nvidiaStock+"x price: "+500*nvidiaStockx+"\n(4)Exit");
                    answer=scan.nextInt();
                    if (answer==1){
                        System.out.println("How much stock do you want to sell?");
                        int answer1=scan.nextInt();
                        if (answer1>appleStock) {
                            System.out.println("You don't have enough");
                        } else {
                            System.out.println("You sold "+answer1+" apple stock!");
                            money+= (int) (answer1*(150*appleStockx));
                            appleStock-=answer1;
                        }
                    }
                    if (answer==2){
                        System.out.println("How much stock do you want to sell?");
                        int answer1=scan.nextInt();
                        if (answer1>teslaStock) {
                            System.out.println("You don't have enough");
                        } else {
                            System.out.println("You sold "+answer1+" tesla stock!");
                            money+= (int) (answer1*(200*teslaStockx));
                            teslaStock-=answer1;
                        }
                    }
                    if (answer==3) {
                        System.out.println("How much stock do you want to sell?");
                        int answer1=scan.nextInt();
                        if (answer1>nvidiaStock) {
                            System.out.println("You don't have enough");
                        } else {
                            System.out.println("You sold "+answer1+" nvidia stock!");
                            nvidiaStock-=answer1;
                            money+= (int) (answer1*(500*nvidiaStockx));
                        }
                    }
                }
            }
        }
    }

    public int add() {
        return money;
    }

    public void change(int x) {
        money=x;
    }
}
