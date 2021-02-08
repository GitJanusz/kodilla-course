package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String roll;
    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients;

    private Bigmac(String roll, String bun, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigmacBuilder {
        private String roll;
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder Roll(String roll) {
            this.roll = roll;
            if (!roll.equals("zwykła")) {
                throw new IllegalStateException("Wybrano złą bułkę, dostępna bułka: zwykła");
            }
            return this;
        }

        public BigmacBuilder Bun(String bun) {
            this.bun = bun;
            if (!bun.equals("z sezamem") && !bun.equals("bez sezamu")) {
                throw new IllegalStateException("Wybrano złą opcję: " + "'" + bun + "'" + ", dostępne opcje: 'z sezamem' / 'bez sezamu'");
            }
            return this;
        }

        public BigmacBuilder Burgers(int burgers) {
            this.burgers = burgers;
            if (burgers >= 5) {
                throw new IllegalStateException("Wybrałeś " + burgers + " kotletów, dopuszczalna ilość, to 4!");
            }
            return this;
        }

        public BigmacBuilder Sauce(String sauce) {
            this.sauce = sauce;
            if (!sauce.equals("standard") && !sauce.equals("1000 wysp") && !sauce.equals("barbecue")) {
                throw new IllegalStateException("Sos " + sauce + " jest niedostępny, wybierz inny!");
            }
            return this;
        }

        public BigmacBuilder Ingredient(String ingredient) {
            this.ingredients.add(ingredient);
            List<String> toppings = new ArrayList<>();
            toppings.add("sałata");
            toppings.add("cebula");
            toppings.add("bekon");
            toppings.add("ogórek");
            toppings.add("papryczki chilli");
            toppings.add("pieczarki");
            toppings.add("krewetki");
            toppings.add("ser");
            if (!toppings.contains(ingredient)) {
                throw new IllegalStateException("Wybrano błędny dodatek, wybierz inny!");
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, bun, burgers, sauce, ingredients);
        }
    }
}
