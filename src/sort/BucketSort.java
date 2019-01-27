package sort;

import org.junit.Test;

import java.util.Scanner;

public class BucketSort{
    public static void main(String[] args) {
        int []a = new int[10001];
        for(int i=0;i<10001;i++){
            a[i] = 0;
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            a[x]++;
        }
        for(int i=0 ;i<10001;i++){
            for(int j=0;j<a[i];j++){
                System.out.println(i);
            }



        }

    }



}
