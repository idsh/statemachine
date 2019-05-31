public class internetOn implements ImovieDownloader {

    private DownloaderMachine machine;
    private ImovieDownloader father;
    private ImovieDownloader DownloadState;
    private ImovieDownloader WatchState;

    public internetOn(DownloaderMachine DM, Internet father){
        this.father = father;
        this.machine = DM;
        DownloadState = new Download(DM,this);
        WatchState = new Watch(DM,this);
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
        System.out.println("enter internetOn state");
    }

    @Override
    public void exit() {
        System.out.println("exit internetOn state");
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

    }

    @Override
    public void initDownloadingStatus(int movieSize) {

    }

    public DownloaderMachine getMachine() {
        return machine;
    }

    public ImovieDownloader getFather() {
        return father;
    }

    public ImovieDownloader getDownloadState() {
        return DownloadState;
    }

    public ImovieDownloader getWatchState() {
        return WatchState;
    }

}
