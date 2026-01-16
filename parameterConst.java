class car 
{
    private String model;
    private String color;

    car (String m ,String c)
    {
        model = m;
        color = c;
    }
    public void showInfo()
    {
        System.out.println("model:"+model);
        System.out.println("color:"+color);
    }
}
class CarDemo
{
    public static void main(String[] args) {
        car car1 = new car("BMW","black");
        car car2 = new car("audi","white");
        car1.showInfo();
        car2.showInfo();
    }
}