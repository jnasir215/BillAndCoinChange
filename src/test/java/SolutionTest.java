import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void testPremiumChangeMaker1() {
        float price = 52.06f;
        List<Float> payment = new ArrayList<>(Arrays.asList(20.00f, 20.00f, 20.00f, 1.00f, 1.00f, 1.00f));

        int[] expected = new int[] {0,1,0,0,3,1,1,4};
        int[] actual = Solution.premiumChangeMaker(price, payment);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testPremiumChangeMaker2() {
        float price = 42.06f;
        List<Float> payment = new ArrayList<>(Arrays.asList(100.00f));

        int[] expected = new int[] {2,1,1,2,3,1,1,4};
        int[] actual = Solution.premiumChangeMaker(price, payment);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testPremiumChangeMaker3() {
        float price = 81.37f;
        List<Float> payment = new ArrayList<>(Arrays.asList(20.00f, 20.00f, 20.00f, 20.00f, 20.00f));

        int[] expected = new int[] {0,1,1,3,2,1,0,3};
        int[] actual = Solution.premiumChangeMaker(price, payment);

        Assert.assertArrayEquals(expected, actual);
    }
}
