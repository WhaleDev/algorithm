package sort;

import java.util.Scanner;

public class QuickSort {
    public void quickSort(int[]a,int left,int right)
    {
        if(left>right)
            return;
        int pivot=a[left];//定义基准值为数组第一个数
        int i=left;
        int j=right;

        while(i<j)
        {
            while(pivot<=a[j]&&i<j)//从右往左找比基准值小的数
                j--;
            while(pivot>=a[i]&&i<j)//从左往右找比基准值大的数
                i++;
            if(i<j)                     //如果i<j，交换它们
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        a[left]=a[i];
        a[i]=pivot;//把基准值放到合适的位置
        quickSort(a,left,i-1);//对左边的子数组进行快速排序
        quickSort(a,i+1,right);//对右边的子数组进行快速排序
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a =new int[n];
        for(int i= 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        QuickSort S = new QuickSort();
        S.quickSort(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

    }
}



