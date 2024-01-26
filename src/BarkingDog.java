public class BarkingDog {
    public boolean shouldWakeUp(boolean isBarking, int time){
        return time > 0 && time < 24 && isBarking;

    }
}
