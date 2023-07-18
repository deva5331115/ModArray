import java.util.Scanner;

public class ModArray {
    static int mod(int arr[],int div){
        int result=0,pow=1;
      for (int i=arr.length-1;i>=0;i--){
          result=(result+arr[i]*pow)%div;
          pow=pow*10%div;
      }
      return result;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();
        int array[]=new int[size];
        for (int i=0;i<size;i++){
            array[i]= scan.nextInt();
        }
        int Divisor= scan.nextInt();
        System.out.println(mod(array,Divisor));
    }
}
