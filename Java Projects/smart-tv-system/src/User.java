public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("tv is on? " + smartTv.btn);
        System.out.println("current channel: " + smartTv.channel);
        System.out.println("current volume: " + smartTv.volume);

        smartTv.turnOn();
        System.out.println("new stats - tv is on? " + smartTv.btn);

        smartTv.turnOff();
        System.out.println("new stats - tv is on? " + smartTv.btn);

        smartTv.turnDownVolume();
        smartTv.turnDownVolume();
        smartTv.turnUpVolume();
        System.out.println("new stats - tv is on? " + smartTv.volume);

        System.out.println("current channel: " + smartTv.channel);
        smartTv.changeChannel(4);
        System.out.println("current channel: " + smartTv.channel);


    }
}
