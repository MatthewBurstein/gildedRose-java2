package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.quality < 50) {
                    increaseItemQuality(item);
                    if (item.sellIn < 11) {
                        increaseItemQuality(item);
                    }
                    if (item.sellIn < 6) {
                        increaseItemQuality(item);
                    }
                }
            } else if (item.name.equals("Aged Brie")) {
                if (item.quality < 50) {
                    increaseItemQuality(item);
                }
            } else {
                if (item.quality > 0) {
                    if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                    } else {
                        item.quality--;
                    }
                }
            }

            if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            } else {
                item.sellIn--;
            }

            if (item.sellIn < 0) {
                if (item.name.equals("Aged Brie")) {
                    if (item.quality < 50) {
                        increaseItemQuality(item);
                    }
                } else {
                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        item.quality = 0;
                    } else {
                        if (item.quality > 0) {
                            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                                item.quality--;
                            }
                        }
                    }
                }
            }
        }
    }

    private void increaseItemQuality(Item item) {
        item.quality++;
    }
}