public class MultiplicationTable
{
    public static void main(String[] args)
    {
        for (int row = 1; row <= 12; row ++)
        {
            System.out.print("|");
            for (int col = 1; col <= 12; col ++)
            {
                System.out.printf("%4d |", row * col);
            }
            System.out.println();
        }
    }
}
