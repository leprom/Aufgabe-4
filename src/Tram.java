public abstract class Tram extends RailBound implements GridBound{

    public Tram(){

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
