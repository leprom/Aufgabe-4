public abstract class Tram extends RailBound implements GridBound{
    /**
     * Describes a mode of transport in the urban area on track. The drive is electric, the power supply via overhead lines.
     */

    public Tram(String primaryEnergy){
        super.setMotor("Electro");
        super.setRegion("City");
        super.setConflicts("EqualRights");
        super.setPrimaryenergy("Catenary");
    }

    public int range(){
        return 0;
    }

    public int voltage(){
        return 0;
    }

    public boolean onOff(){
        return false;
    }
}
