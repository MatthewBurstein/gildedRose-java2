package com.gildedrose;

public class ConjuredItem extends Item {

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
