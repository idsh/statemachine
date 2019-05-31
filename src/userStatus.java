
public class userStatus implements ImovieDownloader {

    private DownloaderMachine machine;
    private internetOn father;
    private ImovieDownloader currState;

    private beginner beginner;
    private advanced advanced;
    private professional professional;
    private double speedRate;

    public double getSpeedRate() {
        return speedRate;
    }

    public void setSpeedRate(double speedRate) {
        this.speedRate = speedRate;
    }

    public userStatus(DownloaderMachine DM, internetOn father){
        currState = new beginner(DM,this);
        speedRate = 1;
        this.father = father;
        this.machine = DM;

        beginner = new beginner(DM,this);
        advanced = new advanced(DM,this);
        professional = new professional(DM,this);
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

    public void setFather(internetOn father) {
        this.father = father;
    }

    public beginner getBeginner() {
        return beginner;
    }

    public void setBeginner(beginner beginner) {
        this.beginner = beginner;
    }

    public advanced getAdvanced() {
        return advanced;
    }

    public void setAdvanced(advanced advanced) {
        this.advanced = advanced;
    }

    public professional getProfessional() {
        return professional;
    }

    public void setProfessional(professional professional) {
        this.professional = professional;
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

    @Override
    public ImovieDownloader getCurrState() {
        return null;
    }

    @Override
    public void setCurrState(ImovieDownloader state) {
        currState.exit();
        this.currState = state;
        currState.entry();
    }
}
