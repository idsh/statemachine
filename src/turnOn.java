public class turnOn implements ImovieDownloader{

    private DownloaderMachine machine;
    private ImovieDownloader requestQState;
    private ImovieDownloader userStatusState;
    private ImovieDownloader internetState;

    public turnOn(DownloaderMachine machine) {
        this.machine = machine;
        requestQState = new requestQueue(machine, this);
        userStatusState = new userStatus(machine, this);
        internetState = new Internet(machine);
    }


    @Override
    public void turnOff() {
        requestQState.turnOff();
        requestQState.exit();
        userStatusState.turnOff();
        userStatusState.exit();
        internetState.turnOff();
        internetState.exit();
        this.exit();
    }

    @Override
    public void turnOn() {
        this.entry();
        requestQState.turnOn();
        requestQState.entry();
        userStatusState.turnOn();
        userStatusState.entry();
        internetState.turnOn();
        internetState.entry();
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
        System.out.println("enter turnOn state");
    }

    @Override
    public void exit() {
        System.out.println("exit turnOn state");
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

    public DownloaderMachine getMachine() {
        return machine;
    }

    public void setMachine(DownloaderMachine machine) {
        this.machine = machine;
    }

    public ImovieDownloader getRequestQState() {
        return requestQState;
    }

    public void setRequestQState(ImovieDownloader requestQState) {
        this.requestQState = requestQState;
    }

    public ImovieDownloader getUserStatusState() {
        return userStatusState;
    }

    public void setUserStatusState(ImovieDownloader userStatusState) {
        this.userStatusState = userStatusState;
    }

    public ImovieDownloader getInternetState() {
        return internetState;
    }

    public void setInternetState(ImovieDownloader internetState) {
        this.internetState = internetState;
    }

}
