package pattern.adapter;

public class ListenMusic {

    public static void main(String[] args) {
        AKG akg = new AKG();
        MMInterface mmInterface = new TypeCToMMAdapter(new Phone());
        akg.InputAudio(mmInterface);
    }
}
