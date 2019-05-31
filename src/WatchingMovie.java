public class WatchingMovie implements ImovieDownloader {

    private DownloaderMachine machine;
    private Watch father;

    public WatchingMovie(DownloaderMachine Dm, Watch father){
        this.machine = Dm;
        this.father = father;
    }


    @Override
    public void restartMovie() {
        machine.currMachineState.startMovieFromBeginning();
        father.setCurrState(father.getWatchingMovie());
    }

    @Override
    public void holdMovie() {
        father.setCurrState(father.getPauseMovie());
    }

    @Override
    public void movieOff() {
        father.setCurrState(father.getIdleWatching());
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
        father.setCurrState(father.getIdleWatching());
    }

    @Override
    public void watching() {

    }

    @Override
    public void downloadingDone() {
        father.setCurrState(father.getIdleWatching());
    }

    @Override
    public void entry() {
        System.out.println("enter WatchingMovie state");
    }

    @Override
    public void exit() {
        System.out.println("exit WatchingMovie state");
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
}
