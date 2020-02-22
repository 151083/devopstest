import java.util.ArrayList;
import java.util.List;

public class ServicePackage implements Cloneable {
    private String name;
    private List<BasicService> listOfServices;

    public ServicePackage(String name) {

        this.name = name;
        listOfServices = new ArrayList<BasicService>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BasicService> getListOfServices() {
        return listOfServices;
    }

    public void setListOfServices(List<BasicService> listOfServices) {
        this.listOfServices = listOfServices;
    }

    @Override
    protected ServicePackage clone() throws CloneNotSupportedException {
        ServicePackage servicePackage = new ServicePackage(this.name);
        List<BasicService> tempServices = this.getListOfServices();
        servicePackage.setListOfServices(tempServices);
        return servicePackage;
    }

    public void addService(BasicService basicService) {
        this.listOfServices.add(basicService);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" List of services & subscription prices in package: " + this.name + '\n');
        double total = 0;
        for (int i = 0; i < listOfServices.size(); i++) {
            sb.append(i + 1);
            sb.append(". ");
            total += listOfServices.get(i).getServicePrice();
            sb.append(listOfServices.get(i));
            sb.append('\n');
        }
        sb.append("Total: " + total);

        return sb.toString();
    }
}
