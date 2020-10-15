import java.util.*;

public class travelagencies {

    int regNo;
    String agencyName;
    String pakageType;
    int price;
    boolean flightFacility;
    travelagencies()
    {

    }


    travelagencies(int regNo, String agencyName,String pakageType,int price,boolean flightFacility)
    {
        super();
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.pakageType = pakageType;
        this.price =price;
        this.flightFacility = flightFacility;
    }
    int getregNo()
    {
        return regNo;
    }
    String getagencyName()
    {
        return agencyName;
    }
    String getpakageType()
    {
        return pakageType;
    }
    int getprice()
    {
        return price;
    }
    boolean getflightFacility()
    {
        return flightFacility;
    }
    
}