public interface ImovieDownloader {

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

    //shelanu
    void removeRequest();
    void scoreChanged();
    void QisNotEmpty();
    void checkSpace();
    void updateDownloadStatus();
    void pauseMovie();
    void startMovie();
    void inDeletingMovie();
    void watching();
    void downloadingDone();
    void handleInternetOn();
    void handleInternetOff();
    void handleTurnOn();
    void handleTurnOff();
    void entry();
    void exit();





}
