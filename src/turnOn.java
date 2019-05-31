public abstract class turnOn implements ImovieDownloader{

    private DownloaderMachine machine;
    private ImovieDownloader requestQState;
    private ImovieDownloader userStatusState;
    private ImovieDownloader internetState;

    public turnOn(DownloaderMachine machine) {
        this.machine = machine;
        requestQState = new requestQueue(machine);
        userStatusState = new userStatus(machine);
        internetState = new Internet(machine);
    }

    @Override
    public void handleTurnOn() {

    }

    @Override
    public void handleTurnOff() {

    }
}
