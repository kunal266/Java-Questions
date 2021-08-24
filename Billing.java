public class Billing

{

    public static double computeBill(double prc)

    {

        double taxes = 0.08 * prc;

        return prc + taxes;

    }

    public static double computeBill(double prc, int tot) {

        double taxes = 0.08 * (prc * tot);

        return (tot * prc) + taxes;

    }

    public static double computeBill(double prc, int tot, double value) {

        double taxes = 0.08 * (prc * tot);

        return ((tot * prc) + taxes) - value;

    }

    public static void main(String args[]) {
        System.out.println(" \n Kunal Makwana 19BAI1011");
        System.out.println(computeBill(5));

        System.out.println(computeBill(5, 5));

        System.out.println(computeBill(5, 15, 50));

    }

}