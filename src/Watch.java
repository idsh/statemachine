public class Watch implements ImovieDownloader{

    private DownloaderMachine machine;
    private internetOn father;
    private ImovieDownloader currState;

    private idleWatching idleWatching;
    private pauseMovie pauseMovie;
    private WatchingMovie watchingMovie;

    public Watch(DownloaderMachine DM, internetOn father){
        currState = new idleWatching(DM,this);
        this.father = father;
        this.machine = DM;
        idleWatching = new idleWatching(DM,this);
        pauseMovie = new pauseMovie(DM,this);
        watchingMovie = new WatchingMovie(DM,this);
    }

    public DownloaderMachine getMachine() {
        return machine;
    }

    public void setMachine(DownloaderMachine machine) {
        this.machine = machine;
    }

    public internetOn getFather() {
        return father;
    }

    public ImovieDownloader getCurrState() {
        return currState;
    }

    public void setCurrState(ImovieDownloader currState) {
        this.currState.exit();
        this.currState = currState;
        this.currState.entry();
    }

    @Override
    public void initDownloadingStatus(int movieSize) {

    }

    public idleWatching getIdleWatching() {
        return idleWatching;
    }

    public void setIdleWatching(idleWatching idleWatching) {
        this.idleWatching = idleWatching;
    }

    public pauseMovie getPauseMovie() {
        return pauseMovie;
    }

    public void setPauseMovie(pauseMovie pauseMovie) {
        this.pauseMovie = pauseMovie;
    }

    public WatchingMovie getWatchingMovie() {
        return watchingMovie;
    }

    public void setWatchingMovie(WatchingMovie watchingMovie) {
        this.watchingMovie = watchingMovie;
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
    public void entry() {
        System.out.println("enter Watch state");
    }

    @Override
    public void exit() {
        System.out.println("exit Watch state");
    }


    @Override
    public void startMovieFromBeginning() {

    }
}
