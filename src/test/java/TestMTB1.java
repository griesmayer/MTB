public class TestMTB1
{
    public static void main(String[] args)
    {
        MTB mtb;

        mtb = new MTB("Rax easy");
        mtb.testdaten();
        System.out.println( mtb.toString() );
        System.out.println( mtb.maxHohe() );            // 210
    }
}
