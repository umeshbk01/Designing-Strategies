package StrategyPattern;

import StrategyPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{

   NormalVehicle(){
        super( new NormalDriveStrategy());
    }
}