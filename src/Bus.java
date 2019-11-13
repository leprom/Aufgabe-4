public abstract class Bus extends OffTrack implements Electrified{



    // motor: CombustionEngine or Electro
    public Bus(String motor){

            super.setMotor(motor);
            super.setRegion("City");


            super.setConflicts("WithoutСrossing");
            if (motor.equals("Electro")){
                super.setPrimaryenergy("Battery");
            }
            else {
                super.setPrimaryenergy("fuel");
            }

        }
    }

