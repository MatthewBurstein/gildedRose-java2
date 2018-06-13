package com.gildedrose;

public class GenericItem extends Item {

    public GenericItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        quality--;
        if (sellIn <= 0) {
            quality--;
        }
        ensureQualityNonNegative();
    }

    void ensureQualityNonNegative() {
        quality = quality < 0 ? 0 : quality;
    }

    void ensureQualityLessThan51() {
        quality = quality > 50 ? 50 : quality;
    }

    void increaseQuality() {
        quality++;
    }

    void decreaseSellIn() {
        sellIn--;
    }
}