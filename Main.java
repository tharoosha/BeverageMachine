import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        BeverageMachine beveragemchn = new BeverageMachine();

        while (true) {
            System.out.println("Enter 1 to Continue\nEnter 0 if you want to exit");

            Scanner inn = new Scanner(System.in);
            int d = inn.nextInt();

            if (d == 1) {

                Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                String bb = in.nextLine();
                String b = bb.replace(" ","");

                if (a == 0) {
                    beveragemchn.beverage.add(b);
                    String bev = beveragemchn.beverage.get(beveragemchn.beverage.size() - 1);
                    int count = (beveragemchn.beverage.size());
                    System.out.println("Cup type: " + bev);
                    System.out.println("Cup id: " + count);

                } else if (a == 1) {
                    String bevv = beveragemchn.beverage.get(beveragemchn.beverage.size() - 1);
                    System.out.println(bevv+" has "+beveragemchn.calories(bevv));

                } else if (a == 2) {
                    int numCups = beveragemchn.beverageCups();
                    System.out.println("Total number of cups "+numCups);

                } else {
                    System.out.println("Invalid Input");
                }
            }
            else if(d == 0){
                break;
            }
        }
    }
}
