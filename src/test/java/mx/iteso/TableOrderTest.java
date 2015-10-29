package mx.iteso;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
/**
 * Created by Alex on 28/10/2015.
 */
public class TableOrderTest {

    TableOrder order;

    Dish myDish;
    Drink myDrink;

    @Before
    public void SetUp()
    {
        order = Table1.getInstance();
        myDish = new Dish();
        myDrink = new Drink();

        myDish.setName("Dishomato");
        myDish.setDescription("Imported Beef with a side of fries and tomato");
        myDish.setPrice(45.0f);
        myDish.setWaiter("Daniel Radcliffe");

        myDrink.setName("Drinkomato");
        myDrink.setDescription("Imported Beer with a slight taste of tomato");
        myDrink.setPrice(20.0f);
        myDrink.setWaiter("Daniel Radcliffe");
    }

    @Test
    public void TestAdditions()
    {
        order.addDish(myDish);
        order.addDish(myDish);
        order.addDrink(myDrink);
        order.addDrink(myDrink);

        assertEquals(2, order.drinks.size(), 0);
        assertEquals(2, order.dishes.size(), 0);
    }

}
