import java.util.*;
public class backchodi
{
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner scan = new Scanner(System.in);
    for(int i=0;i<6;i++)
    {
        arr[i]=scan.nextInt();

    }
    int i,cnt=0,cnt1=0,cnt2=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                cnt+=1;
            }
            else if(arr[i]<0)
            {
                cnt1+=1;
            }
            else
            {
                cnt2+=1;
            }
        }  
        System.out.println(arr.length);
        float a=0,b=0,c=0;
        
        System.out.printf("%1.6f\n",(float)cnt/arr.length);
        System.out.printf("%1.6f\n",(float)cnt1/arr.length);
        System.out.printf("%1.6f",(float)cnt2/arr.length);
        
    }
    
}