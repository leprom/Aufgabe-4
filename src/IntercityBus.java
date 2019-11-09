public abstract class IntercityBus extends Bus implements CombustionEngine{

    public IntercityBus(){

    }

    public int co2() {
        return 0;
    }


    public int range() {
        return super.range();
    }
}
