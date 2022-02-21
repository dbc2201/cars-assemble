public class CarsAssemble {

    private double getSuccessRate(int speed) {
        if (speed >= 1 && speed <= 4) {
            return 1.0;
        } else if (speed >= 5 && speed <= 8) {
            return 0.9;
        } else if (speed == 9) {
            return 0.8;
        } else if (speed == 10) {
            return 0.77;
        } else return Integer.MIN_VALUE;
    }

    public double productionRatePerHour(int speed) {
        throw new UnsupportedOperationException("Please implement the AssemblyLine.productionRateperHour() method");
    }

    public int workingItemsPerMinute(int speed) {
        throw new UnsupportedOperationException("Please implement the AssemblyLine.workingItemsPerMinute() method");
    }
}
