package adapterPattern;

public class LaptopAdaptor implements PowerOutlet{

    private Laptop laptop;

    public LaptopAdaptor (Laptop laptop){
        this.laptop=laptop;
    }

    @Override
    public String plugIn() {
        return laptop.charge();
    }

    @Override
    public String plugOut() {
        return laptop.stopCharge();
    }
}
