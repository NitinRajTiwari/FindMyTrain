package FindMyTrain;

public class Schedule {
    private Train train;
    private Platform platform;
    private Station station;
    private String Arrival;
    private String Departure;
    public Schedule(Train train, Platform platform, Station station, String arrival, String departure) {
        this.train = train;
        this.platform = platform;
        this.station = station;
        Arrival = arrival;
        Departure = departure;
    }
    public Train getTrain() {
        return train;
    }
    public void setTrain(Train train) {
        this.train = train;
    }
    public Platform getPlatform() {
        return platform;
    }
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }
    public Station getStation() {
        return station;
    }
    public void setStation(Station station) {
        this.station = station;
    }
    public String getArrival() {
        return Arrival;
    }
    public void setArrival(String arrival) {
        Arrival = arrival;
    }
    public String getDeparture() {
        return Departure;
    }
    public void setDeparture(String departure) {
        Departure = departure;
    }
    @Override
    public String toString() {
        return "Schedule [train=" + train + ", platform=" + platform + ", station=" + station + ", Arrival=" + Arrival
                + ", Departure=" + Departure + "]";
    }
    
    


    
}
