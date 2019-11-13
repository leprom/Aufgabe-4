public abstract class Bus extends OffTrack implements Electrified{



    /**
     * Describes a non-rail transport vehicle for 9 or more passengers that usually runs via an internal combustion
     * engine, in the urban area also purely electrically.
     *
     */
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

