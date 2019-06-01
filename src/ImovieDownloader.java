import java.util.concurrent.TimeUnit;
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
    void inDeletingMovie();
    void downloadingDone();
    void entry();
    void exit();
    ImovieDownloader getCurrState();
    void setCurrState(ImovieDownloader state);
    void initDownloadingStatus(int movieSize);
}
