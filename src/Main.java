import Taxes.*;
import Shops.*;

public class Main {

        public static void main(String[] args) {

            System.out.println("\nПродажи в магазинах и расчёт налоговых ставок.");

            var exclusiveClothesShop = new ExclusiveClothesShop();
            System.out.println(exclusiveClothesShop);
            int sumExclusiveClothesShop = exclusiveClothesShop.calcPrice(exclusiveClothesShop);
            exclusiveClothesShop.showIncome();
            var taxesExclusiveClothesShop = new TaxesExclusiveClothesShop();
            taxesExclusiveClothesShop.calcTaxes(sumExclusiveClothesShop);

            var justClothesShop = new JustClothesShop();
            System.out.println(justClothesShop);
            int sumJustClothesShop = justClothesShop.calcPrice(justClothesShop);
            justClothesShop.showIncome();
            var taxesSum = new TaxesJustClothesShop();
            taxesSum.calcTaxes(sumJustClothesShop);
        }
}
