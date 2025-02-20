import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MTBTestAnzTal
{

    @Test
    public void anzTal()
    {
        MTB mtb;

        mtb = new MTB("Rax easy");
        mtb.testdaten();
        assertEquals (3, mtb.anzTal());
    }
}