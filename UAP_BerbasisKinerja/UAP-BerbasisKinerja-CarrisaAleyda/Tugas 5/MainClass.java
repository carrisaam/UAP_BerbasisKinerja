/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas6;

/**
 *
 * @author ayeyaa
 */
public class MainClass {
    public static void main(String[] args) {
        CarRider Lee = new CarRider("Lin Ming", 19, "08000000000");
        CarRider Min = new CarRider("Bei Youhan", 20, "08111111111");
        CarRider HO = new CarRider("Ling'er", 31, "08122222222");

        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB", "Suzuki");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(Lee, data.carList.get(1), 9);
        arsip.Rent(Min, data.carList.get(0), 3);
        arsip.Rent(HO, data.carList.get(1), 1);

        System.out.println();
        Car.status();
        
        System.out.println();
        arsip.info();
        
    }    
}
