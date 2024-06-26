package org.example.builder;

import lombok.Data;

/**
 * @author CJW
 * @since 2024/6/6
 */
public class Meal {
    private String food;
    private String drink;

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

}
