public class Samochod
{
    private String marka;
    private double zuzyciePaliwa;

    public Samochod(String marka, double zuzyciePaliwa)
    {
        this.marka = marka;
        this.zuzyciePaliwa = zuzyciePaliwa;
    }

    public Samochod()
    {
        this.marka = "";
        this.zuzyciePaliwa = 0;
    }

    public double Koszt(double kilometry, double cena)
    {
        double paliwo = (kilometry*cena);
        System.out.println(marka);
        System.out.println(zuzyciePaliwa);

        return paliwo;

    }
}
