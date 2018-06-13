package com.gildedrose;

public class Brie extends GenericItem {

    public Brie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality < 50) {
            increaseQuality();
        }
        if (quality < 50) {
            if (sellIn < 0) {
                increaseQuality();
            }
        }
    }
}