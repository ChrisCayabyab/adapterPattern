package adapterPattern;

public class DevicesApp {

    public static void main(String[] args){

        Laptop laptop = new Laptop();
        PowerOutlet LaptopPO = new LaptopAdaptor(laptop);

        SmartPhoneCharger smartPhoneCharger= new SmartPhoneCharger();
        PowerOutlet SmartPhoneChargerPO = new SmartPhoneChargerAdaptor(smartPhoneCharger);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet RefrigeratorPO = new RefrigeratorAdaptor(refrigerator);

        //turn on the appliances
        System.out.println(LaptopPO.plugIn());
        System.out.println(SmartPhoneChargerPO.plugIn());
        System.out.println(RefrigeratorPO.plugIn());

        System.out.println();

        //turn off the appliances
        System.out.println(LaptopPO.plugOut());
        System.out.println(SmartPhoneChargerPO.plugOut());
        System.out.println(RefrigeratorPO.plugOut());

    }
}
