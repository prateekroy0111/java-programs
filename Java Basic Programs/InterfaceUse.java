interface printable
{
    void print();
}

public class InterfaceUse implements printable
{
    public void print()
    {
        System.out.println("hello print fn");
    }
    public static void main(String[] args)
    {
        InterfaceUse d=new InterfaceUse();
        d.print();
    } 
}

