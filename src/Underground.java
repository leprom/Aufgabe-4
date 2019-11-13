public abstract class Underground extends RailBound implements GridBound{

    // primaryenergy: Busbars or Catenary
    public Underground(String primaryenergy){
        super.setMotor("Electro");
        super.setRegion("City");
        super.setConflicts("PriorityRules");
        super.setPrimaryenergy(primaryenergy);
    }

    public int range(){
        return 0;
    }
    public int voltage(){
        return 750;
    }
    public boolean onOff(){
        return false;
    }

}
