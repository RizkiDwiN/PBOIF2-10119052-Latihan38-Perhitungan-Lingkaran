package pboif2.pkg10119052.latihan38.perhitunganlingkaran;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * perhitungan lingkaran
 * 
 */

public class Lingkaran {
    public int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    
    public int jariJari() {
        return diameter / 2;
    }
    
    public double luas() {
        return Math.PI * Math.pow(jariJari(), 2);
    }
    
    public double keliling() {
        return 2 * Math.PI * jariJari();
    }
    
    public String formatNilai(double nilai) {
        return String.format("%.2f", nilai).replace('.', ',');
    } 
    
    public void hitungLingkaran() {
        System.out.println("\n====Hasil Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran = " +
                jariJari() + " cm");
        System.out.println("Luas Lingkaran = " +
                formatNilai(luas()) + " cm");
        System.out.println("Keliling Lingkaran = " +
                formatNilai(keliling()) + " cm");
}}
