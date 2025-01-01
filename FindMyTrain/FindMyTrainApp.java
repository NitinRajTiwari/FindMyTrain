package FindMyTrain;

import java.util.Scanner;
import java.util.*;
public class FindMyTrainApp {
    public static void main(String[] args) {
        TrainSystem trainSystem=new TrainSystem();
        //  creating Trains
        Train SKP=new Train(1231,"Sampurna kranti","Express");
        Train RJD=new Train(1232,"RajdhaniExpress","SuperFast");
        Train INCT=new Train(1233,"Intercity","passenger");
        Train TEJAS=new Train(1234,"tejas","Express");
        Train GRB=new Train(1235,"Graibrath","SuperFast");
        Train GOODS=new Train(1236,"GoodsExpress","Goods");

        // Adding Trains to system
        trainSystem.addTrain(SKP);
        trainSystem.addTrain(RJD);
        trainSystem.addTrain(INCT);
        trainSystem.addTrain(TEJAS);
        trainSystem.addTrain(GRB);
        trainSystem.addTrain(GOODS);

        // Creating platform
        Station NDLS=new Station(53451, "NDLS");

        Station Patna=new Station(53452, "Patna");
        
        Station Ranchi=new Station(53451, "Ranchi");

        Station Mumbai=new Station(53452, "Mumbai");
        trainSystem.addStation(NDLS);
        trainSystem.addStation(Patna);
        trainSystem.addStation(Ranchi);
        trainSystem.addStation(Mumbai);


        Platform ps11=new Platform(1);
        ps11.setStation(NDLS);
        ps11.setTrain(SKP);
        Platform ps12=new Platform(2);
        ps12.setStation(NDLS);
        ps12.setTrain(RJD);
        Platform ps13=new Platform(3);
        ps13.setStation(NDLS);
        ps13.setTrain(GRB);
        Platform ps14=new Platform(4);
        ps14.setStation(NDLS);
        ps14.setTrain(GOODS);
        NDLS.setPlatformList(Arrays.asList(ps11,ps12,ps13,ps14));

        Platform ps21=new Platform(1);
        ps21.setStation(Patna);
        ps21.setTrain(SKP);
        Platform ps22=new Platform(2);
        ps22.setStation(Patna);
        ps22.setTrain(INCT);
        Patna.setPlatformList(Arrays.asList(ps21,ps22));

        Platform ps31=new Platform(1);
        ps31.setStation(Ranchi);
        ps31.setTrain(GRB);
        Platform ps32=new Platform(2);
        ps32.setStation(Ranchi);
        ps32.setTrain(INCT);
        Ranchi.setPlatformList(Arrays.asList(ps31,ps32));
        
        Platform ps41=new Platform(1);
        ps41.setStation(Mumbai);

        Platform ps42=new Platform(2);
        ps42.setStation(Mumbai);
        ps42.setTrain(RJD);
        Platform ps43=new Platform(3);
        ps43.setStation(Mumbai);

        Platform ps44=new Platform(4);
        ps44.setStation(Mumbai);
        ps44.setTrain(GOODS);
        Mumbai.setPlatformList(Arrays.asList(ps42,ps44));

        

        Schedule s1=new Schedule(SKP, ps11, NDLS, "10PM", "10:05 PM");
        Schedule s2=new Schedule(RJD, ps12, NDLS, "10:12AM", "10:25 AM");
        Schedule s3=new Schedule(GRB, ps13, NDLS, "9:45pm", "10:05PM");
        Schedule s4=new Schedule(GOODS, ps14, NDLS, "9:00pm", "9:50PM");
        Schedule s5=new Schedule(SKP, ps21, Patna, "8Am", "--");
        Schedule s6=new Schedule(INCT, ps22, Patna, "9:00pm", "9:50PM");
        Schedule s7=new Schedule(RJD, ps42, Mumbai, "9PM", "--");
        Schedule s8=new Schedule(GOODS, ps44, Mumbai, "10:00pm", "--");
        Schedule s9=new Schedule(GRB, ps31, Ranchi, "9PM", "--");
        Schedule s10=new Schedule(INCT, ps32, Ranchi, "6am", "--");

        trainSystem.addSchedule(Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10));

        // Scanner scanner=new Scanner(System.in);
        // System.out.println("Enter source station");
        // String source=scanner.nextLine();
        // System.out.println("Enter Destination station");
        // String dest=scanner.nextLine();
        // trainSystem.Search(source, dest);
        // scanner.close();
        trainSystem.Search("NDLS", "Mumbai");

    }
}
