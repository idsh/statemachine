public abstract class turnOn implements ImovieDownloader{

    private DownloaderMachine machine;
    private ImovieDownloader requestQState;
    private ImovieDownloader userStatusState;
    private ImovieDownloader internetState;

    public turnOn(DownloaderMachine machine) {
        this.machine = machine;
        requestQState = new requestQueue(machine);
        userStatus = new userStatus(machine);
        internetState = new
    }

    @Override
    public void handleTurnOn() {

    }

    @Override
    public void handleTurnOff() {

    }
}
