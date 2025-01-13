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
    double keliling(){
        return sisi*4;
    }

    @Override
    double luas(){
        return sisi*sisi;
    }


}
class Lingkaran extends BangunDatar{
    private double radius;

    public Lingkaran(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    double luas() {
        return Math.PI * radius * radius;  
    }

    @Override
    double keliling() {
        return 2 * Math.PI * radius;  
    }
}

class Segitiga extends BangunDatar{
    private double sisi;

    public Segitiga(double sisi){
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
        return 0.5 * sisi * sisi;
    }

    @Override
    double keliling(){
        return sisi*3;
    }

}

public class Main {
    public static void main(String[] args) {

        Lingkaran myLingkaran = new Lingkaran(4.0);
        Persegi myPersegi = new Persegi(2.0);
        Segitiga mySegitiga = new Segitiga(3.5);

        System.out.println("Kelilin persegi adalah : "+myPersegi.keliling());
        System.out.println("Luas persegi adalah : "+myPersegi.luas());
        System.out.printf("Keliling lingkaran adalah : %.2f\n", myLingkaran.keliling());
        System.out.printf("Luas lingkaran adalah : %.2f\n", myLingkaran.luas());
        System.out.printf("Keliling Segitiga adalah : %.2f\n", mySegitiga.keliling());
        System.out.printf("Luas Segitiga adalah : %.2f\n", mySegitiga.luas());
        myPersegi.setSisi(10.5);
        myLingkaran.setRadius(11.0);
        mySegitiga.setSisi(20.0);
        System.out.println("Kelilin persegi adalah : "+myPersegi.keliling());
        System.out.println("Luas persegi adalah : "+myPersegi.luas());
        System.out.printf("Keliling lingkaran adalah : %.2f\n", myLingkaran.keliling());
        System.out.printf("Luas lingkaran adalah : %.2f\n", myLingkaran.luas());
        System.out.printf("Keliling Segitiga adalah : %.2f\n", mySegitiga.keliling());
        System.out.printf("Luas Segitiga adalah : %.2f\n", mySegitiga.luas());
    }
}
