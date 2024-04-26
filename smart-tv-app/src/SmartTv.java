public class SmartTv {
    boolean isOn = false;
    int channel = 1;
    int volume = 25;

    public void TurnOn() {
        isOn = true;
        System.out.println("Turning on the TV");
    }

    public void TurnOff() {
        isOn = false;
        System.out.println("Turning off the TV");
    }

    public void TurnUpTv() {
        volume++;
        System.out.println("Turning Up Channel to:" + volume);

    }

    public void TurnDownTv() {
        volume--;
        System.out.println("Turning Down Volumen to:" + channel);

    }

    public void IncreaseChannel() {
        channel++;
        System.out.println("Increase Channel to:" + channel);
    }

    public void DecreaseChannel() {
        channel--;
        System.out.println("Decrease Channel to:" + channel);
    }

    public void SetChannel(int newchannel) {
        channel = newchannel;
        System.out.println("Setting Channel to:" + channel);
    }

}
