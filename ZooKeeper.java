public class ZooKeeper extends Human {
    //кормление животных
    public void feed (Animal animal) {
        if (animal.getSatiety() == false) {
            animal.setSatiety(true);
            System.out.println("Животное " + animal.getName() + " накормлено");
        }
    }

    //вычёсывание кошек
    public void groom (Cats cat) {
        if (cat.getShaggy() == true) {
            cat.setShaggy(false);
            System.out.println("Животное " + cat.getName() + " вычесано");
        }
    }

    //мытьё бегемота
    public void wash (Hippopotamus hippo) {
        if (hippo.getCleanliness() == false) {
            hippo.setCleanliness(true);
            System.out.println("Животное " + hippo.getName() + " вымыто");
        }
    }

    //поиск сбежавшей белки
    public void search (Squirrel squirrel, Human human) {
            System.out.println(human.getNameHuman() + " отправляется на поиски животного " + squirrel.getName());
            if (squirrel.getFind() == true) {
                squirrel.setEscape(false);
                System.out.println(human.getNameHuman() + " возвращает животное " + squirrel.getName() + " в зоопарк");
            } else {
                System.out.println(human.getNameHuman() + " не нашёл животное " + squirrel.getName());
            }
    }
}

