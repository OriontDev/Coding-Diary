@SuppressWarnings("unused")

abstract class BangunDatar {
    abstract double luas();
    abstract double keliling();
}
class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    double luas(){
        return sisi*sisi;
    }

    @Override
    double keliling(){
        return sisi*4;
    }

}

public class Main {
    public static void main(String[] args) {

        Persegi myPersegi = new Persegi(2.0);
        System.out.println("Kelilin persegi adalah : "+myPersegi.keliling());
        System.out.println("Luas persegi adalah : "+myPersegi.luas());
        myPersegi.setSisi(10.5);
        System.out.println("Kelilin persegi adalah : "+myPersegi.keliling());
        System.out.println("Luas persegi adalah : "+myPersegi.luas());
    }
}
