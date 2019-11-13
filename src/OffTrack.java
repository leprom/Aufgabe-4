public abstract class OffTrack extends Transport{
    /**
     * Interfaces describes transport vehicle that is not tied to tracks, but runs on any sufficiently firm surface (usually on a road).
     * @return range must be > 10 , usually way more bigger than 10.
     */

    public OffTrack(){

    }
    public int range(){
        return 0;
    }
}
