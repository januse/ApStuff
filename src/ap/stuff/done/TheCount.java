package ap.stuff.done;
public class TheCount {
    private int num;
    public String getNumber() {
        num ++;
        return(num - 1 + "! A-HA-HA!");
    }
    public void setNumber(int n) {
        num = n;
    }
}