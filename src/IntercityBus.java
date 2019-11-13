public abstract class IntercityBus extends Bus implements CombustionEngine{
    /**
     * Describes a non-rail-bound transport vehicle for the transport of 9 or more people on national routes and drives via an internal combustion engine.
     * @return range >= 500 km as a result.
     */
    public IntercityBus(){
        super("CombustionEngine");
        super.setRegion("Regional");
    }

    public int co2() {
        return 0;
    }


    public int range() {
        return super.range();
    }
}
