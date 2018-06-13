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
        if (sellIn < 0) {
            if (quality < 50) {
                increaseQuality();
            }
        }
        sellIn--;
    }

    private void increaseQuality() {
        quality++;
    }
}