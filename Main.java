public class Main {
    public static void main(String[] args) {
        //создаю персонал зоопарка
        ZooKeeper keeper = new ZooKeeper();
        Veterinarian vet = new Veterinarian();
        keeper.setNameHuman("Смотритель");
        vet.setNameHuman("Ветеринар");

        //создаю кошек и даю им имена
        Cats lion = new Cats();
        Cats tiger = new Cats();
        lion.setName("лев Кузя");
        tiger.setName("тигр Жора");

        //создаю бегемота и даю ему имя
        Hippopotamus hippo = new Hippopotamus();
        hippo.setName("бегемот Дося");

        //создаю белок и даю им имена
        Squirrel squirrel_1 = new Squirrel();
        Squirrel squirrel_2 = new Squirrel();
        squirrel_1.setName("белка Стрелка");
        squirrel_2.setName("белка Ловкач");

        //объявляю сотрудников зоопарка
        System.out.print("Работники зоопарка: ");
        System.out.println(keeper.getNameHuman() + ", " + vet.getNameHuman());

        //объявляю обитателей зоопарка
        System.out.print("Обитатели зоопарка: ");
        System.out.println(lion.getName() + ", " + tiger.getName() + ", " + hippo.getName() + ", " + squirrel_1.getName() + ", " + squirrel_2.getName());
        System.out.println();
        System.out.println("      Симуляция событий");
        System.out.println();

        //осмотр животных

        //осмотр льва Кузи ветеринаром
        System.out.println("Животное " + lion.getName() + " в карантине? " + lion.getToBeIsolated());
        System.out.println(vet.getNameHuman() + " осматривает " + lion.getName());
        if (lion.getToBeIsolated() == true) {
            vet.getFromIsolation(lion);
            lion.bite(vet, lion);
            System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
            if (vet.getInjure() == true) {
                vet.heal(vet);
            }
        } else {
            vet.examination(lion);
            lion.bite(vet, lion);
            System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
            if (vet.getInjure() == true) {
                vet.heal(vet);
            }
        }
        //осмотр льва Кузи смотрителем
        System.out.println("Животное " + lion.getName() + " сыто? " + lion.getSatiety());
        keeper.feed(lion);
        System.out.println("Животное " + lion.getName() + " растрёпано? " + lion.getShaggy());
        keeper.groom(lion);
        lion.bite(keeper, lion);
        System.out.println(keeper.getNameHuman() + " был укушен? " + keeper.getInjure());
        if (keeper.getInjure() == true) {
            vet.heal(keeper);
        }
        System.out.println();

        //осмотр тигра Жоры ветеринаром
        System.out.println("Животное " + tiger.getName() + " в карантине? " + tiger.getToBeIsolated());
        System.out.println(vet.getNameHuman() + " осматривает " + tiger.getName());
        if (tiger.getToBeIsolated() == true) {
            vet.getFromIsolation(tiger);
            tiger.bite(vet, tiger);
            System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
            if (vet.getInjure() == true) {
                vet.heal(vet);
            }
        } else {
            vet.examination(tiger);
            tiger.bite(vet, tiger);
            System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
            if (vet.getInjure() == true) {
                vet.heal(vet);
            }
        }
        //осмотр тигра Жоры смотрителем
        System.out.println("Животное " + tiger.getName() + " сыто? " + tiger.getSatiety());
        keeper.feed(tiger);
        System.out.println("Животное " + tiger.getName() + " растрёпано? " + tiger.getShaggy());
        keeper.groom(tiger);
        tiger.bite(keeper, tiger);
        System.out.println(keeper.getNameHuman() + " был укушен? " + keeper.getInjure());
        if (keeper.getInjure() == true) {
            vet.heal(keeper);
        }
        System.out.println();

        //осмотр бегемота Доси ветеринаром
        System.out.println("Животное " + hippo.getName() + " в карантине? " + hippo.getToBeIsolated());
        System.out.println(vet.getNameHuman() + " осматривает " + hippo.getName());
        if (hippo.getToBeIsolated() == true) {
            vet.getFromIsolation(hippo);
            hippo.bite(vet, hippo);
            System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
            if (vet.getInjure() == true) {
                vet.heal(vet);
            }
        } else {
            vet.examination(hippo);
            hippo.bite(vet, hippo);
            System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
            if (vet.getInjure() == true) {
                vet.heal(vet);
            }
        }
        //осмотр бегемота Доси смотрителем
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

        //осмотр белки Стрелки ветеринаром
        System.out.println("Животное " + squirrel_1.getName() + " в карантине? " + squirrel_1.getToBeIsolated());
        System.out.println("Животное " + squirrel_1.getName() + " на месте? " + !squirrel_1.getEscape());
        if (squirrel_1.getEscape() == true) {
            System.out.println("Животное " + squirrel_1.getName() + " сбежало");
            keeper.search(squirrel_1, keeper);
        } else {
            System.out.println(vet.getNameHuman() + " осматривает " + squirrel_1.getName());
            if (squirrel_1.getToBeIsolated() == true) {
                vet.getFromIsolation(squirrel_1);
                squirrel_1.bite(vet, squirrel_1);
                System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
                if (vet.getInjure() == true) {
                    vet.heal(vet);
                }
            } else {
                vet.examination(squirrel_1);
                squirrel_1.bite(vet, squirrel_1);
                System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
                if (vet.getInjure() == true) {
                    vet.heal(vet);
                }
            }
        }
        //осмотр белки Стрелки смотрителем
        if (squirrel_1.getEscape() == true) {
            System.out.println("Животное " + squirrel_1.getName() + " сбежало. " + keeper.getNameHuman() + " не может выполнить свою работу");
        } else {
            System.out.println("Животное " + squirrel_1.getName() + " сыто? " + squirrel_1.getSatiety());
            keeper.feed(squirrel_1);
            hippo.bite(keeper, squirrel_1);
            System.out.println(keeper.getNameHuman() + " был укушен? " + keeper.getInjure());
            if (keeper.getInjure() == true) {
                vet.heal(keeper);
            }
        }
        System.out.println();

        //осмотр белки Ловкач ветеринаром
        System.out.println("Животное " + squirrel_2.getName() + " в карантине? " + squirrel_2.getToBeIsolated());
        System.out.println("Животное " + squirrel_2.getName() + " на месте? " + !squirrel_2.getEscape());
        if (squirrel_2.getEscape() == true) {
            System.out.println("Животное " + squirrel_2.getName() + " сбежало");
            keeper.search(squirrel_2, keeper);
        } else {
            System.out.println(vet.getNameHuman() + " осматривает " + squirrel_2.getName());
            if (squirrel_2.getToBeIsolated() == true) {
                vet.getFromIsolation(squirrel_2);
                squirrel_2.bite(vet, squirrel_2);
                System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
                if (vet.getInjure() == true) {
                    vet.heal(vet);
                }
            } else {
                vet.examination(squirrel_2);
                squirrel_2.bite(vet, squirrel_2);
                System.out.println(vet.getNameHuman() + " был укушен? " + vet.getInjure());
                if (vet.getInjure() == true) {
                    vet.heal(vet);
                }
            }
        }
        //осмотр белки Ловкач смотрителем
        if (squirrel_2.getEscape() == true) {
            System.out.println("Животное " + squirrel_2.getName() + " сбежало. " + keeper.getNameHuman() + " не может выполнить свою работу");
        } else {
            System.out.println("Животное " + squirrel_2.getName() + " сыто? " + squirrel_2.getSatiety());
            keeper.feed(squirrel_2);
            squirrel_2.bite(keeper, squirrel_2);
            System.out.println(keeper.getNameHuman() + " был укушен? " + keeper.getInjure());
            if (keeper.getInjure() == true) {
                vet.heal(keeper);
            }
            System.out.println();
        }
    }
}

