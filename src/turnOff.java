public class turnOff implements ImovieDownloader{

    private DownloaderMachine currState;

    public turnOff(DownloaderMachine currState) {
        this.currState = currState;
    }

    @Override
    public void handleTurnOn() {

    }

    @Override
    public void handleTurnOff() {

    }
}
