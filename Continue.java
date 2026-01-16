class Doit
{
    public static void main(String[] args) 
    {
    int num[]={10,20,30,40,50};
    for(int x:num)
    {
        if(x==30)
        {
            System.out.println("hello bro");
            continue;
        }
        System.out.println(x);
    }    
    System.out.println("bye see you");
    }
}