public abstract class BasicService {
    private double servicePrice;
    private double free;

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public double getFree() {
        return free;
    }

    public void setFree(double free) {
        this.free = free;
    }


    public abstract String toString();

}
