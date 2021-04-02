package Day9;

public class ThisDemo3
{
    public void display ()
    {
        System.out.println("I am form Nepal. Where you from?");
    }

    public void print(ThisDemo3 ob) //in java we can give class name as arguments
    {
        ob.display();
    }
    public void greet ()
    {
      //    ThisDemo3 ob = new ThisDemo3();
        //  print(ob);
        print(this); //this refers to  the current object

    }
    public static void main (String [] arg)
    {
        ThisDemo3 ob = new ThisDemo3();
        ob.greet();
    }

}
