package com.gildedrose;

public class Brie extends Item {

    public Brie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
        if (sellIn < 0) {
            increaseQuality();
        }
        ensureQualityLessThan51();
    }
}