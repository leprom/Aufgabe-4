public interface Electrified {
    /**
     * Interface describes transport that is only powered by electricity, regardless of the form of electricity transport.
     * @return the range in km, which can be covered with full batteries without any other energy supply.
     */
    int range();
}
