package main.trainings.InterfaceExamples;
class phone{
    void call(){
        System.out.println("Calling from phone");
    }
    void sms(){
        System.out.println("Sms sending from Phone");
    }
}

interface ICamera{
    void images();
    void videoCall();
}

interface IMusicPlayer{
    void play();
    void stop();
}
class SmartphoneExample extends phone implements ICamera, IMusicPlayer{

    @Override
    public void images() {
        System.out.println("Taking Images");
    }

    @Override
    public void videoCall() {
        System.out.println("Calling Video call");
    }

    @Override
    public void play() {
        System.out.println("Playing Music");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music");
    }
}
public class Smartphone{
    public static void main(String[] args) {
        SmartphoneExample smartphoneExample = new SmartphoneExample();
        IMusicPlayer iMusicPlayer = new SmartphoneExample();
        ICamera iCamera = new SmartphoneExample();
        iCamera.images();
        iCamera.videoCall();
        iMusicPlayer.play();
        iMusicPlayer.stop();
        //smartphoneExample.videoCall();
        smartphoneExample.sms();
        //smartphoneExample.images();
        //smartphoneExample.play();
        //smartphoneExample.stop();
        smartphoneExample.call();
    }
}
