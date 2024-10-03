package Shops;

public class ExclusiveClothesShop extends Shops {

    public ExclusiveClothesShop() {
        super("\"Exclusive Clothes\"",
                "магазин эксклюзивной одежды",
                new String[]{"Плащ", "Платье", "Жакет", "Брюки"},
                new int[]{10000, 15000, 7000, 8000}
        );
    }

    public String getShopName() {
        return this.shopName;
    }

    public void givenList(ExclusiveClothesShop exclusiveClothesShop) {
        super.givenList(exclusiveClothesShop);
    }

    public int calcPrice(ExclusiveClothesShop exclusiveClothesShop) {
        return super.calcPrice(exclusiveClothesShop);
    }

    @Override
    public void showIncome() {
        System.out.printf("\nОбщая сумма дохода магазина %s составляет: %d руб.\n", getShopName(), sumProducts);
    }
}