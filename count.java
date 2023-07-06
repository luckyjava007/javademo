class dog
{
   public static int count =0;

    public dog()
   {
     count=count+1; 
   }

   public static int Run()
   {
       return count;
   }
}

public class count { 
    public static void main(String [] args)
    {
       dog d1 = new dog();
       dog d2 = new dog();
       dog d3 = new dog();
       dog d4 = new dog();
       dog d5 = new dog();
       System.out.println("the number of the object created are" + dog.Run());
    }
}
