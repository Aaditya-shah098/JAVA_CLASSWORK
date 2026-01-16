class handling_exception
{
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try{
            j = 18/i;
        }
        catch(Exception e)
        {
            System.out.println("something is wrong here"+e);
        }
        System.out.println(j);
        System.out.println("bye see you");
    }
}