public class DataService extends BasicService {
    private double kolicinaTarifiranje;
    private double pricePerUnit;
    private int maxDownloadSpeed;
    private int maxUploadSpeed;

    public DataService(double servicePrice, double free, int kolicinaTarifiranje, double pricePerUnit) {
        setServicePrice(servicePrice);
        setFree(free);
        this.kolicinaTarifiranje = kolicinaTarifiranje;
        this.pricePerUnit = pricePerUnit;
    }

    public double getKolicinaTarifiranje() {
        return kolicinaTarifiranje;
    }

    public void setKolicinaTarifiranje(double kolicinaTarifiranje) {
        this.kolicinaTarifiranje = kolicinaTarifiranje;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getMaxDownloadSpeed() {
        return maxDownloadSpeed;
    }

    public void setMaxDownloadSpeed(int maxDownloadSpeed) {
        this.maxDownloadSpeed = maxDownloadSpeed;
    }

    public int getMaxUploadSpeed() {
        return maxUploadSpeed;
    }

    public void setMaxUploadSpeed(int maxUploadSpeed) {
        this.maxUploadSpeed = maxUploadSpeed;
    }

    @Override
    public String toString() {
        return "Data " + this.getServicePrice();
    }

}
