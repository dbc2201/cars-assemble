public class CarsAssemble {

    private static final int CARS_PRODUCED_EACH_HOUR = 221;

    private double getSuccessRate(int speed) {
        if (speed >= 1 && speed <= 4) {
            return 1.0;
        } else if (speed >= 5 && speed <= 8) {
            return 0.9;
        } else if (speed == 9) {
            return 0.8;
        } else if (speed == 10) {
            return 0.77;
        } else return 0.0;
    }

    public double productionRatePerHour(int speed) {
        return CARS_PRODUCED_EACH_HOUR * speed * getSuccessRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        throw new UnsupportedOperationException("Please implement the AssemblyLine.workingItemsPerMinute() method");
    }
}
