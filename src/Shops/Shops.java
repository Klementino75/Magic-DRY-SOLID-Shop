package Shops;

import java.util.Scanner;

public abstract class Shops {

    protected static int sumProducts = 0;

    protected String shopName;
    protected String specialization;

    protected int[] basket;
    protected int[] prices;
    protected String[] products;

    public Shops(String shopName, String specialization, String[] products, int[] prices) {
        this.shopName = shopName;
        this.specialization = specialization;
        this.products = products;
        this.prices = prices;
    }

    public String getShopName() {
        return shopName;
    }

    public int[] getPrices() {
        return prices;
    }

    public void givenList(Shops shops) {
        System.out.printf("\nТовары в магазине %s:\n", getShopName());
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - " + prices[i] + " руб/шт");
        }
        System.out.println();
    }

    public int calcPrice(Shops shops) {
        givenList(shops);
        basket = new int[products.length];
        Scanner scan = new Scanner(System.in);
        System.out.println("Для выхода введите \"end\".");
        while (true) {
            System.out.print("Введите номер товара и количество проданного: ");
            String input = scan.nextLine();
            if ("end".equals(input)) {
                break;
            }
            String[] in = input.split(" ");
            try {
                int productNumber = Integer.parseInt(in[0]) - 1;
                int productCount = Integer.parseInt(in[1]);
                basket[productNumber] += productCount;
            } catch (NumberFormatException ex) {
                System.out.println("Введите номер товара или \"end\".");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Такого товара нет, попробуйте ещё раз.");
            }
        }
        System.out.println("\nСписок продаж: ");
        for (int i = 0; i < products.length; i++) {
            if (basket[i] != 0) {
                System.out.println(products[i] + " - " + basket[i] + " шт, " + prices[i] + " руб/шт на сумму " +
                        (basket[i] * prices[i]) + " руб.");
                sumProducts += (basket[i] * prices[i]);
            }
        }
        System.out.printf("Итого: %d руб.\n", sumProducts);
        return sumProducts;
    }

    public abstract void showIncome();

    @Override
    public String toString() {
        return "\n" + getShopName() + " - " + specialization + ".";
    }
}