public class DownloaderMachine {

    //curr state
    public ImovieDownloader currMachineState;

    private int score=0;
    private int currFreeSpace = 100;
    private int downloadingStatus = 0;
    private int movieSize = 0;


    public DownloaderMachine(){
        turnOff turnoff = new turnOff(this);
        turnOn turnon = new turnOn(this);
        currMachineState = turnoff;
    }


    public ImovieDownloader getCurrMachineState() {
        return currMachineState;
    }

    public void setCurrMachineState(ImovieDownloader currMachineState) {
        this.currMachineState = currMachineState;
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

    public int getDownloadingStatus() {
        return downloadingStatus;
    }

    public void setDownloadingStatus(int downloadingStatus) {
        this.downloadingStatus = downloadingStatus;
    }

    public int getMovieSize() {
        return movieSize;
    }

    public void setMovieSize(int movieSize) {
        this.movieSize = movieSize;
    }




    public void setMachineState(ImovieDownloader newState){
        currMachineState = newState;
    }


}
