class Throow
{
public static void main(String[] args) {
    int i = 20;
    int j = 0;
    try{
        j = 18/i;
        if(j==0)
            throw new ArithmeticException("i don`t print zero");
    }
    catch(ArithmeticException e)
    {
        j = 100;
        System.out.println("cannot divide by zero"+e);
    }
    System.out.println(j);
    System.out.println("bye");
}
}