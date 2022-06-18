/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas6oop;

/**
 *
 * @author ayeyaa
 */
public class Main {
    public static void main(String[] args) {
        
        // class Manusia
        System.out.println("\n================= DAFTAR MANUSIA =================");
        Manusia mns = new Manusia ("Carrisa", "215150601111012", false, false);
        System.out.println(mns.toString());
        Manusia mns1 = new Manusia ("Aleyda", "215150601111012", false, false);
        System.out.println(mns1.toString());
        Manusia mns2 = new Manusia ("Maulana", "215150601111012", false, false);
        System.out.println(mns2.toString());
 
        // class MahasiswaFilkom
        System.out.println("\n================= DAFTAR MAHASISWA =================");
        MahasiswaFilkom mhs = new MahasiswaFilkom 
        ("205150601111018", 3.7, "I Putu Yoga", "351923848239", false, false);
        System.out.println(mhs.toString());
        MahasiswaFilkom mhs1 = new MahasiswaFilkom 
        ("195150207111334", 3.9, "Zahra Ithriyah", "35123456789", false, false);
        System.out.println(mhs1.toString());
        MahasiswaFilkom mhs2 = new MahasiswaFilkom 
        ("195150207114567", 4.0, "Salsabilla", "341123456789", false, false);
        System.out.println(mhs2.toString());
 
        // class Pekerja
        System.out.println("\n================= DAFTAR PEKERJA =================");
        Pekerja pkr = new Pekerja(7, 22,"195102439283", "Park Iqbal Biondy", "25180379", true, true);
        System.out.println(pkr.toString());
        Pekerja pkr1 = new Pekerja(8, 28, "201777110228", "Choi Beomgyu", "99992810", true, true);
        System.out.println(pkr1.toString());
        Pekerja pkr2 = new Pekerja(9, 25, "201777110244", "Jung June", "1234567", true, true);
        System.out.println(pkr2.toString());
 
        // class Manajer
        System.out.println("\n================= DAFTAR MAJAGER =================");    
        Manajer mnr = new Manajer
        (1500, 9, 20, "40977140232", "Lyra Hertin", "18369033", false, false);
        System.out.println(mnr.toString());
        Manajer mnr1 = new Manajer
        (1600, 7, 26, "40977140245", "Choi Soobin", "1115720", false, false);
        System.out.println(mnr1.toString());
        Manajer mnr2 = new Manajer
        (1200, 8, 24, "40977140367", "Kai Kamal Huening", "7779269", false, false);
        System.out.println(mnr2.toString());
 
        // total
        System.out.println("\n\t\t TOTAL YANG TERDAFTAR");
        System.out.print("\t1. Manusia\t\t: ");
        mns.totalManusia();
        System.out.print("\t2. Mahasiswa\t\t: ");
        mhs.totalMahasiswa();
        System.out.print("\t3. Pekerja\t\t: ");
        pkr.totalPekerja();
        System.out.print("\t4. Manager\t\t: ");
        mnr.totalManajer();

    }
    
}
