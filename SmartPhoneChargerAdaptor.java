package adapterPattern;

public class SmartPhoneChargerAdaptor implements PowerOutlet{

    private SmartPhoneCharger smartPhoneCharger;

    public SmartPhoneChargerAdaptor(SmartPhoneCharger smartPhoneCharger)
    {
        this.smartPhoneCharger=smartPhoneCharger;
    }
    @Override
    public String plugIn() {
        return smartPhoneCharger.chargePhone();
    }

    @Override
    public String plugOut() {
        return smartPhoneCharger.stopChargingPhone();
    }
}
