import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        //создаю персонал зоопарка
        ZooKeeper keeper = new ZooKeeper("Смотритель");
        Veterinarian vet = new Veterinarian("Ветеринар");

        //создаю кошек и даю им имена
        Cats lion = new Cats("лев Кузя");
        Cats tiger = new Cats("тигр Жора");

        //создаю бегемота и даю ему имя
        Hippopotamus hippo = new Hippopotamus("бегемот Дося");

        //создаю белок и даю им имена
        Squirrel squirrel_1 = new Squirrel("белка Стрелка", r.nextBoolean());
        Squirrel squirrel_2 = new Squirrel("белка Ловкач", false);

        //объявляю сотрудников зоопарка
        System.out.print("Работники зоопарка: ");
        System.out.println(keeper.getNameHuman() + ", " + vet.getNameHuman());

        //объявляю обитателей зоопарка
        System.out.print("Обитатели зоопарка: ");
        System.out.println(lion.getName() + ", " + tiger.getName() + ", " + hippo.getName() + ", " + squirrel_1.getName() + ", " + squirrel_2.getName());
        System.out.println();
        System.out.println("      Симуляция событий");
        System.out.println();
        System.out.println("        Первый осмотр");

        //осмотр животных

        //осмотр льва Кузи ветеринаром
        vet.inspection(lion, vet);

        //осмотр льва Кузи смотрителем
        keeper.inspectionCats(lion, keeper, vet);

        //осмотр тигра Жоры ветеринаром
        vet.inspection(tiger, vet);

        //осмотр тигра Жоры смотрителем
        keeper.inspectionCats(tiger, keeper, vet);

        //осмотр бегемота Доси ветеринаром
        vet.inspection(hippo, vet);

        //осмотр бегемота Доси смотрителем
        keeper.inspectionHippo(hippo, keeper, vet);

        //осмотр белки Стрелки ветеринаром
        vet.inspectionSquirrel1(squirrel_1, vet, keeper);

        //осмотр белки Стрелки смотрителем
        keeper.inspectionSquirrel(squirrel_1, keeper, vet);

        //осмотр белки Ловкач ветеринаром
        vet.inspectionSquirrel2(squirrel_2, vet, keeper);

        //осмотр белки Ловкач смотрителем
        keeper.inspectionSquirrel(squirrel_2, keeper, vet);

        System.out.println("        Второй осмотр");

        keeper.secondInspection(lion, keeper, vet);
        keeper.secondInspection(tiger, keeper, vet);
        keeper.secondInspection(hippo, keeper, vet);
        keeper.secondInspection(squirrel_1, keeper, vet);
        keeper.secondInspection(squirrel_2, keeper, vet);

    }
}


