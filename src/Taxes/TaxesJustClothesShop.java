package Taxes;

public class TaxesJustClothesShop implements TaxesShop, SalesPlan {

    @Override
    public void calcTaxes(int total) {
        final byte tax = 15; // система налооблажения 15%
        if (total == 0) {
            return;
        }
        calcSale(total);
        total = total * tax / 100;
        System.out.printf("Налог составляет: %d руб.\n", total);
    }

    @Override
    public void calcSale(int sales) {
        final int dailyPlan = 50_000; // план дневной выручки
        System.out.println(sales > dailyPlan ?
                "Отличная работа! Выполнен план продаж." :
                "План продаж НЕ выполнен!");
    }
}