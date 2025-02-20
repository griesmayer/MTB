import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MTBTestInsert
{
    @Test
    public void testInsert1()
    {
        MTB mtb;

        mtb = new MTB("Rax easy");
        mtb.testdaten();
        mtb.insert(220, 5);
        System.out.println(mtb);
    }

    @Test
    public void testInsert2()
    {
        MTB mtb;

        mtb = new MTB("Rax easy");
        mtb.testdaten();
        mtb.insert(220, 5);
        mtb.insert(300, -1);
        mtb.insert(300, 13);
        mtb.insert(400, 6);
        mtb.insert(250, 0);
        mtb.insert(300, 2);
        mtb.insert(350, 4);
        mtb.insert(400, 6);
        mtb.insert(450, 8);
        System.out.println(mtb);
    }
}