package com.gildedrose;

public class Pass extends GenericItem {

    public Pass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
        if (sellIn < 11) {
            increaseQuality();
        }
        if (sellIn < 6) {
            increaseQuality();
        }
        if (sellIn < 0) {
            quality = 0;
        }
        ensureQualityLessThan51();
    }
}
