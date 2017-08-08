package models;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by Guest on 8/8/17.
 */
public class BeerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        Beer.clearAllPosts(); //I clear out allll the posts before each test.
    }


    @Test
    public void IfItIsInstance_True()  throws Exception  {
        Beer testBeer =  new Beer("10Barrel");
        assertEquals(true, testBeer instanceof Beer);
    }
    @Test
    public void DoesYourBeerInstantiatesWithContent_True() throws Exception    {
        Beer testBeer = new Beer ("Deschutes");
        assertEquals("Deschutes",testBeer.getBeerName());
    }
    @Test
    public void AllPostsAreCorrectlyReturned_True() {
        Beer testBeer = new Beer ("10 Barrel");
        Beer testBeer2 = new Beer ("Deschutes");
        assertEquals(2,Beer.getAll().size());
    }
}