import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MTBTest
{
    @Test
    public void testAufschutten()
    {
        MTB mtb;

        mtb = new MTB("Rax easy");
        mtb.testdaten();
        System.out.println(mtb);
        System.out.println("===============================");
        mtb.aufschutten();
        System.out.println(mtb);
    }

    @Test
    void testSortBubble()
    {
        MTB mtb;

        mtb = new MTB("Rax easy");
        mtb.testdaten();
        System.out.println(mtb);
        System.out.println("===============================");
        mtb.sortBubble();
        System.out.println(mtb);
    }

    @Test
    public void testSortBubble2()
    {
        MTB mtb;

        mtb = new MTB("Rax easy");
        mtb.testdaten();
        System.out.println(mtb);
        System.out.println("===============================");
        mtb.sortBubble2();
        System.out.println(mtb);
    }

    @Test
    public void selectionSort()
    {
        MTB mtb;

        mtb = new MTB("Rax easy");
        mtb.testdaten();
        System.out.println(mtb);
        System.out.println("===============================");
        mtb.selectionSort();
        System.out.println(mtb);
    }
}