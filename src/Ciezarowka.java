public class Ciezarowka extends Samochod
{
    private double nosnosc;

    public Ciezarowka(String marka, double zuzyciePaliwa, double nosnosc) {
        super(marka, zuzyciePaliwa);
        this.nosnosc = nosnosc;
    }

    @Override
    public double Koszt(double kilometry, double cena) {
        System.out.println(nosnosc);

        return super.Koszt(kilometry, cena);


    }
}
