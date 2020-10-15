import java.util.*;
public class tcsSolutiontravel extends travelagencies {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int regNo;
        String agencyName;
        String packageType;
        int price;
        boolean flightFacility;

        travelagencies[]  ta = new travelagencies[4];

        for(int i=0;i<4;i++)
        {
            regNo = sc.nextInt();
            sc.nextLine();
            agencyName = sc.nextLine();
            packageType =sc.nextLine();
            price = sc.nextInt();
            flightFacility = sc.nextBoolean();
            ta[i] = new travelagencies(regNo,agencyName,packageType,price,flightFacility);

        }

        int getregNo = sc.nextInt();
        sc.nextLine();
        String getpakageType = sc.nextLine();
        sc.close();

        int highestPackagePrice= findAgencyWithHighestPackagePrice(ta);
        travelagencies travel = agencyDetailsforGivenIdandtype(ta, getregNo, getpakageType);


        System.out.println(highestPackagePrice);
        if(travel == null)
        {
            System.out.println("A string value should be printed here!"); 
        }
        else{
            System.out.println(travel.getagencyName()+":"+travel.getprice());
        }
        
    }
    public static int findAgencyWithHighestPackagePrice(travelagencies[] agencies)
    {
        int maxPrice = agencies[0].getprice();
        for(int i=0;i<agencies.length;i++)
        {
            if(agencies[i].getprice()> maxPrice)
            {
                maxPrice = agencies[i].getprice();
            }
        }
        return maxPrice;

    }
    public static travelagencies agencyDetailsforGivenIdandtype(travelagencies[] agencies,int regNo,String pakageType)
    {
        travelagencies ta = new travelagencies();
        for(int i=0;i<agencies.length;i++)
        {
            if(agencies[i].getflightFacility())
            {
                if(agencies[i].getregNo()==regNo && pakageType.equalsIgnoreCase(agencies[i].getpakageType()))
                {
                    ta = agencies[i];
                    return ta;
                }
            }
        }
        return null;
    }
}