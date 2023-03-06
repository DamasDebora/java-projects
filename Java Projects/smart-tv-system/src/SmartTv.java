public class SmartTv {
    boolean btn = false;
    int volume = 25;
    int channel = 1; 
    

    public void turnOn(){
        btn=true;
    }
    public void turnOff(){
        btn=false;
    }

    public void turnUpVolume(){
        volume++;
        System.out.println("increasing volume to " + volume);        
    }
    public void turnDownVolume(){
        volume--;
        System.out.println("decrease volume to " +volume);

    }

    public void changeChannel(int newChannel){
        channel = newChannel;
    }
    public void goToNextChannel(){
        channel ++;
    }
    public void goToPreviousChannel(){
        channel --;
    }

}
