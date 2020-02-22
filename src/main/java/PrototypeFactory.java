import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    public static Map<String, ServicePackage> servicePackageCache = new HashMap<String, ServicePackage>();

    public PrototypeFactory() {
//        servicePackageCache = new HashMap<String, ServicePackage>();

    }

    //    static {
//        servicePackageCache.put("new-service", new ServicePackage("a"));
//    }
    public void addServicePackage(ServicePackage servicePackage) {
        servicePackageCache.put(servicePackage.getName(), servicePackage);
    }

    public ServicePackage findAndClone(String servicePackageName) throws CloneNotSupportedException {
        return servicePackageCache.get(servicePackageName).clone();
    }
}
