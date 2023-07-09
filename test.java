class calc
{
    public int add(int n1,int n2)
    {
        int result = n1+n2;
        return result;
    }

}

public class test{
    int a;
    String name;
    public static void main(String[] args)
    {
        int num=9;
        test obj = new test();
        System.out.println(obj.name);
        System.out.println(obj.a);
        calc obj2 = new calc();
        int result = obj2.add(4,3);
        System.out.println(result);
    }

}
