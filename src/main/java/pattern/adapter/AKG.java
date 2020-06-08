package pattern.adapter;

public class AKG {

    public void InputAudio(MMInterface mmInterface){
        double num = mmInterface.provideInterface();
        if (num == 3.5){
            System.out.println("我得到3.5mm的接口啦^V^,可以听杰伦的歌啦啦啦");
        }
    }
}
