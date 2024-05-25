package com.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Normal Item", 10, 20));

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        for (Item item : items) {
            System.out.println(item);
        }
    }
}

