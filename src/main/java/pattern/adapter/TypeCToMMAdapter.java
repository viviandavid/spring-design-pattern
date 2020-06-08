package pattern.adapter;

public class TypeCToMMAdapter implements MMInterface {
    private Phone phone;

    TypeCToMMAdapter(Phone phone){
        this.phone = phone;
    }

    @Override
    public double provideInterface() {
        double num = phone.provideTypeC();
        System.out.println("老子现在就把你给转了！！！");
        return 3.5;
    }
}
