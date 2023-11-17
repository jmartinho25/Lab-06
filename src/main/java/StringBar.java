public class StringBar extends Bar{
    private boolean happyHour;

    @Override
    public boolean isHappyHour(){
        return happyHour;
    }

    @Override
    public void startHappyHour(){
        if(!happyHour){
            happyHour=true;
            notifyObservers();
        }
    }

    @Override
    public void endHappyHour(){
        if(happyHour){
            happyHour=false;
            notifyObservers();
        }
    }
}
