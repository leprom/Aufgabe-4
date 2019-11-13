public abstract class Underground extends RailBound implements GridBound{
    /**
     * Describes a cross-free mode of transport in the urban area on tracks. The drive is electrical, the power supply by busbars or overhead lines.
     * @return voltage = 750 Volt.
     */
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
