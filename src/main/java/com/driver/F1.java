package com.driver;

public class F1 extends Car {

//    private String name;
//    private boolean isManual;
    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, 4, 4, 6, isManual, "F1", 5);
        //this.name = name;
        //this.isManual = isManual;

    }

    public void accelerate(int rate){
        int newSpeed = rate + getCurrentSpeed(); //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            changeGear(1);
        }
        //for all other cases, change the gear accordingly
        else if (newSpeed  < 51) {
            changeGear(1);
        } else if (newSpeed < 101) {
            changeGear(2);
        } else if (newSpeed < 151) {
            changeGear(3);
        } else if (newSpeed < 201) {
            changeGear(4);
        } else if(newSpeed < 251){
            changeGear(5);
        }
        else{
            changeGear(6);
        }

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
