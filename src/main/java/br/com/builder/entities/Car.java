package br.com.builder.entities;

/**
 *
 * @author gefer
 */
public class Car {

    private String fuel;
    private String brand;
    private String color;
    private String model;
    private int potency;

    public static class Builder {

        private String fuel;
        private String brand;
        private String color;
        private String model;
        private int potency;

        public Builder withFuel(Fuel fuel) {
            this.fuel = fuel.toString();
            return this;
        }

        public Builder withBrand(Brand brand) {
            this.brand = brand.toString();
            return this;
        }

        public Builder withPotency(int potency) {
            this.potency = potency;
            return this;
        }

        public Builder withColor(Color color) {
            this.color = color.toString();
            return this;
        }

        public Builder withModel(Model model) {
            this.model = model.toString();
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.fuel = builder.fuel;
        this.color = builder.color;
        this.potency = builder.potency;
        this.model = builder.model;
    }

    @Override
    public String toString() {
        return "Car{" + "fuel=" + fuel + ", brand=" + brand + ", color=" + color + ", model=" + model + ", potency=" + potency + '}';
    }
}
