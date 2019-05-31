
public class userStatus implements ImovieDownloader {


    private DownloaderMachine machine;
    private turnOn father;
    private ImovieDownloader currState;

    private beginner beginner;
    private advanced advanced;
    private professional professional;
    private double speedRate;

    public userStatus(DownloaderMachine DM, turnOn father){
        currState = new beginner(DM,this);
        speedRate = 1;
        this.father = father;
        this.machine = DM;

        beginner = new beginner(DM,this);
        advanced = new advanced(DM,this);
        professional = new professional(DM,this);
    }

    public double getSpeedRate() {
        return speedRate;
    }

    public void setSpeedRate(double speedRate) {
        this.speedRate = speedRate;
    }

    public turnOn getFather() {
        return father;
    }

    public beginner getBeginner() {
        return beginner;
    }

    public advanced getAdvanced() {
        return advanced;
    }

    public professional getProfessional() {
        return professional;
    }

    @Override
    public void restartMovie() {
        currState.restartMovie();
    }

    @Override
    public void holdMovie() {
        currState.holdMovie();
    }

    @Override
    public void movieOff() {
        currState.movieOff();
    }

    @Override
    public void resume() {
        currState.resume();
    }

    @Override
    public void movieOn() {
        currState.movieOn();
    }

    @Override
    public void errorFixed() {
        currState.errorFixed();
    }

    @Override
    public void downloadError() {
        currState.downloadError();
    }

    @Override
    public void downloadAborted() {
        currState.downloadAborted();
    }

    @Override
    public void fileRequest() {
        currState.fileRequest();
    }

    @Override
    public void internetOff() {
        currState.internetOff();
    }

    @Override
    public void internetOn() {
        currState.internetOn();
    }

    @Override
    public void turnOff() {
        currState.turnOff();
    }

    @Override
    public void turnOn() {
        currState.turnOn();
    }

    @Override
    public void removeRequest() {
        currState.removeRequest();
    }

    @Override
    public void scoreChanged() {
        currState.scoreChanged();
    }

    @Override
    public void QisNotEmpty() {
        currState.QisNotEmpty();
    }

    @Override
    public void checkSpace() {
        currState.checkSpace();
    }

    @Override
    public void updateDownloadStatus() {
        currState.updateDownloadStatus();
    }

    @Override
    public void pauseMovie() {
        currState.pauseMovie();
    }

    @Override
    public void startMovie() {
        currState.startMovie();
    }

    @Override
    public void inDeletingMovie() {
        currState.inDeletingMovie();
    }

    @Override
    public void watching() {
        currState.watching();
    }

    @Override
    public void downloadingDone() {
        currState.downloadingDone();
    }

    @Override
    public void startMovieFromBeginning() {
        currState.startMovieFromBeginning();
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
        currState.initDownloadingStatus(movieSize);
    }

    @Override
    public void entry() {
        System.out.println("enter userStatus state");
        currState.entry();
    }

    @Override
    public void exit() {
        currState.exit();
        System.out.println("exit userStatus state");
    }
}
