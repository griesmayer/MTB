import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MTBTestMaxSteigung
{
    @Test
    public void maxSteigung()
    {
        MTB mtb;

        mtb = new MTB("Rax easy");
        mtb.testdaten();
        assertEquals (60, mtb.maxSteigung());
    }

    @Test
    public void maxSteigung2()
    {
        MTB mtb;

        mtb = new MTB("Rax easy");
        mtb.testdaten2();
        assertEquals (110, mtb.maxSteigung());
    }

    @Test
    public void maxSteigung4()
    {
        MTB mtb;

        mtb = new MTB("Rax easy");
        mtb.testdaten4();
        assertEquals (-999, mtb.maxSteigung());
    }

}