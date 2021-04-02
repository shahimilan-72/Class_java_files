package Day10;

public class ArrayDemo9
{
    public static void main(String[] args)
    {
        String [] [] names = new String[][]{{"Ram", "Shyam","Hari"},{"Mohan","Gopal","Baje"},{"Krishna","Gita","Rita"}};

        for (int i=0; i<names.length; i++)
        {
            for (int j=0; j<names.length; j++)
            {
                System.out.print(names [i] [j]+ "  ");

            }
            System.out.println();

        }

    }

}
