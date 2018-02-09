public class buttonTest {
    public static void main (String args []) {
        MurderButton butt = new MurderButton();
        butt.push();
        System.out.println(butt.buttonState());
        System.out.println(butt.buttonState());
        butt.push();
        System.out.println(butt.buttonState());
    }
}
