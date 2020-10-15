import java.util.*;

import sun.jvm.hotspot.utilities.IntArray;
public class sorting {
    //quick sort
    public void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b= temp;
    }
    public int partition(int left,int right,int pivot)
    {
        int leftpoint = left-1;
        int rigthpoint = right;
        while(true)
        {
            while(intar[++leftpoint]<pivot)
            {
                //do nothing
            }
            while(rigthpoint>0 && intar[--rigthpoint]>pivot)
            {
                //do nothing
            }
            if(leftpoint>rigthpoint)
            {
                break;
            }
            else
            {
                swap(leftpoint, rigthpoint);
            }
            swap(leftpoint,right);
            return leftpoint;

        }
    }
    public void quickSort(int left,int right)
    {
        if(right-left<=0)
        {
            return;
        }
        else{
            int pivot = intar[right];
            int partitionpoint = partition(left, right, pivot);
            quickSort(left, partitionpoint-1);
            quickSort(partitionpoint+1, right);
        }
    }
        //bubble sort
        public void bubble_sort(int[] ar)
        {
            int n = ar.length;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n-i-1;j++)
                {
                    if(ar[j]>ar[j+1])
                    {
                        swap(ar[j], ar[j+1]);
                    }
                }
            }
        }
        public void insertion_sort(int ar[])
        {
            int i,key,j;
            for(i=1;i<n;i++)
            {
                key = ar[i]
                j = i -1;
                while(j>=0 && ar[j]>key)
                {
                    ar[j+1] = ar[j];
                    j = j-1;
                }
                ar[j+1] = key;
            }
        }


    
}