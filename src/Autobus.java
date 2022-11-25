public class Autobus extends Samochod
{
    private int lMiejsc;

    public Autobus(String marka, double zuzyciePaliwa, int lMiejsc) {
        super(marka, zuzyciePaliwa);
        this.lMiejsc = lMiejsc;
        }


    @Override
    public double Koszt(double kilometry, double cena) {
        System.out.println(lMiejsc);

        return super.Koszt(kilometry, cena);
    }

}
