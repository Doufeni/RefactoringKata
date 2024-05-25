package com.gildedrose;

public class StandardItem extends AbstractItem {
    public StandardItem(Item item) {
        super(item);
    }

    @Override
    public void update() {
        item.sellIn--;
        if (item.quality > 0) {
            item.quality--;
        }
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }
}

