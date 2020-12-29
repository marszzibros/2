public class Discount {
    public static void main(String[] args)
    {
        double regularPrice = 59.0;
        double discount;
        double salePrice;

        discount = regularPrice * 0.2;
        salePrice = regularPrice * 0.8;

        System.out.println("Regular price: " + regularPrice);
        System.out.println("Discount Amount: " + discount);
        System.out.println("Sale price: $" + salePrice);
    }
}
