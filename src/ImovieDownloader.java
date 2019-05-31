public interface ImovieDownloader {
    //???
    void handleTurnOn();
    void handleTurnOff();
    void handleIdleDownloadling();
    void handleFirstSpaceCheck();
    void handleSecondSpaceCheck();
    void handleDeletiMovie();
    void handleErrorOcurred();
    void handleDownloadingMovie();
    void handleIdleWatching();
    void handleWatchingMovie();
    void handlePauseMovie();
    void handleInternetOn();
    void handleInternetOff();
    void removeRequest();
    void handleScoreChange();
    void handleQNotEmptyChange();
    void handleCheckSpace();
    void handleErrorFixed();
    //???

    //events must have by those names
    void restartMovie();
    void holdMovie();
    void movieOff();
    void resume();
    void movieOn();
    void errorFixed();
    void downloadError();
    void downloadAborted();
    void fileRequest();
    void internetOff();
    void internetOn();
    void turnOff ();
    void turnOn();
}
