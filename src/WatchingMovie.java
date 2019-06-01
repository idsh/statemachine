public class WatchingMovie implements ImovieDownloader,Runnable {

    private DownloaderMachine machine;
    private Watch father;

    private Thread watchingThread = new Thread(this);

    public WatchingMovie(DownloaderMachine Dm, Watch father){
        this.machine = Dm;
        this.father = father;
    }


    @Override
    public void run() {
        while (machine.getDownloadingStatus() < machine.getMovieSize()){
            while (!Thread.interrupted()) {
                try {
                    System.out.println("watcing");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }


    @Override
    public void restartMovie() {
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
    public void inDeletingMovie() {
        father.setCurrState(father.getIdleWatching());
    }

    @Override
    public void downloadingDone() {
        father.setCurrState(father.getIdleWatching());
    }

    @Override
    public void entry() {
        System.out.println("enter WatchingMovie state");
        watchingThread = new Thread(this);
        watchingThread.start();
    }

    @Override
    public void exit() {
        watchingThread.interrupt();
        System.out.println("exit WatchingMovie state");
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
