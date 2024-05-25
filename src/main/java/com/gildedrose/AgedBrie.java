package com.gildedrose;

public class AgedBrie extends AbstractItem {
    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void update() {
        item.sellIn--;
        if (item.quality < 50) {
            item.quality++;
        }
        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }
    }
}

