class A 
{
    int a,b,sum;
    public int add()
    {
        a = 10;
        b = 15;
        sum = a+b;
        return sum;
    }
}
class B 
{
    public static void main(String[] args) {
        A obj = new A();
        int result = obj.add();
        System.out.println("sum of two numbers"+result);
    }
}