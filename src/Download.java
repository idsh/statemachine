public class Download implements ImovieDownloader {

    private DownloaderMachine machine;
    private internetOn father;
    private ImovieDownloader currState;

    private idleDownloading idleDownloading;
    private firstSpaceCheck firstSpaceCheck;
    private secondSpaceCheck secondSpaceCheck;
    private deletingMovie deletingMovie;
    private errorOccurred errorOccurred;
    private downloadingMovie downloadingMovie;

    public DownloaderMachine getMachine() {
        return machine;
    }

    public void setMachine(DownloaderMachine machine) {
        this.machine = machine;
    }

    public internetOn getFather() {
        return father;
    }

    public void setFather(internetOn father) {
        this.father = father;
    }

    public ImovieDownloader getCurrState() {
        return currState;
    }

    public void setCurrState(ImovieDownloader currState) {
        this.currState = currState;
    }

    public idleDownloading getIdleDownloading() {
        return idleDownloading;
    }

    public void setIdleDownloading(idleDownloading idleDownloading) {
        this.idleDownloading = idleDownloading;
    }

    public firstSpaceCheck getFirstSpaceCheck() {
        return firstSpaceCheck;
    }

    public void setFirstSpaceCheck(firstSpaceCheck firstSpaceCheck) {
        this.firstSpaceCheck = firstSpaceCheck;
    }

    public secondSpaceCheck getSecondSpaceCheck() {
        return secondSpaceCheck;
    }

    public void setSecondSpaceCheck(secondSpaceCheck secondSpaceCheck) {
        this.secondSpaceCheck = secondSpaceCheck;
    }

    public deletingMovie getDeletingMovie() {
        return deletingMovie;
    }

    public void setDeletingMovie(deletingMovie deletingMovie) {
        this.deletingMovie = deletingMovie;
    }

    public errorOccurred getErrorOccurred() {
        return errorOccurred;
    }

    public void setErrorOccurred(errorOccurred errorOccurred) {
        this.errorOccurred = errorOccurred;
    }

    public downloadingMovie getDownloadingMovie() {
        return downloadingMovie;
    }

    public void setDownloadingMovie(downloadingMovie downloadingMovie) {
        this.downloadingMovie = downloadingMovie;
    }

    public Download(DownloaderMachine DM, internetOn father){
        currState = new idleDownloading(DM,this);
        this.father = father;
        this.machine = DM;
        idleDownloading = new idleDownloading(DM,this);
        firstSpaceCheck = new firstSpaceCheck(DM,this);
        secondSpaceCheck = new secondSpaceCheck(DM,this);
        deletingMovie = new deletingMovie(DM,this);
        errorOccurred = new errorOccurred(DM,this);
        downloadingMovie = new downloadingMovie(DM,this);
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

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void removeRequest() {

    }

    @Override
    public void scoreChanged() {

    }

    @Override
    public void QisNotEmpty() {

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
    public void handleInternetOn() {

    }

    @Override
    public void handleInternetOff() {

    }

    @Override
    public void handleTurnOn() {

    }

    @Override
    public void handleTurnOff() {

    }

    @Override
    public void entry() {

    }

    @Override
    public void exit() {

    }

    @Override
    public void startMovieFromBeginning() {

    }
}
