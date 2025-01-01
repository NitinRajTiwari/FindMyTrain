package FindMyTrain;
import java.util.*;
public class Station {
    private int StationNumber;
    private String StationName;
    private List<Platform> PlatformList;
    @Override
    public String toString() {
        return "Station [StationName=" + StationName + "]";
    }
    public Station(int stationNumber, String stationName) {
        StationNumber = stationNumber;
        StationName = stationName;
        this.PlatformList=new ArrayList<>();
    }
    public int getStationNumber() {
        return StationNumber;
    }
    public void setStationNumber(int stationNumber) {
        StationNumber = stationNumber;
    }
    public String getStationName() {
        return StationName;
    }
    public void setStationName(String stationName) {
        StationName = stationName;
    }
    public List<Platform> getPlatformList() {
        return PlatformList;
    }
    public void setPlatformList(List<Platform> platformList) {
        PlatformList = platformList;
    }

    
}
