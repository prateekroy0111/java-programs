interface printable
{
    void print();
}
interface showable extends printable
{
    void show();
}
public class InterfaceUse2 implements showable
{
    public void print()
    {
        System.out.println("hello print fn");
    }
    public void show()
    {
        System.out.println("hello show fn");
    }
    public static void main(String[] args)
    {
        InterfaceUse d=new InterfaceUse();
        d.print();
        d.show();
    } 
}

