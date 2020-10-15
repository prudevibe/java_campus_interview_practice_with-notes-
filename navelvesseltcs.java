import java.util.*;
public class navelvesseltcs {

    int vesselId;
    String vesselName;
    int noOfVoyagesPlanned;
    int noOfVoyagesCompleted;
    String purpose;
    String classification;

    navelvesseltcs()
    {

    }
    navelvesseltcs(int vesselId, String vesselName, int noOfVoyagesPlanned,int noOfVoyagesCompleted,String purpose)
    {
        super();
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose=purpose;
    }
    int getvesselId()
    {
        return vesselId;
    }
    String getvesselName()
    {
        return vesselName;
    }
    int getnoOfVoyagesPlanned()
    {
        return noOfVoyagesPlanned;
    }
    int getnoOfVoyagesCompleted()
    {
        return noOfVoyagesCompleted;
    }
    String getpurpose()
    {
        return purpose;
    }
    void setClassification(String classification)
    {
        this.classification = classification;
    }
    String getclassification()
    {
        return classification;
    }
    

    
}