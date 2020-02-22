public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeFactory prototypeFactory = new PrototypeFactory();
        ServicePackage servicePackage = new ServicePackage("post-paid");
        servicePackage.addService(new VoiceService(500.0, 500.0, 30, 3.9, 0.0, 0));
        servicePackage.addService(new SmsService(0.0, 50.0, 4.9));
        servicePackage.addService(new DataService(300.0, 5.0, 100 * 1024, 4.0));
        servicePackage.addService(new RoamService());

        ServicePackage secondServicePackage = new ServicePackage("pre-paid");
        secondServicePackage.addService(new VoiceService(0.0, 0.0, 60, 6.9, 6.9, 60));
        secondServicePackage.addService(new SmsService(0.0, 0.0, 5.0));

        ServicePackage thirdServicePackage = new ServicePackage("pre-paid-data+");
        prototypeFactory.addServicePackage(servicePackage);
        prototypeFactory.addServicePackage(secondServicePackage);
        prototypeFactory.addServicePackage(thirdServicePackage);


        ServicePackage sp1 = prototypeFactory.findAndClone("post-paid");
        System.out.println(sp1);
        ServicePackage sp2 = prototypeFactory.findAndClone("pre-paid");
        System.out.println(sp2);
        ServicePackage sp3 = prototypeFactory.findAndClone("pre-paid-data+");
        System.out.println(sp3);
    }
}
