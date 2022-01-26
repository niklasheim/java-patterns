package net.dobl;

public class App 
{
    public static void main( String[] args )
    {
        WR euro2dollar = new WR.WRBuilder().withBetrag(100).withVariante("EURO2Dollar").withType(new EURO2Dollar()).build();
        WR euro2yen = new WR.WRBuilder().withBetrag(100).withVariante("EUR2YEN").withType(new EUR2YEN()).withNext(euro2dollar).build();

        System.out.println(euro2yen.umrechnen());
    }
}
