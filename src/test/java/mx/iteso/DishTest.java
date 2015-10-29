package mx.iteso;


import mx.iteso.singleton.Dish;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
/**
 * Created by Alex on 28/10/2015.
 */
public class DishTest {

    Dish myDish;

    float value;
    String description;
    String name;
    String waiter;

    @Before
    public void SetUp()
    {
        value = 5.20f;
        description = "Yummy dish";
        name = "Lassagna";
        waiter = "Hermione Granger";

        myDish = new Dish();

        myDish.setPrice(value);
        myDish.setName(name);
        myDish.setDescription(description);
        myDish.setWaiter(waiter);
    }

    @Test
    public void Test()
    {
        assertEquals(value, myDish.getPrice(),0);
        assertEquals(name, myDish.getName());
        assertEquals(description, myDish.getDescription());
        assertEquals(waiter, myDish.getWaiter());
    }

}
