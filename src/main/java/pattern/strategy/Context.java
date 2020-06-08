package pattern.strategy;

public class Context {

    private Items items;

    Context(Items items){
        this.items = items;
    }

    public void setItems(Items items) {
        this.items = items;
    }
    public void operate(){
        System.out.println(this.items.orderAssembly());
    }
}
