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
        quality = quality < 0 ? 0 : quality;
    }

    void increaseQuality() {
        quality++;
    }

    void decreaseSellIn() {
        sellIn--;
    }
}