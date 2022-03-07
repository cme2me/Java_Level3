package com.company.fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitBox<T extends Fruits> {
    private List<T> box;

    public FruitBox(T... fruits) {
        this.box = new ArrayList(Arrays.asList(fruits));
    }

    public float getWeight() {
        float n = 0.0f;
        for (T fruits: box
             ) {
            n += fruits.getWeight();
        }
        return n;
    }

    public boolean avg(FruitBox<?> somethingElse) {
        return Math.abs(this.getWeight() - somethingElse.getWeight() ) < 0.00001;
    }
    public void replace(FruitBox<? super T> somethingElse) {
        somethingElse.box.addAll(this.box);
        this.box.clear();
    }
    public void addFruits(T fruits) {
        box.add(fruits);
    }

}
