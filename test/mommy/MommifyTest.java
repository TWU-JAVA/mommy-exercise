package mommy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MommifyTest {
    @Test
    public void shouldNotMommifyEmptyString(){
        Mommify mommify = new Mommify();
        String mommified = mommify.mommifyString("");
        assertEquals("",mommified);
    }

    @Test
    public void shouldNotMommifySingleConsonant(){
        Mommify mommify = new Mommify();
        String mommified = mommify.mommifyString("b");
        assertEquals("b",mommified);
    }
}
