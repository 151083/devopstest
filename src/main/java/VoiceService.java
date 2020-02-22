public class VoiceService extends BasicService {
    private int unit;
    private double pricePerMinute;
    private double pricePerCall;
    private int freeSecInCall;

    public VoiceService(double servicePrice, double free, int unit, double pricePerMinute, double pricePerCall, int freeSecInCall) {
        setServicePrice(servicePrice);
        setFree(free);
        this.unit = unit;
        this.pricePerMinute = pricePerMinute;
        this.pricePerCall = pricePerCall;
        this.freeSecInCall = freeSecInCall;
    }


    @Override
    public String toString() {
        return "Voice " + this.getServicePrice();
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getPricePerMinute() {
        return pricePerMinute;
    }

    public void setPricePerMinute(double pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }

    public double getPricePerCall() {
        return pricePerCall;
    }

    public void setPricePerCall(double pricePerCall) {
        this.pricePerCall = pricePerCall;
    }
}
