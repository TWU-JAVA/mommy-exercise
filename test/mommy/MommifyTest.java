package mommy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MommifyTest {


    private String getMommifiedString(String s) {
        Mommify mommify = new Mommify();
        return mommify.mommifyString(s);
    }

    @Test
    public void shouldNotMommifyEmptyString() {
        String mommified = getMommifiedString("");
        assertEquals("", mommified);
    }

    @Test
    public void shouldNotMommifySingleConsonant() {
        String mommified = getMommifiedString("b");
        assertEquals("b", mommified);
    }

    @Test
    public void shouldMommifySingleVowel() {
        String mommified = getMommifiedString("a");
        assertEquals("mommy", mommified);
    }

    @Test
    public void shouldMommifySingleVowelConsonant() {
        String mommified = getMommifiedString("ab");
        assertEquals("mommyb", mommified);
    }

    @Test
    public void shouldMommifyAllVowelString() {
        String mommified = getMommifiedString("ae");
        assertEquals("mommy", mommified);
    }

    @Test
    public void shouldMommifyStringWithUpTo30PercentContinuousVowels(){
        String mommified = getMommifiedString("hear");
        assertEquals("hmommyr",mommified);
    }

    //@Test
    //public void shouldNotMommifyStringWith30Percent
}
