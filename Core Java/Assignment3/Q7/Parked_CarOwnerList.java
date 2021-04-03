package co.harsh.Assignment3.Q7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Parked_CarOwnerList {
    Map<Parking_CarOwner_Details,ParkingLocation> parking_carOwner_detailsParkingLocationMap;
    public Parked_CarOwnerList(){
       parking_carOwner_detailsParkingLocationMap = new HashMap<>();
    }
    public String add_new_Car(Parking_CarOwner_Details obj){
        parking_carOwner_detailsParkingLocationMap.put(obj,ParkingLocation.getLocation(obj));
        return "Added";
    }

    public String remove_Car(String ownerName,String carModel){
        return "Removed Successful";
    }

    public String get_parked_Car_location(String ownerName,String carModel){
        Set<Map.Entry<Parking_CarOwner_Details,ParkingLocation>> entrySet = parking_carOwner_detailsParkingLocationMap.entrySet();
        for(Map.Entry<Parking_CarOwner_Details,ParkingLocation> entry:entrySet){
            if(entry.getKey().getOwnerName().equalsIgnoreCase(ownerName)&&entry.getKey().getCarModel().equalsIgnoreCase(carModel)){
                return entry.getValue().toString();
            }
        }
        return "No Information Available \nPlz check your Details";
    }
    }
