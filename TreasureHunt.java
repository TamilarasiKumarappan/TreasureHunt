import java.util.Scanner;

public class treasurehunt {
    public static void main(String[] args) {
        int health=100;
        int coins=0;
        boolean gameover=false;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the treasure hunt!");
        System.out.println("starting values of health");
        health=input.nextInt();
        System.out.println("starting values of coins");
        coins=input.nextInt();
        while(!gameover){
            System.out.println("1.fight\n2.search\n3.reset\n4.check status\n5.quit");
            System.out.println("Enter your choice");
            int choice=input.nextInt();
            if(choice==1){
                health=health-20;
                coins=coins+10;
                System.out.println("You have "+health+" health");
                System.out.println("You have "+coins+" coins");
            }
            else if(choice==2){
                health=health-10;
                coins=coins+20;
                System.out.println("You have "+health+" health");
                System.out.println("You have "+coins+" coins");
            }
            else if(choice==3){
                health=health+15;
                coins=coins-5;
                System.out.println("You have "+health+" health");
                System.out.println("You have "+coins+" coins");
            }
            else if(choice==4){
                System.out.println("current health: "+health);
                System.out.println("current coins: "+coins);
            }
            else if(choice==5){
                System.out.println("GOOD BYE");
                gameover=true;
            }
            else{
                System.out.println("Invalid choice");
                System.out.println("Try Again");
            }
            if(coins>=100){
                System.out.println("WIN");
                gameover=true;
            }
            else if(health<=0){
                System.out.println("LOST");
                gameover=true;
            }
        }
        input.close();
    }
}
