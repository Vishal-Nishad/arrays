package DSA.arrays;
public class linearsearch{
    public static int linearsearchindex(int number[],int key){
        for (int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }return -1;
    }
    public static void  main(String args[]){
        int number[]={2,4,6,8,10,12,14,16,18,20};
        int key=6;
        int index=linearsearchindex(number, key);
        if(index==-1){
             System.out.println("number not found.");

        }else{
            System.out.println("index of number "+key+" is : "+index);
            
        }

    }
}