package com.gildedrose;

public class ConjuredItem extends GenericItem {

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        quality-=2;
        if (sellIn <= 0) {
            quality-=2;
        }
        ensureQualityNonNegative();
    }
}
