package br.com.builder.runner;

import br.com.builder.entities.Brand;
import br.com.builder.entities.Car;
import br.com.builder.entities.Color;
import br.com.builder.entities.Fuel;
import br.com.builder.entities.Model;

public class Main {

    public static void main(String[] args) {

        Car car = new Car.Builder()
                .withBrand(Brand.FORD)
                .withFuel(Fuel.FLEX)
                .withColor(Color.BLUE)
                .withModel(Model.RANGER)
                .withPotency(190)
                .build();

        System.out.println(car.toString());
    }

}
