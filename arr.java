import java.util.Scanner;

public class arr {
    public static void main(String [] args)
    { 
        int result = 0;
        int [] a = new int[10];
       Scanner sc = new Scanner(System.in);
        for(int i=0; i<10 ; i++)
        {
        System.out.println("enter the value at index "+ i + " of the array");
        int n = sc.nextInt();
        a[i]=n;
        }

        for(int i=0; i<10 ; i++)
        {
            result = result + a[i];
        }
        
        System.out.println("the result of addition of the elements of the array is:" + result);
    }
    
    
}
