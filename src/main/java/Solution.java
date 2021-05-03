import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static int[] premiumChangeMaker(float price, List<Float> payment) {
        int[] change = new int[8];
        float total = 0;
        float difference;
        int count20s = 0;
        int count10s = 0;
        int count5s = 0;
        int count1s = 0;
        int countQs = 0;
        int countDs = 0;
        int countNs = 0;
        int countPs = 0;

        System.out.println("");
        System.out.println("Cost of items/merchandise: " + price);

        for (Float coin : payment) {
            total = total + coin;
        }

        System.out.println("Total number of bills/coins collected: " + payment.size());
        System.out.println("Total amount paid: " + total);

        difference = Math.round((total - price) * 100.0f) / 100.0f;
        System.out.println("");
        System.out.println("Total change due: " + difference);

        do {
            if (difference >= 20.00f) {
                count20s++;
                change[0] = count20s;
                difference = Math.round((difference - 20.00f) * 100.0f) / 100.0f;
                System.out.println("One twenty-dollar bill disbursed..");
                System.out.println("Remaining change due: " + difference);
                continue;
            }
            if (difference >= 10.00f) {
                count10s++;
                change[1] = count10s;
                difference = Math.round((difference - 10.00f) * 100.0f) / 100.0f;
                System.out.println("One ten-dollar bill disbursed..");
                System.out.println("Remaining change due: " + difference);
                continue;
            }
            if (difference >= 5.00f) {
                count5s++;
                change[2] = count5s;
                difference = Math.round((difference - 5.00f) * 100.0f) / 100.0f;
                System.out.println("One five-dollar bill disbursed..");
                System.out.println("Remaining change due: " + difference);
                continue;
            }
            if (difference >= 1.00f) {
                count1s++;
                change[3] = count1s;
                difference = Math.round((difference - 1.00f) * 100.0f) / 100.0f;
                System.out.println("One one-dollar bill disbursed..");
                System.out.println("Remaining change due: " + difference);
                continue;
            }
            if (difference >= 0.25f) {
                countQs++;
                change[4] = countQs;
                difference = Math.round((difference - 0.25f) * 100.0f) / 100.0f;
                System.out.println("One quarter disbursed..");
                System.out.println("Remaining change due: " + difference);
                continue;
            }
            if (difference >= 0.10f) {
                countDs++;
                change[5] = countDs;
                difference = Math.round((difference - 0.10f) * 100.0f) / 100.0f;
                System.out.println("One dime disbursed..");
                System.out.println("Remaining change due: " + difference);
                continue;
            }
            if (difference >= 0.05f) {
                countNs++;
                change[6] = countNs;
                difference = Math.round((difference - 0.05f) * 100.0f) / 100.0f;
                System.out.println("One nickel disbursed..");
                System.out.println("Remaining change due: " + difference);
                continue;
            }
            if (difference >= 0.01f) {
                countPs++;
                change[7] = countPs;
                difference = Math.round((difference - 0.01f) * 100.0f) / 100.0f;
                System.out.println("One penny disbursed..");
                System.out.println("Remaining change due: " + difference);
            }
        } while (difference != 0);

        System.out.println("");
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
        List<Float> payment = new ArrayList<>(Arrays.asList(20.00f, 20.00f, 0.25f, 0.25f, 0.10f));
        premiumChangeMaker(35.51f, payment);
    }
}
