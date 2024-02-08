package DSA.arrays;
import java.util.Scanner;
public class reverse{
    public static void rev(int num[]){
        int first=0, last=num.length-1;
        while(first<last){
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;
            first++;
            last --;
        }
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10,12,14,16,18};
        rev(num);
        for(int i=0;i<num.length;i++){
        System.out.print(num[i]+" ");
    }}
}