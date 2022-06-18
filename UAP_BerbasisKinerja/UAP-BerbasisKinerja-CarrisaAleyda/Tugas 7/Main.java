package tugas7;

public class Main {

    public static void main(String[] args) {

        System.out.println("==================DATA PEGAWAI TETAP==================");
        Pegawai tetap1 = new PegawaiTetap("Jungkook", "1236915292", 2000000.0);
        System.out.println(tetap1.toString());
        Pegawai tetap2 = new PegawaiTetap("Jimin", "10102720182", 3000000.0);
        System.out.println(tetap2.toString());
        Pegawai tetap3 = new PegawaiTetap("Yuta", "0192519262", 2500000.0);
        System.out.println(tetap3.toString());
        Pegawai tetap4 = new PegawaiTetap("Haruto", "0001528162", 4500000.0);
        System.out.println(tetap4.toString());

        System.out.println("\n==================DATA PEGAWAI HARIAN==================");
        Pegawai harian1 = new PegawaiHarian("Seokjin", "9630171927", 8500.0, 40);
        System.out.println(harian1.toString());
        Pegawai harian2 = new PegawaiHarian("Namjoon", "0017241925", 7500.0, 30);
        System.out.println(harian2.toString());
        Pegawai harian3 = new PegawaiHarian("Taehyung", "0019253318", 9000.0, 46);
        System.out.println(harian3.toString());
        Pegawai harian4 = new PegawaiHarian("Yoongi", "0014281429", 6000.0, 28);
        System.out.println(harian4.toString());

        System.out.println("\n==================DATA SALES==================");
        Pegawai sales1 = new Sales("Hoseok", "0014271428", 50, 50000.0);
        System.out.println(sales1.toString());
        Pegawai sales2 = new Sales("Jaehyun", "0015281739", 66, 60000.0);
        System.out.println(sales2.toString());
        Pegawai sales3 = new Sales("Eunwoo", "0017293819",77 , 65000.0);
        System.out.println(sales3.toString());
        Pegawai sales4 = new Sales("Heize", "0001528351",45 , 45000.0);
        System.out.println(sales4.toString());

    }
}
