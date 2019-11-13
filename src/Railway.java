public abstract class Railway extends RailBound implements CombustionEngine {
    @Override
    public int co2() {
        if(getMotor().equals("CombustionEngine")) return 0;
        else return 2000;
    }

    // motor: CombustionEngine or Electro
    public Railway(String motor){
        super.setMotor(motor);
        super.setRegion("Regional");
        super.setConflicts("Priority");
        if (motor.equals("Electro")){
            super.setPrimaryenergy("Catenary");
        }
        else {
            super.setPrimaryenergy("fuel");
        }

    }

}
