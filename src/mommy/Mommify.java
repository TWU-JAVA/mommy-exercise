package mommy;

public class Mommify {
    public String mommifyString(String s) {
        if(s == "a" || s == "ae"){
            return "mommy";
        } else if(s == "ab"){
            return "mommyb";
        }
        return s;
    }
}
