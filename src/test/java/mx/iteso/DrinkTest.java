package mx.iteso;

import mx.iteso.singleton.Drink;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by Alex on 28/10/2015.
 */
public class DrinkTest {

    Drink myDrink;

    float value;
    String description;
    String name;
    String waiter;

    @Before
    public void SetUp()
    {
        value = 3.59f;
        description = "Nice drink";
        name = "Beer";
        waiter = "Ron Weasley";

        myDrink = new Drink();

        myDrink.setPrice(value);
        myDrink.setName(name);
        myDrink.setDescription(description);
        myDrink.setWaiter(waiter);
    }

    @Test
    public void Test()
    {
        assertEquals(value, myDrink.getPrice(), 0);
        assertEquals(name, myDrink.getName());
        assertEquals(description, myDrink.getDescription());
        assertEquals(waiter, myDrink.getWaiter());
    }
}
