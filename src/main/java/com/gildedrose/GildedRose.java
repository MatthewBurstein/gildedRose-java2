package com.gildedrose;

class GildedRose {
    GenericItem[] items;

    public GildedRose(Item[] items) {
        this.items = new GenericItem[items.length];
        for (int i = 0; i < items.length; i++) {
            this.items[i] = categorize(items[i]);
        }
    }

    public void updateQuality() {
        for (GenericItem item : items) {
            item.updateQuality();
            item.decreaseSellIn();
        }
    }

    private GenericItem categorize(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new Sulfuras(item.name, item.sellIn, item.quality);
        } else if (item.name.equals("Aged Brie")) {
            return new Brie(item.name, item.sellIn, item.quality);
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new Pass(item.name, item.sellIn, item.quality);
        } else if (item.name.equals("Conjured Mana Cake")) {
            return new ConjuredItem(item.name, item.sellIn, item.quality);
        } else{
            return new GenericItem(item.name, item.sellIn, item.quality);
        }
    }
}