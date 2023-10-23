package adapterPattern;

public class RefrigeratorAdaptor implements PowerOutlet{

    private Refrigerator refrigerator;

    public RefrigeratorAdaptor(Refrigerator refrigerator)
    {
        this.refrigerator=refrigerator;
    }
    @Override
    public String plugIn() {
        return refrigerator.startCooling();
    }

    @Override
    public String plugOut() {
        return refrigerator.stopCooling();
    }
}
