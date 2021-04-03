package co.harsh.Assignment3.Q7;

public class Test {

    public static void main(String[] args) {
        Parked_CarOwnerList car_OwnerList = new Parked_CarOwnerList();

        Parking_CarOwner_Details owner1 = new Parking_CarOwner_Details("Harry", "Hyundai Verna 2012", "UTL1888", 988, "Noida,India");
        Parking_CarOwner_Details owner2 = new Parking_CarOwner_Details("Tom Riddle", "Honda Amaze 2015", "UTL1889", 877, "Delhi,India");
        Parking_CarOwner_Details owner3 = new Parking_CarOwner_Details("Severus", "Maruti Suzuki Swift 2018", "UTL1890", 788, "Faridabad,India");
        Parking_CarOwner_Details owner4 = new Parking_CarOwner_Details("Albus", "Renault Duster 2016", "UTL1891", 889, "Gurugram,India");

        car_OwnerList.add_new_Car(owner1);
        car_OwnerList.add_new_Car(owner2);
        car_OwnerList.add_new_Car(owner3);
        car_OwnerList.add_new_Car(owner4);

        System.out.println(car_OwnerList.get_parked_Car_location("Severus","Maruti Suzuki Swift 2018"));
    }
}
