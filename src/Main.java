public class Main {
    public static void main(String args[]){
        DownloaderMachine machine = new DownloaderMachine();
        machine.currMachineState.turnOn();
        machine.setMovieSize(30);
        machine.currMachineState.internetOn();
        machine.currMachineState.QisNotEmpty();
        machine.currMachineState.turnOff();
    }
}
