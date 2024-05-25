package com.gildedrose;

public class BackstagePass extends AbstractItem {
    public BackstagePass(Item item) {
        super(item);
    }

    @Override
    public void update() {
        item.sellIn--;
        if (item.quality < 50) {
            item.quality++;
            if (item.sellIn < 10) {
                item.quality++;
            }
            if (item.sellIn < 5) {
                item.quality++;
            }
        }
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
