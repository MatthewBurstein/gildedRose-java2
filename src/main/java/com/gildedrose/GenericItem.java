package com.gildedrose;

public class GenericItem extends Item {

    public GenericItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (quality < 50) {
                increaseItemQuality();
                if (sellIn < 11) {
                    increaseItemQuality();
                }
                if (sellIn < 6) {
                    increaseItemQuality();
                }
            }
        } else if (name.equals("Aged Brie")) {
            if (quality < 50) {
                increaseItemQuality();
            }
        } else {
            if (quality > 0) {
                quality--;
            }
        }
        sellIn--;

        if (sellIn < 0) {
            if (name.equals("Aged Brie")) {
                if (quality < 50) {
                    increaseItemQuality();
                }
            } else {
                if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    quality = 0;
                } else {
                    if (quality > 0) {
                        quality--;
                    }
                }
            }
        }
    }

    private void increaseItemQuality() {
        quality++;
    }
}
