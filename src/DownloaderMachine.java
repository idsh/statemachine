import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DownloaderMachine {

    //curr state
    public ImovieDownloader currMachineState;
    private int score;
    private double speedRate;
    private int currFreeSpace;
    private Double downloadingStatus;
    private int movieSize;
    private turnOff turnoff;
    private turnOn turnon;
    private ExecutorService executor;

    public double getSpeedRate() {
        return speedRate;
    }

    public void setSpeedRate(double speedRate) {
        this.speedRate = speedRate;
    }

    public DownloaderMachine() {
        this.score = 0;
        this.currFreeSpace = 100;
        this.downloadingStatus = 0.0;
        this.movieSize = 0;
        this.turnoff = new turnOff(this);
        this.turnon = new turnOn(this);
        this.currMachineState = turnoff;
        this.currMachineState.entry();
        this.executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

    public turnOff getTurnoff() {
        return turnoff;
    }

    public void setTurnoff(turnOff turnoff) {
        this.turnoff = turnoff;
    }

    public turnOn getTurnon() {
        return turnon;
    }

    public void setTurnon(turnOn turnon) {
        this.turnon = turnon;

    }

    public ImovieDownloader getCurrMachineState() {
        return currMachineState;
    }

    public void setCurrMachineState(ImovieDownloader currMachineState) {
        this.currMachineState.exit();
        this.currMachineState = currMachineState;
        this.currMachineState.entry();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCurrFreeSpace() {
        return currFreeSpace;
    }

    public void setCurrFreeSpace(int currFreeSpace) {
        this.currFreeSpace = currFreeSpace;
    }

    public Double getDownloadingStatus() {
        return downloadingStatus;
    }

    public void setDownloadingStatus(Double downloadingStatus) {
        this.downloadingStatus = downloadingStatus;
    }

    public int getMovieSize() {
        return movieSize;
    }

    public void setMovieSize(int movieSize) {
            this.movieSize = movieSize;
            currMachineState.QisNotEmpty();
    }




    public void setMachineState(ImovieDownloader newState){
        currMachineState = newState;
    }


}
