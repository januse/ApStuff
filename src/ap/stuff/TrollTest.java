package ap.stuff;
public class TrollTest {
    public static void main(String args []) {
        Troll bobby = new Troll();
        Troll jimmy = new Troll();
        Troll SwavadiansonRex = new Troll();
        bobby.collect(6.9);
        jimmy.collect(3.3);
        SwavadiansonRex.collect(420.420);
        System.out.println(bobby.myMoney());
        System.out.println(jimmy.myMoney());
        System.out.println(SwavadiansonRex.myMoney());
        Troll.emptyTreasury();
        System.out.println(Troll.treasury());
        
    }
    
    
}
