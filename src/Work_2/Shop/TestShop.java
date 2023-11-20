package Work_2.Shop;
import java.util.Scanner;
public class TestShop {
    public static void main(String[] args) {
        Shop DNS = new Shop();
        DNS.add(12, "12");
        DNS.add(24, "24");
        DNS.add(6, "6");
        DNS.add(40, "40");
        DNS.add(3, "3");
        DNS.add(10, "10");
        DNS.add(15, "15s");

        System.out.print(DNS.searchByPrice(24));
    }
}
