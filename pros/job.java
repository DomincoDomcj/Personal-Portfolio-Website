class job
{
void multiply(int a, int b)
{
    System.out.println("result is"+(a*b));
}
void multiply(int a, int b, int c)
{
    System.out.println("Result is"+(a*b*c));
}
public static void main(String[] args) 
{
    
    job obj = new job();
    obj.multiply(8,5);
    obj.multiply(4,6,2);
    
}
}
