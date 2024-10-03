package Shops;

public class JustClothesShop extends Shops {

    public JustClothesShop() {
        super("\"Just Clothes\"",
                "магазин одежды JC",
                new String[]{"Футболка", "Рубашка", "Джинсы", "Жилет", "Спотивный костюм"},
                new int[]{1000, 1500, 4000, 3000, 7000}
        );
    }

    public String getShopName() {
        return this.shopName;
    }

    public void givenList(JustClothesShop justClothesShop) {
        super.givenList(justClothesShop);
    }

    public int calcPrice(JustClothesShop justClothesShop) {
        return super.calcPrice(justClothesShop);
    }

    @Override
    public void showIncome() {
        System.out.printf("\nОбщая сумма дохода магазина %s составляет: %d руб.\n", getShopName(), sumProducts);
    }
}