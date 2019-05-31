public class downloadingMovie implements ImovieDownloader {

    private DownloaderMachine machine;
    private Download father;

    public downloadingMovie(DownloaderMachine dm, Download father) {
        machine = dm;
        this.father = father;
    }

    public void entry() {
        System.out.println("enter downloadingMovie state");
        machine.setCurrFreeSpace(machine.getCurrFreeSpace() - machine.getMovieSize());
        machine.setDownloadingStatus(66);
    }

    public void exit() {
        System.out.println("exit downloadingMovie state");
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
        father.setCurrState(father.getErrorOccurred());
    }

    @Override
    public void downloadAborted() {
        machine.setCurrFreeSpace(machine.getCurrFreeSpace() + machine.getMovieSize());
        father.setCurrState(father.getDeletingMovie());
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
        machine.setScore(machine.getScore() + 1);
        machine.getCurrMachineState().removeRequest();
        machine.getCurrMachineState().scoreChanged();
        father.setCurrState(father.getIdleDownloading());
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
