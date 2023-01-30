import java.util.Random;
public class Squirrel extends Animal{
    Random r = new Random();

    //свойство покидать зоопарк
    private boolean escape = r.nextBoolean();

    public boolean getEscape() {
        return escape;
    }

    public void setEscape(boolean escape) {
        this.escape = escape;
    }

    //свойство быть обнаруженной в случае побега
    private boolean find = r.nextBoolean();

    public boolean getFind() {
        return find;
    }

    public void setFind(boolean find) {
        this.find = find;
    }

    public Squirrel(String name, boolean escape) {
        super(name);
        this.escape = escape;
    }
}
