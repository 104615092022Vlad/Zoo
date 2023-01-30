public class Veterinarian extends Human {

    //осмотр животного и помещение в карантин при необходимости
    public void examination(Animal animal) {
        if (animal.getSick() == true) {
            System.out.println("Животное " + animal.getName() + " больно");
            animal.setToBeIsolated(true);
            System.out.println("Животное " + animal.getName() + " помещено в карантин");
        } else {
            System.out.println("Животное " + animal.getName() + " здорово");
        }
    }

    //извлечение животного из карантина
    public void getFromIsolation(Animal animal) {
        if (animal.getSick() == true) {
            System.out.println("Животное " + animal.getName() + " больно и остаётся лечиться");
        } else {
            System.out.println("Животное " + animal.getName() + " выздоровело и возвращается из карантина");
            animal.setToBeIsolated(false);
        }
    }

    //лечение при необходимости
    public void heal(Human human) {
        if (human.getInjure() == true) {
            if (human.getNameHuman() == "Ветеринар") {
                System.out.println("Повязка наложена " + "Ветеринару");
            }
            if (human.getNameHuman() == "Смотритель") {
                System.out.println("Повязка наложена " + "Смотрителю");
            }
        }
    }
    public Veterinarian() {
    }
}

