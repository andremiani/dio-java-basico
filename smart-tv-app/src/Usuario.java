public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("----------------------------------");
        System.out.println("Default Properties:");
        System.out.println("----------------------------------");
        System.out.println("Is the TV on?: " + smartTv.isOn);
        System.out.println("Current Channel:" + smartTv.channel);
        System.out.println("Current Volume: " + smartTv.volume);
        System.out.println("----------------------------------");
        System.out.println("Using TV:");
        System.out.println("----------------------------------");
        smartTv.TurnOn();
        smartTv.IncreaseChannel();
        smartTv.TurnUpTv();
        smartTv.SetChannel(100);
        System.out.println("----------------------------------");
        System.out.println("Current Status:");
        System.out.println("----------------------------------");
        System.out.println("Is the TV on?: " + smartTv.isOn);
        System.out.println("Current Channel:" + smartTv.channel);
        System.out.println("Current Volume: " + smartTv.volume);

        System.out.println("----------------------------------");
        System.out.println("After Using TV:");
        System.out.println("----------------------------------");

        smartTv.TurnOff();

    }
}
