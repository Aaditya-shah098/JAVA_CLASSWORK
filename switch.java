class Test
{
    public static void main(String[] args) {
        char grade = 'b';
        switch (grade) {
            case 'a':
                System.out.println("excellent");
                
                break;
        
            case 'b':
                System.out.println("very good");
                break;

            case 'c':
                System.out.println("average");
                break;
            
            default:
                System.out.println("you are not here");
        }
        System.out.println("your grade is "+grade);    
    }
}