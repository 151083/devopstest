public class SmsService extends BasicService {
    private double cenaNaPoraka;

    public SmsService(double servicePrice, double free, double cenaNaPoraka) {
        setServicePrice(servicePrice);
        setFree(free);

        this.cenaNaPoraka = cenaNaPoraka;
    }

    public double getCenaNaPoraka() {
        return cenaNaPoraka;
    }

    public void setCenaNaPoraka(double cenaNaPoraka) {
        this.cenaNaPoraka = cenaNaPoraka;
    }

    @Override
    public String toString() {
        return "SMS " + this.getServicePrice();
    }

}
