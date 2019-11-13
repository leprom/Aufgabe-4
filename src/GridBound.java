public interface GridBound extends Electrified{
    /**
     * Interface describes a transport vehicle powered only by electricity, with the transport of electricity through 	overhead contact line or overhead contact tracks.
     * @return the nominal voltage in volts and if the lines are switched on.
     * The onOff method is also used to switch on and off the power supply via lines.
     */
    int range();
    int voltage();
    boolean onOff();
}
