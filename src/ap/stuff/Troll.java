package ap.stuff;
public class Troll {
    static double treasury;
    double myMoney;
    public void collect(double money) {myMoney = money + myMoney; treasury = treasury + money;}
    public double myMoney() {return myMoney;}
    public static double treasury() {return treasury;}
    public static void emptyTreasury() {treasury = 0;}
}
