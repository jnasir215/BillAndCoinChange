import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static float amountPaid(float price, List<Float> payment) {
        DecimalFormat df = new DecimalFormat("0.00");
        float total = 0;

        System.out.println();
        System.out.println("Cost of items/merchandise: $" + df.format(price));

        for (Float coin : payment) {
            total = total + coin;
        }

        System.out.println("Total number of bills/coins collected: " + payment.size());
        for(int i = 0; i < payment.size(); i++) {
            System.out.print("$" + df.format(payment.get(i)));
            if(i != (payment.size()-1)) System.out.print(", ");
            if(i == (payment.size()-1)) System.out.print(".");
        }
        System.out.println();
        System.out.println("Total amount paid: $" + df.format(total));
        return total;
    }

    public static float collectMore(float price, float total) {
        DecimalFormat df = new DecimalFormat("0.00");
        List<Float> morePayment = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("The bills/coins you paid are not enough.");
        System.out.print("How many more bills/coins are you paying with: ");
        int noBills = scan.nextInt();
        for (int i = 0; i < noBills; i++) {
            System.out.print("Enter bill/coin amount: ");
            morePayment.add(scan.nextFloat());
        }

        for (Float coin : morePayment) {
            total = total + coin;
        }
        System.out.println("Total number of bills/coins collected: " + morePayment.size());
        for(int i = 0; i < morePayment.size(); i++) {
            System.out.print("$" + df.format(morePayment.get(i)));
            if(i != (morePayment.size()-1)) System.out.print(", ");
            if(i == (morePayment.size()-1)) System.out.print(".");
        }
        System.out.println();
        System.out.println("Total amount paid: $" + df.format(total));

        return total;
    }

    public static int[] premiumChangeMaker(float price, float total) {
        DecimalFormat df = new DecimalFormat("0.00");
        int[] change = new int[8];
        //float total = 0;
        float difference;
        int count20s = 0;
        int count10s = 0;
        int count5s = 0;
        int count1s = 0;
        int countQs = 0;
        int countDs = 0;
        int countNs = 0;
        int countPs = 0;

        /*System.out.println();
        System.out.println("Cost of items/merchandise: $" + df.format(price));

        for (Float coin : payment) {
            total = total + coin;
        }

        System.out.println("Total number of bills/coins collected: " + payment.size());
        for(int i = 0; i < payment.size(); i++) {
            System.out.print("$" + df.format(payment.get(i)));
            if(i != (payment.size()-1)) System.out.print(", ");
            if(i == (payment.size()-1)) System.out.print(".");
        }
        System.out.println();
        System.out.println("Total amount paid: $" + df.format(total));*/

        difference = Math.round((total - price) * 100.0f) / 100.0f;
        System.out.println();
        System.out.println("Total change due: $" + df.format(difference));

        do {
            if (difference >= 20.00f) {
                count20s++;
                change[0] = count20s;
                difference = Math.round((difference - 20.00f) * 100.0f) / 100.0f;
                System.out.println("One twenty-dollar bill disbursed..");
                System.out.println("Remaining change due: $" + df.format(difference));
                continue;
            }
            if (difference >= 10.00f) {
                count10s++;
                change[1] = count10s;
                difference = Math.round((difference - 10.00f) * 100.0f) / 100.0f;
                System.out.println("One ten-dollar bill disbursed..");
                System.out.println("Remaining change due: $" + df.format(difference));
                continue;
            }
            if (difference >= 5.00f) {
                count5s++;
                change[2] = count5s;
                difference = Math.round((difference - 5.00f) * 100.0f) / 100.0f;
                System.out.println("One five-dollar bill disbursed..");
                System.out.println("Remaining change due: $" + df.format(difference));
                continue;
            }
            if (difference >= 1.00f) {
                count1s++;
                change[3] = count1s;
                difference = Math.round((difference - 1.00f) * 100.0f) / 100.0f;
                System.out.println("One one-dollar bill disbursed..");
                System.out.println("Remaining change due: $" + df.format(difference));
                continue;
            }
            if (difference >= 0.25f) {
                countQs++;
                change[4] = countQs;
                difference = Math.round((difference - 0.25f) * 100.0f) / 100.0f;
                System.out.println("One quarter disbursed..");
                System.out.println("Remaining change due: $" + df.format(difference));
                continue;
            }
            if (difference >= 0.10f) {
                countDs++;
                change[5] = countDs;
                difference = Math.round((difference - 0.10f) * 100.0f) / 100.0f;
                System.out.println("One dime disbursed..");
                System.out.println("Remaining change due: $" + df.format(difference));
                continue;
            }
            if (difference >= 0.05f) {
                countNs++;
                change[6] = countNs;
                difference = Math.round((difference - 0.05f) * 100.0f) / 100.0f;
                System.out.println("One nickel disbursed..");
                System.out.println("Remaining change due: $" + df.format(difference));
                continue;
            }
            if (difference >= 0.01f) {
                countPs++;
                change[7] = countPs;
                difference = Math.round((difference - 0.01f) * 100.0f) / 100.0f;
                System.out.println("One penny disbursed..");
                System.out.println("Remaining change due: $" + df.format(difference));
            }
        } while (difference != 0);

        System.out.println();
        System.out.println("Breakdown of change disbursed..");
        System.out.println("Number of twenty-dollar bills: " + change[0]);
        System.out.println("Number of ten-dollar bills: " + change[1]);
        System.out.println("Number of five-dollar bills: " + change[2]);
        System.out.println("Number of one-dollar bills: " + change[3]);
        System.out.println("Number of quarters: " + change[4]);
        System.out.println("Number of dimes: " + change[5]);
        System.out.println("Number of nickels: " + change[6]);
        System.out.println("Number of pennies: " + change[7]);
        System.out.println(Arrays.toString(change));

        return change;
    }

    public static void main(String[] args) {
        //List<Float> payment = new ArrayList<>(Arrays.asList(20.00f, 20.00f, 0.25f, 0.25f, 0.10f));
        List<Float> payment = new ArrayList<>();
        float total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Cost of merchandise: ");
        float price = scan.nextFloat();
        System.out.print("How many bills/coins are you paying with: ");
        int noBills = scan.nextInt();
        for (int i = 0; i < noBills; i++) {
            System.out.print("Enter bill/coin amount: ");
            payment.add(scan.nextFloat());
        }
        /*for (Float coin : payment) {
            total = total + coin;
        }*/
        total = amountPaid(price, payment);
        if(total < price)
            total = collectMore(price, total);
        premiumChangeMaker(price, total);
    }
}
