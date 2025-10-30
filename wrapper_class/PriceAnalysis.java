package wrapper_class;

import java.util.ArrayList;

public class PriceAnalysis {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> priceLst = new ArrayList<>();
        for (double p : prices) {
            priceLst.add(p);
        }
        double high = priceLst.get(0);
        double sum = 0;
        for (Double price : priceLst) {
            if (price > high) {
                high = price;
            }
            sum += price;
        }
        double avg = sum / priceLst.size();
        System.out.println("Prices: " + priceLst);
        System.out.println("Highest Price: " + high);
        System.out.println("Average Price: " + avg);
    }
}
