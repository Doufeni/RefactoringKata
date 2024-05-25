package com.gildedrose;

import java.util.List;
import java.util.stream.Collectors;

public class GildedRose {
    private List<AbstractItem> items;

    public GildedRose(List<Item> items) {
        this.items = items.stream()
            .map(ItemFactory::createItem)
            .collect(Collectors.toList());
    }

    public void updateQuality() {
        for (AbstractItem item : items) {
            item.update();
        }
    }



}
