package FindMyTrain;

import java.util.*;

public class TrainSystem {
    private Map<String,Train> TrainMap=new HashMap<>();
    private Map<String,Station> StationMap=new HashMap<>();
    private List<Schedule> Schedules=new ArrayList<>();
    public Map<String, Train> getTrains() {
        return TrainMap;
    }
    public void addTrain(Train train) {
        TrainMap.put(train.getTrainName(),train);
    }
    public Map<String, Station> getStations() {
        return StationMap;
    }
    public void addStation(Station station) {
        StationMap.put(station.getStationName(),station);
    }
    public List<Schedule> getSchedules() {
        return Schedules;
    }
    public void addSchedule(Schedule schedule) {
        Schedules.add(schedule);
    }
    public void addSchedule(List<Schedule> l) {
        Schedules.addAll(l);
    }
    public void Search(String Source,String Destination){
        List<Schedule> tempSchedules=new ArrayList<>();
        for(Schedule schedule:Schedules){
            String station=schedule.getStation().getStationName();
            if(station.equals(Source)){
                tempSchedules.add(schedule);
            }
        }
        for(Schedule schedule:tempSchedules){
             int tnum=schedule.getTrain().getTrainNumber();
            // if(station.equals(Destination)){
            //     System.out.println(schedule);
            // }
            Station dest=StationMap.get(Destination);
            for(Platform plt:dest.getPlatformList()){
                if(plt.getTrain().getTrainNumber()==tnum){
                System.out.println("Train Number:"+schedule.getTrain().getTrainNumber()+" Train Name:"+schedule.getTrain().getTrainName());
                }
            }
        }
        tempSchedules.clear();
    }

}
