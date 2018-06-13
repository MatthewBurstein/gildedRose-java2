package com.gildedrose;

class GildedRose {
    GenericItem[] items;

    public GildedRose(Item[] items) {
        this.items = new GenericItem[items.length];
        for (int i = 0; i < items.length; i++) {
            GenericItem item;
            if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                item = new Sulfuras(items[i].name, items[i].sellIn, items[i].quality);
            } else if (items[i].name.equals("Aged Brie")) {
                item = new Brie(items[i].name, items[i].sellIn, items[i].quality);
            } else {
                item = new GenericItem(items[i].name, items[i].sellIn, items[i].quality);
            }
            this.items[i] = item;
        }
    }

    public void updateQuality() {
        for (GenericItem item : items) {
            item.updateQuality();
        }
    }
}