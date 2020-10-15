import java.util.*;
public class sol_mob_tcs extends MOBILE_TCS{

    public static void main(final String[] args) {

        final Scanner sc = new Scanner(System.in);
        final MOBILE_TCS[] mts = new MOBILE_TCS[5];
        for(int i=0;i<5;i++)
        {
            final String iMEICode = sc.nextLine();
            final boolean isSingleSim = sc.nextBoolean();
            sc.nextLine();
            final String processor = sc.nextLine();
            final double price = sc.nextDouble();
            sc.nextLine();
            final String manufacturer = sc.nextLine();
            mts[i]= new MOBILE_TCS(iMEICode,isSingleSim,processor,price,manufacturer);
        }
        final double dis = sc.nextDouble();
        sc.nextLine();
        final String getbrand = sc.nextLine();
        final int op1 = getCountOfValidIMEIMobiles(mts);
        MOBILE_TCS mbtcs = new MOBILE_TCS();
        mbtcs = findMobileWithMaxPrice(mts, dis, getbrand);
        System.out.println(op1);
        System.out.println(mbtcs.getmanufacturer() + "@" +mbtcs.getPrice());

        
    }
    public static int getCountOfValidIMEIMobiles(final MOBILE_TCS[] mobile)
    {
        int cnt=0;
        for(int i=0;i<mobile.length;i++)
        {
            if(mobile[i].getIMEICode().length() == 15 && mobile[i].getisSingleSim()== false)
            {
                cnt++;
            }
        }
        if(cnt>0)
        {
            return cnt;
        }
        else{
            return null;
        }
    }
    public static MOBILE_TCS findMobileWithMaxPrice(final MOBILE_TCS[] mbs,final double discountPer,final String manufacturerName)
    {
        
        final MOBILE_TCS[] armob = new MOBILE_TCS[5];
        for(int j=0;j<armob.length;j++)
        {
            armob[j] = new MOBILE_TCS("",true,"",0,"");
        }

        double newPrice;
        int k =0;
        for(int i=0;i<mbs.length;i++)
        {
            if(mbs[i].getmanufacturer().equalsIgnoreCase(manufacturerName))
            {
                newPrice = mbs[i].getPrice() - ((mbs[i].getPrice()*discountPer)/100);
                armob[k++] = new MOBILE_TCS(mbs[i].getIMEICode(),mbs[i].getisSingleSim(),mbs[i].getprocessor(),mbs[i].setPrice(newPrice),mbs[i].getmanufacturer()); 
            }
        }
        int t;
        MOBILE_TCS temp = new MOBILE_TCS();
        for(int a=0;a<armob.length-1;a++)
        {
            t=a;
            for(int b=a+1;b<armob.length;b++)
            {
                if(armob[b].getPrice()>armob[t].getPrice())
                {
                    t=b;
                }
               
            }
            temp = armob[a];
            armob[a] = armob[t];
            armob[t]= temp;
        }
        if(armob[0].getPrice()>0)
        {
            return armob[0];
        }
        else{
            return null;
        }


    }

}