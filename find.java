class calculator {
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
    float add(float c , float d)
    {
        return c+d;
    }
    float add(float c, float d, float e)
    {
        return c+d+e;
    }
}
class find
{
    public static void main(String args[])
    {
        calculator obj =new calculator();

        System.out.println(obj.add(55,54));
        System.out.println(obj.add(45,48,56));
        System.out.println(obj.add(56,4));
        System.out.println(obj.add(58,11,5));
    }
}
