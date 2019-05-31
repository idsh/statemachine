public class Internet implements ImovieDownloader {

    private ImovieDownloader internetOn;
    private ImovieDownloader internetOff;
    private ImovieDownloader currState;
    private DownloaderMachine machine;

    public Internet(DownloaderMachine machine) {
        this.internetOn = new internetOn(machine, this);
        this.internetOff = new internetOff(machine, this);
        this.currState = internetOff;
        this.machine = machine;
    }

    @Override
    public void turnOff() {
        currState.turnOff();
        currState.exit();
        this.exit();
    }

    @Override
    public void turnOn() {
        this.entry();
        currState.turnOn();
        currState.entry();
    }

    @Override
    public void restartMovie() {

    }

    @Override
    public void holdMovie() {

    }

    @Override
    public void movieOff() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void movieOn() {

    }

    @Override
    public void errorFixed() {

    }

    @Override
    public void downloadError() {

    }

    @Override
    public void downloadAborted() {

    }

    @Override
    public void fileRequest() {

    }

    @Override
    public void internetOff() {

    }

    @Override
    public void internetOn() {
        currState.internetOn();
    }

    @Override
    public void removeRequest() {

    }

    @Override
    public void scoreChanged() {

    }

    @Override
    public void QisNotEmpty() {
        currState.QisNotEmpty();
    }

    @Override
    public void checkSpace() {

    }

    @Override
    public void updateDownloadStatus() {

    }

    @Override
    public void pauseMovie() {

    }

    @Override
    public void startMovie() {

    }

    @Override
    public void inDeletingMovie() {

    }

    @Override
    public void watching() {

    }

    @Override
    public void downloadingDone() {

    }


    @Override
    public void entry() {
        System.out.println("enter Internet state");
    }

    @Override
    public void exit() {
        System.out.println("exit Internet state");
    }

    @Override
    public void startMovieFromBeginning() {

    }

    @Override
    public ImovieDownloader getCurrState() {
        return null;
    }

    @Override
    public void setCurrState(ImovieDownloader state) {
        this.currState.exit();
        this.currState = state;
        this.currState.entry();
    }

    @Override
    public void initDownloadingStatus(int movieSize) {

    }

    public ImovieDownloader getInternetOn() {
        return internetOn;
    }

    public void setInternetOn(ImovieDownloader internetOn) {
        this.internetOn = internetOn;
    }

    public ImovieDownloader getInternetOff() {
        return internetOff;
    }

    public void setInternetOff(ImovieDownloader internetOff) {
        this.internetOff = internetOff;
    }

    public DownloaderMachine getMachine() {
        return machine;
    }

    public void setMachine(DownloaderMachine machine) {
        this.machine = machine;
    }
}
