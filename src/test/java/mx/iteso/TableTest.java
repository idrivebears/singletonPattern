package mx.iteso;


import mx.iteso.singleton.tables.Table1;
import mx.iteso.singleton.TableOrder;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
/**
 * Created by Alex on 28/10/2015.
 */
public class TableTest {
    TableOrder order;
    TableOrder order2;

    @Before
    public void SetUp()
    {
        order = Table1.getInstance();
    }

    @Test
    public void Test()
    {
        assertNotNull(order);
        assertNull(order2);

        order2 = Table1.getInstance();
        assertNotNull(order2);

        assertEquals(order, order2);
    }
}

