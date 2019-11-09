public abstract class Underground extends RailBound implements GridBound{

    public Underground(){

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
