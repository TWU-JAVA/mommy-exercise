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

    @Test
    public void shouldMommifySingleVowel(){
        Mommify mommify = new Mommify();
        String mommified = mommify.mommifyString("a");
        assertEquals("mommy",mommified);
    }

    @Test
    public void shouldMommifySingleVowelConsonant(){
        Mommify mommify = new Mommify();
        String mommified = mommify.mommifyString("ab");
        assertEquals("mommyb",mommified);
    }
}
