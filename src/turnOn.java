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
        requestQState.restartMovie();
        userStatusState.restartMovie();
        internetState.restartMovie();
    }

    @Override
    public void holdMovie() {
        requestQState.holdMovie();
        userStatusState.holdMovie();
        internetState.holdMovie();
    }

    @Override
    public void movieOff() {
        requestQState.movieOff();
        userStatusState.movieOff();
        internetState.movieOff();
    }

    @Override
    public void resume() {
        requestQState.resume();
        userStatusState.resume();
        internetState.resume();
    }

    @Override
    public void movieOn() {
        requestQState.movieOn();
        userStatusState.movieOn();
        internetState.movieOn();
    }

    @Override
    public void errorFixed() {
        requestQState.errorFixed();
        userStatusState.errorFixed();
        internetState.errorFixed();
    }

    @Override
    public void downloadError() {
        requestQState.downloadError();
        userStatusState.downloadError();
        internetState.downloadError();
    }

    @Override
    public void downloadAborted() {
        requestQState.downloadAborted();
        userStatusState.downloadAborted();
        internetState.downloadAborted();
    }

    @Override
    public void fileRequest() {
        requestQState.fileRequest();
        userStatusState.fileRequest();
        internetState.fileRequest();
    }

    @Override
    public void internetOff() {
        requestQState.internetOff();
        userStatusState.internetOff();
        internetState.internetOff();
    }

    @Override
    public void internetOn() {
        requestQState.internetOn();
        userStatusState.internetOn();
        internetState.internetOn();
    }

    @Override
    public void removeRequest() {
        requestQState.removeRequest();
        userStatusState.removeRequest();
        internetState.removeRequest();
    }

    @Override
    public void scoreChanged() {
        requestQState.scoreChanged();
        userStatusState.scoreChanged();
        internetState.scoreChanged();
    }

    @Override
    public void QisNotEmpty() {
        requestQState.QisNotEmpty();
        userStatusState.QisNotEmpty();
        internetState.QisNotEmpty();
    }

    @Override
    public void checkSpace() {
        requestQState.checkSpace();
        userStatusState.checkSpace();
        internetState.checkSpace();
    }

    @Override
    public void updateDownloadStatus() {
        requestQState.updateDownloadStatus();
        userStatusState.updateDownloadStatus();
        internetState.updateDownloadStatus();
    }

    @Override
    public void pauseMovie() {
        requestQState.pauseMovie();
        userStatusState.pauseMovie();
        internetState.pauseMovie();
    }

    @Override
    public void startMovie() {
        requestQState.startMovie();
        userStatusState.startMovie();
        internetState.startMovie();
    }

    @Override
    public void inDeletingMovie() {
        requestQState.inDeletingMovie();
        userStatusState.inDeletingMovie();
        internetState.inDeletingMovie();
    }

    @Override
    public void watching() {
        requestQState.watching();
        userStatusState.watching();
        internetState.watching();
    }

    @Override
    public void downloadingDone() {
        requestQState.downloadingDone();
        userStatusState.downloadingDone();
        internetState.downloadingDone();
    }

    @Override
    public void startMovieFromBeginning() {
        requestQState.startMovieFromBeginning();
        userStatusState.startMovieFromBeginning();
        internetState.startMovieFromBeginning();
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
        requestQState.initDownloadingStatus(movieSize);
        userStatusState.initDownloadingStatus(movieSize);
        internetState.initDownloadingStatus(movieSize);
    }

    public ImovieDownloader getRequestQState() {
        return requestQState;
    }

    public ImovieDownloader getUserStatusState() {
        return userStatusState;
    }

    public ImovieDownloader getInternetState() {
        return internetState;
    }


    @Override
    public void entry() {
        System.out.println("enter turnOn state");
        requestQState.entry();
        userStatusState.entry();
        internetState.entry();
    }

    @Override
    public void exit() {
        requestQState.exit();
        userStatusState.exit();
        internetState.exit();
        System.out.println("exit turnOn state");
    }
}
