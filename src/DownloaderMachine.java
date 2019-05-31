public class DownloaderMachine {

    //curr state
    public ImovieDownloader currMachineState;

    public int score=0;
    public int currFreeSpace = 100;
    public int downloadingStatus = 0;
    public int movieSize = 0;


    public DownloaderMachine(){
        turnOff turnoff = new turnOff(this);
        turnOn turnon = new turnOn(this);
        currMachineState = turnoff;
    }




    public void setMachineState(ImovieDownloader newState){
        currMachineState = newState;
    }


}
