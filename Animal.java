import java.util.Random;
public class Animal {
    Random r = new Random();

    //имя животного
    private String name = "Животное";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //способность кусаться
    public void bite(Human human, Animal animal) {
        human.setInjure(r.nextBoolean());
        if (human.getInjure() == true) {
            System.out.println(human.getNameHuman() + " укушен");
        } else {
            System.out.println("Животное " + animal.getName() + " спокойно");
        }
    }

    //свойство быть больным
    private boolean sick = r.nextBoolean();

    public boolean getSick() {
        return sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

    //пребываение в карантине
    private boolean toBeIsolated = r.nextBoolean();

    public boolean getToBeIsolated() {
        return toBeIsolated;
    }

    public void setToBeIsolated(boolean isolation) {
        this.toBeIsolated = isolation;
    }

    //сытость
    private boolean satiety = r.nextBoolean();

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Animal(String name) {
        this.name = name;
    }
}

