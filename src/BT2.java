import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        float vnd, usd;
        String money;
        float quydoi1;
        float quydoi2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the currency you want to convert vnd/usd ");
        money = sc.nextLine();
        System.out.println("Enter the sum : ");

        if (money.equals("vnd")) {
            vnd = sc.nextFloat();
            quydoi1 = vnd/23000;
            System.out.println("Your money is " + quydoi1 + " USD"  );
        }
        else if (money.equals("usd")) {
            usd = sc.nextFloat();
            quydoi2 = usd*23000;
            System.out.println("Your money is " + quydoi2 + " VND"  );
        }
    }
}
