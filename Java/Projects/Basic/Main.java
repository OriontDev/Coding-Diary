abstract class BangunDatar {
    abstract double luas();
    abstract double keliling();
}
// Penggunaan keyword extend menandakan INHERITANCE, dimana kelas Bangun datar mewariskan atribut atribut dan metodenya kepada kelas persegi panjang
class PersegiPanjang extends BangunDatar {
    //Penggunaan keyword "PRIVATE", yang bertujuan mengenkapsulasi attribut tersebut dan hanya bisa diakses oleh method yang berada di dalam kelas tersebut
    private double panjang;
    private double lebar;
    //CONSTRUCTOR

    // Penggunaan Overloading, menandakan polimorfisme, dimana terdapat dua method yang namanya sama dan fungsinya sama sebagai constructor namun memiliki argumen yang berbeda, ini berarti kelas PersegiPanjang dapat di inisialisasi menggunakan metode salah satunya dan akan menghasilkan hasil yang valid.
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public PersegiPanjang(double panjang) {
        this.panjang = panjang;
        this.lebar = panjang;
    }
    // Penggunaan Keyword @Override, (Polimorfisme) Dimana berfungsi untuk memodifiksi metode yang diturunkan oleh Parent dari kelas tersebut
    @Override
    double luas() {
        return panjang * lebar;
    }
    @Override
    // Metode keliling (Dan metode luas diatas) merupakan salah satu penerapan inheritance, sebab metode ini merupakan metode turunan dari metode Parent kelas tersebut (extends kelas BangunDatar), wajib diimplementasi serta bentuknya sesuai dengan yang dimiliki oleh Kelas bangun datar tersebut
    double keliling() {
        return 2 * (panjang + lebar);
    }
}
class Lingkaran extends BangunDatar {
    private double radius;
    // Penggunaan keyword public, menandakan penerapan enkapsulasi, mirip dengan private, yakni dapat mengontrol pengaruh/akses luar.
    public Lingkaran(double radius) {
        this.radius = radius;
    }
    @Override
    double luas() {
        //Polimorfise berarti banyak bentuknya, Konsep ini menjelaskan bahwa meski kelas parent memiliki metode yang berbeda, metode ini dapat dideklarasi menggunakan logika yang berbeda lalu ditandai dengan keyword @Override. Disini, metode luas yang belum diimplementasi, diwariskan kepada lingkaran untuk di override dan diisi logika menghitung luas lingkaran
        return Math.PI * radius * radius;
    }
    @Override
    double keliling() {
        return 2 * Math.PI * radius;
    }
}
public class Main {
        public static void main(String[] args) {
        	//PersegiPanjang pp = new PersegiPanjang(5, 10);
        	PersegiPanjang pp = new PersegiPanjang(5);
        	System.out.println("Persegi Panjang:");
        System.out.println("Luas: " + pp.luas());
        System.out.println("Keliling: " + pp.keliling());
        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("\nLingkaran:");
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.keliling());
    }
}
