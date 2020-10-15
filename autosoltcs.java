import java.*;
import java.util.Scanner;

public class autosoltcs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        autonomustcs[] ato = new autonomustcs[4];
        int carId;
        String brand;
        int noOfTestsConducted;
        int noOfTestsPassed;
        String environment;
        for(int i=0;i<4;i++)
        {
            carId = sc.nextInt();
            sc.nextLine();
            brand = sc.nextLine();
            noOfTestsConducted= sc.nextInt();
            noOfTestsPassed = sc.nextInt();
            sc.nextLine();
            environment= sc.nextLine();
            ato[i] = new autonomustcs(carId,brand,noOfTestsConducted,noOfTestsPassed,environment);

        }

        String getenviroment = sc.nextLine();
        String getbrand = sc.nextLine();
        sc.close();
        int totalpassed = findTestPassedByEnv(ato, getenviroment);
        if(totalpassed>0)
        {
            System.out.println(totalpassed);
        }
        else
        {
            System.out.println("no tests passed");
        }
        autonomustcs atsans= updateCarGrade(getbrand, ato);
        if(atsans==null)
        {
            System.out.println("no car aviailable");
        }
        else{
            System.out.println(atsans.getbrand()+"::"+atsans.getgrade());
        }
        
    }
    public static int findTestPassedByEnv(autonomustcs[] autonomus,String environment)
    {
        int sum =0;
        int cnt=0;
        for(int i=0;i<autonomus.length;i++)
        {
            if(environment.equalsIgnoreCase(autonomus[i].getenvironment()))
            {
                sum =sum + autonomus[i].getnoOfTestsPassed();
                cnt++;
            }
        }
        if(cnt==0)
        {
            return 0;
        }
        else{
            return sum;
        }
      

    }
    public static autonomustcs updateCarGrade(String brand,autonomustcs[] auto)
    {
        autonomustcs at = new autonomustcs();
        int rating;
        for(int i=0;i<auto.length;i++)
        {
            if(brand.equalsIgnoreCase(auto[i].getbrand()))
            {
                rating = (auto[i].noOfTestsPassed*100)/auto[i].noOfTestsConducted;
                if(rating>=80)
                {
                    auto[i].setgrade("A1");
                }
                else{
                    auto[i].setgrade("B2");
                }
                at = auto[i];
                return at;
            }
        }
        return null;
    }
    
}