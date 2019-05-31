import java.util.LinkedList;
import java.util.Queue;

public class queueM extends turnOn implements IRequestQueue{
    @Override
    public void handleTurnOn() {

    }

    @Override
    public void handleTurnOff() {

    }

    private Queue<Integer> q;

    private queueM(){
        q = new LinkedList<>();
    }
}
