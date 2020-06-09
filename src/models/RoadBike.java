package models;

import bicycles.BicycleBase;
import bicycles.BicycleOne;

public class RoadBike extends BicycleBase {

    @Override
    public void accelerate() {
        speed += 11;
    }

    @Override
    public void brake() {
        speed -= 4;
    }
}