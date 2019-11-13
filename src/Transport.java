public abstract class Transport {

    private String motor;
    private String primaryenergy;
    private String region;
    private String conflicts;



    public Transport(){

    }


    public String getMotor() {
        return motor;
    }

    public String getPrimaryenergy() {
        return primaryenergy;
    }

    public String getRegion() {
        return region;
    }

    public String getConflicts() {
        return conflicts;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setPrimaryenergy(String primaryenergy) {
        this.primaryenergy = primaryenergy;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setConflicts(String conflicts) {
        this.conflicts = conflicts;
    }

    public Transport(String motor, String primaryenergy, String region, String conflicts) {
        this.motor = motor;
        this.primaryenergy = primaryenergy;
        this.region = region;
        this.conflicts = conflicts;
    }

    private int passengerKM(){
        return 0;
    }

    public int energy(){
        return 0;
    }

    public int costs(){
        return 0;
    }


}
