package FindMyTrain;
public class Train{
    private int TrainNumber;
    private String TrainName;
    private String TrainType;
    public Train(int TrainNumber, String TrainName, String TrainType) {
        this.TrainNumber = TrainNumber;
        this.TrainName = TrainName;
        this.TrainType = TrainType;
    }
    public int getTrainNumber() {
        return TrainNumber;
    }
    @Override
    public String toString() {
        return "Train [TrainName=" + TrainName + "]";
    }
    public void setTrainNumber(int trainNumber) {
        TrainNumber = trainNumber;
    }
    public String getTrainName() {
        return TrainName;
    }
    public void setTrainName(String trainName) {
        TrainName = trainName;
    }
    public String getTrainType() {
        return TrainType;
    }
    public void setTrainType(String trainType) {
        TrainType = trainType;
    }

    
}
