package sort;

import java.util.Scanner;

public class BubbleSort {
//    private int y;
//    private String s;
//    public int getY(){
//        return y;
//    }
//    public void setY(){
//        this.y=y;
//    }
//    public String getS(){
//        return s;
//    }
//    public void setS(){
//        this.s=s;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a=new int[n];
        String[]c=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            c[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
               if(a[j]>a[j+1]){
                   int x = a[j+1];
                   a[j+1]=a[j];
                   a[j]=x;
                   String d = c[j+1];
                   c[j+1] = c[j];
                   c[j]=d;
               }
            }
            }
        for(int i=0;i<n;i++){
            System.out.println(a[i]+"  "+c[i]);

        }
        }
    }

