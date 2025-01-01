package FindMyTrain;

public class Platform {
    private int PlatformNumber;
    private Train train;
    private Station station;
    
    Platform(int PlatfromNumber){
        this.PlatformNumber=PlatfromNumber;
    }

    public int getPlatformNumber() {
        return PlatformNumber;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public void setPlatformNumber(int platformNumber) {
        PlatformNumber = platformNumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platform [PlatformNumber=" + PlatformNumber + "]";
    }
    
}
