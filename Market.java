import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> queue;
    private List<Actor>  initActor() {
        List<Actor> actors = new ArrayList<Actor>();
        actors.add(new Human("Grisha"));
        actors.add(new Human("Misha"));
        actors.add(new Human("Anton"));

        return actors;
    }
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " is accepting market");

    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        System.out.println(actorList + " is releasing market");

    }

    @Override
    public void update() {
        System.out.println(queue);

    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " is taking a market");

    }

    @Override
    public void takeOrders() {
        System.out.println(queue);

    }

    @Override
    public void giveOrders() {
        System.out.println(queue);

    }

    @Override
    public void releaseFromQueue() {
        System.out.println(queue);

    }
}
