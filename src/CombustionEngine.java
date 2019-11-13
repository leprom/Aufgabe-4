public interface CombustionEngine extends Electrified{
    /**
     * Describes a transport that is powered by an internal combustion engine.
     * @return annual average amount of CO2 in tonnes that is produced during operation and range in km, which can be covered with a full tank charge.
     */
    int range();
    int co2();
}
