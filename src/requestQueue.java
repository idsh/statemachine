public class requestQueue implements ImovieDownloader {

    private DownloaderMachine machine;
    private turnOn father;
    private ImovieDownloader queueM;

    public requestQueue(DownloaderMachine DM, turnOn father){
        this.father = father;
        this.machine = DM;
        queueM = new queueM(machine, this);
    }

    @Override
    public void turnOff() {
        queueM.turnOff();
        queueM.exit();
        this.exit();
    }

    @Override
    public void turnOn() {
        this.entry();
        queueM.turnOn();
        queueM.entry();
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
        System.out.println("enter requestQueue state");
    }

    @Override
    public void exit() {
        System.out.println("exit requestQueue state");
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
