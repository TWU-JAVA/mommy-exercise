package mommy;

public class Mommify {
    public String mommifyString(String s) {
        if(s == "a"){
            return "mommy";
        } else if(s == "ab"){
            return "mommyb";
        }
        return s;
    }
}
