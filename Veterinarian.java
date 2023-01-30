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

    public void inspection(Animal animal, Veterinarian vet){
        System.out.println("Животное " + animal.getName() + " в карантине? " + animal.getToBeIsolated());
        System.out.println(vet.getNameHuman() + " осматривает " + animal.getName());
        if (animal.getToBeIsolated() == true) {
            vet.getFromIsolation(animal);
            animal.bite(vet, animal);
            System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
            if (vet.getInjure() == true) {
                vet.heal(vet);
            }
        } else {
            vet.examination(animal);
            animal.bite(vet, animal);
            System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
            if (vet.getInjure() == true) {
                vet.heal(vet);
            }
        }
    }

    public void inspectionSquirrel1(Squirrel squirrel, Veterinarian vet, ZooKeeper keeper) {
        System.out.println("Животное " + squirrel.getName() + " в карантине? " + squirrel.getToBeIsolated());
        System.out.println("Животное " + squirrel.getName() + " на месте? " + !squirrel.getEscape());
        if (squirrel.getEscape() == true) {
            System.out.println("Животное " + squirrel.getName() + " сбежало");
            keeper.search(squirrel, keeper);
        } else {
            System.out.println(vet.getNameHuman() + " осматривает " + squirrel.getName());
            if (squirrel.getToBeIsolated() == true) {
                vet.getFromIsolation(squirrel);
                squirrel.bite(vet, squirrel);
                System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
                if (vet.getInjure() == true) {
                    vet.heal(vet);
                }
            } else {
                vet.examination(squirrel);
                squirrel.bite(vet, squirrel);
                System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
                if (vet.getInjure() == true) {
                    vet.heal(vet);
                }
            }
        }
    }

    public void inspectionSquirrel2(Squirrel squirrel, Veterinarian vet, ZooKeeper keeper) {
        System.out.println("Животное " + squirrel.getName() + " в карантине? " + squirrel.getToBeIsolated());
            System.out.println(vet.getNameHuman() + " осматривает " + squirrel.getName());
            if (squirrel.getToBeIsolated() == true) {
                vet.getFromIsolation(squirrel);
                squirrel.bite(vet, squirrel);
                System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
                if (vet.getInjure() == true) {
                    vet.heal(vet);
                }
            } else {
                vet.examination(squirrel);
                squirrel.bite(vet, squirrel);
                System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
                if (vet.getInjure() == true) {
                    vet.heal(vet);
                }
            }
        }

    public Veterinarian(String nameV) {
        super(nameV);
    }
}

