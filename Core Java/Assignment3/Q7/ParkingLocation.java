package co.harsh.Assignment3.Q7;

public class ParkingLocation {
    private static int floor;
    private static int section;
    private static int totalCarsAdded=0;

    @Override
    public String toString() {
        return "Floor"+floor+" Section"+section;
    }



    public ParkingLocation(int floor, int section) {
        this.floor = floor;
        this.section = section;
    }

    public static ParkingLocation getLocation(Parking_CarOwner_Details obj){
        if(totalCarsAdded<=8){
            floor=1;
            if(totalCarsAdded<=2)
                section=1;
            if(totalCarsAdded>2 && totalCarsAdded<=4)
                section=2;
            if(totalCarsAdded>4&& totalCarsAdded<=6)
                section=3;
            if(totalCarsAdded>6 && totalCarsAdded<=8)
                section=4;
        }
        if(totalCarsAdded>8&&totalCarsAdded<=16){
            floor=2;
            if(totalCarsAdded<=10)
                section=1;
            if(totalCarsAdded>10 && totalCarsAdded<=12)
                section=2;
            if(totalCarsAdded>12&& totalCarsAdded<=14)
                section=3;
            if(totalCarsAdded>14 && totalCarsAdded<=16)
                section=4;
        }
        if(totalCarsAdded>16&&totalCarsAdded<=24){
            floor=3;
            if(totalCarsAdded<=18)
                section=1;
            if(totalCarsAdded>18 && totalCarsAdded<=20)
                section=2;
            if(totalCarsAdded>20&& totalCarsAdded<=22)
                section=3;
            if(totalCarsAdded>22 && totalCarsAdded<=24)
                section=4;
        }

        return new ParkingLocation(floor,section);
    }
}
