import java.util.Scanner;

public class WaterBill {

    public static double calculateWaterBill(double gallonsUsage) {
        double minimumCharge = 18.84;
        double ccfCharge =  3.9;
        double costTotal = 0;
        int excessUse = 0;
        int minimumGallons = 1496;
        int ccf = 748;

        if (gallonsUsage <= minimumGallons) {
            costTotal +=  minimumCharge;
        }
        if (gallonsUsage > minimumGallons){
            gallonsUsage -= minimumGallons;
            while (gallonsUsage > 0) {
                gallonsUsage -= ccf;
                excessUse ++;
            }
            costTotal = (minimumCharge + (ccfCharge * excessUse));
        }
        return costTotal;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water " +
                "did you use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
    }
}
