import java.util.concurrent.TimeUnit;

public class secondSpaceCheck implements ImovieDownloader {
    DownloaderMachine machine;
    Download father;
    public secondSpaceCheck(DownloaderMachine dm, Download download) {
        this.father = download;
        this.machine = dm;
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
        System.out.println("enter secondSpaceCheck state");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(machine.getCurrFreeSpace()>=machine.getMovieSize()){
            machine.getCurrMachineState().initDownloadingStatus(machine.getMovieSize());
            father.setCurrState(father.getDownloadingMovie());

        }
        else {
            father.setCurrState(father.getDeletingMovie());
        }
    }

    @Override
    public void exit() {
        System.out.println("exit secondSpaceCheck state");
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
    public void initDownloadingStatus(int currentMovieSize) {

    }
}
