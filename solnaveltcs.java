import java.util.*;

public class solnaveltcs extends navelvesseltcs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int vesselId,noOfVoyagesPlanned,noOfVoygesCompleted;
        String vesselName,purpose;
        navelvesseltcs[] nva = new navelvesseltcs[4];
        for(int i=0;i<4;i++)
        {
            vesselId = sc.nextInt();
            sc.nextLine();
            vesselName = sc.nextLine();
            noOfVoyagesPlanned = sc.nextInt();
            noOfVoygesCompleted = sc.nextInt();
            sc.nextLine();
            purpose = sc.nextLine();
            nva[i] = new navelvesseltcs(vesselId,vesselName,noOfVoyagesPlanned,noOfVoygesCompleted,purpose);

        }

        int getPercetangeValue = sc.nextInt();
        sc.nextLine();
        String getpurpose = sc.nextLine();

        int avgofvc = findAvgVoyagesByPct(nva, getPercetangeValue);
        if(avgofvc >0)
        {
            System.out.println(avgofvc);
        }
        else{
            System.out.println("no naval vessel aviailable");
        }
        navelvesseltcs nctcs = findVesselByGrade(getpurpose, nva);
        if(nctcs == null)
        {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
        else{
            System.out.println(nctcs.getvesselName()+"%" + nctcs.getclassification());
        }
        
    }

    public static int findAvgVoyagesByPct(navelvesseltcs[] nvarray,int percentage)
    {
        int avg=0,cnt=0;
        for(int i=0;i<nvarray.length;i++)
        {
            int percent = (nvarray[i].getnoOfVoyagesCompleted()*100)/nvarray[i].getnoOfVoyagesPlanned();
            if( percent >= percentage)
            {
                avg = (avg + nvarray[i].getnoOfVoyagesCompleted());
                cnt++;
            }  
        }
        if(cnt==0)
        {
            return 0;
        }
        else{
            return avg/cnt;
        }
    }
    public static navelvesseltcs findVesselByGrade(String purpose,navelvesseltcs[] nvary)
    {
        navelvesseltcs nv = new navelvesseltcs();
        for(int i=0;i<nvary.length;i++)
        {
            if(purpose.equalsIgnoreCase(nvary[i].getpurpose()))
            {
                int percentage = (nvary[i].getnoOfVoyagesCompleted()*100)/nvary[i].getnoOfVoyagesPlanned();
                if(percentage == 100)
                {
                    nvary[i].setClassification("Star");
                }
                else if(percentage>=80 && percentage<=99)
                {
                    nvary[i].setClassification("Leader");
                }
                else if(percentage >=55 && percentage<=79)
                {
                    nvary[i].setClassification("Inspirer");
                }
                else{
                    nvary[i].setClassification("Striver");
                   
                }
                nv = nvary[i];
                return nv;
            }
        }
        return null;
    }
}