package Taxes;

public class TaxesExclusiveClothesShop implements TaxesShop {

    @Override
    public void calcTaxes(int total) {
        final byte tax = 6;  // 6% - упрощенная система налооблажения
        if (total == 0) {
            return;
        }
        total = total * tax / 100;
        System.out.printf("Налог составляет: %d руб.\n", total);
    }

}