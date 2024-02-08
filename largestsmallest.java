package DSA.arrays;
public class largestsmallest{
    public static int getlargest(int number []){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int i=0;
        for( i=0;i<number.length;i++){
            if(number[i]>largest){
                largest=number[i];
            }
            if(smallest>number[i]){
                smallest=number[i];
            }
        }System.out.println(i);
        System.out.println(number.length);
        System.out.println("smallest number is :"+smallest);
        return largest;
    }
    public static void main(String args[]){
        int number[]={3,5,2,1,4,6,7,9};
        System.out.println("largest number is :"+getlargest(number));
    }
}