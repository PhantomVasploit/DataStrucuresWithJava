import DataStructures.Array;

public class Main
{
    public static void main(String args[])
    {
        Array integers = new Array(3);
        integers.insert(1);
        integers.insert(2);
        integers.insert(3);
        integers.insert(4);
        integers.insert(5);
        integers.removeAt(2);
        System.out.println(integers.indexOf(5));
        integers.print();
    }
}