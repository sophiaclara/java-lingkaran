public class Main {
    public static void main(String[] args) {
        double r = 7;

        double luas =  Math.PI*r*r;
        double keliling = 2*Math.PI*r;
        System.out.println("Luas Lingkaran : " + Math.round(luas));
        System.out.println("Keliling Lingkaran : " + Math.round(keliling));
    }
}