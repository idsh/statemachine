public class DownloaderMachine {

    //curr state
    public ImovieDownloader currMachineState;
    private int score;
    private int currFreeSpace;
    private int downloadingStatus;
    private int movieSize;
    private turnOff turnoff;
    private turnOn turnon;

    public DownloaderMachine() {
        this.score = 0;
        this.currFreeSpace = 100;
        this.downloadingStatus = 0;
        this.movieSize = 0;
        this.turnoff = new turnOff(this);
        this.turnon = new turnOn(this);
        this.currMachineState = turnoff;
        this.currMachineState.entry();
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
        if(movieSize==0) {
            this.movieSize = movieSize;
            currMachineState.QisNotEmpty();
        }
    }




    public void setMachineState(ImovieDownloader newState){
        currMachineState = newState;
    }


}
