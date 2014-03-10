public class HammingS74 {

    public static void main(String[] args) {
        int[] kod = {1, 1, 0, 1};
        Korekcija kod1 = new Korekcija(kod);
        kod1.konstruisi();
        kod1.prikazi();
        kod1.randomGreska();
        kod1.prikazi();
        kod1.verifikuj();
        kod1.koriguj();
        kod1.prikazi();
    }
    
}
