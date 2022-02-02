package net.dobl;

public class App 
{
    public static void main( String[] args )
    {
        WR eur2yen = new EUR2YEN();
        WRAdapter wrAdapter = new WRAdapter(eur2yen);

        double[] arr = {10.0, 20.0, 5.0, 100.0};
        System.out.println(wrAdapter.sammelumrechnen("EUR2YEN", arr));
    }
}
