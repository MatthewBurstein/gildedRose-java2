package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
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
