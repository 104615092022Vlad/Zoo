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

    public void inspectionCats(Cats cat, ZooKeeper keeper, Veterinarian vet) {
        System.out.println("Животное " + cat.getName() + " сыто? " + cat.getSatiety());
        keeper.feed(cat);
        System.out.println("Животное " + cat.getName() + " растрёпано? " + cat.getShaggy());
        keeper.groom(cat);
        cat.bite(keeper, cat);
        System.out.println(keeper.getNameHuman() + " был укушен? " + keeper.getInjure());
        if (keeper.getInjure() == true) {
            vet.heal(keeper);
        }
        System.out.println();
    }

    public void inspectionHippo(Hippopotamus hippo, ZooKeeper keeper, Veterinarian vet) {
        System.out.println("Животное " + hippo.getName() + " сыто? " + hippo.getSatiety());
        keeper.feed(hippo);
        System.out.println("Животное " + hippo.getName() + " чисто? " + hippo.getCleanliness());
        keeper.wash(hippo);
        hippo.bite(keeper, hippo);
        System.out.println(keeper.getNameHuman() + " был укушен? " + keeper.getInjure());
        if (keeper.getInjure() == true) {
            vet.heal(keeper);
        }
        System.out.println();
    }

    public void inspectionSquirrel(Squirrel squirrel, ZooKeeper keeper, Veterinarian vet) {
        if (squirrel.getEscape() == true) {
            System.out.println("Животное " + squirrel.getName() + " сбежало. " + keeper.getNameHuman() + " не может выполнить свою работу");
        } else {
            System.out.println("Животное " + squirrel.getName() + " сыто? " + squirrel.getSatiety());
            keeper.feed(squirrel);
            squirrel.bite(keeper, squirrel);
            System.out.println(keeper.getNameHuman() + " был укушен? " + keeper.getInjure());
            if (keeper.getInjure() == true) {
                vet.heal(keeper);
            }
        }
        System.out.println();
    }
    public ZooKeeper(String nameZK) {
        super(nameZK);
    }
}

