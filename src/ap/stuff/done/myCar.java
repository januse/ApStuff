package ap.stuff.done;
public class myCar extends Car {
    String coolDecal;
    
    public String honk() {
        return "Gichy Gichy Goo";
    }
    public void crash() {
        wheels = wheels - 2;
        legroom = legroom * .25;
        horsepower = horsepower/2;
    }
    public void paintJob(String decal) {
        coolDecal = decal;
    }
    public String translateHonk() {
        return "I Love You";
    }
}
