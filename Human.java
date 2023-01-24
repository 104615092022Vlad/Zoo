public class Human {
    //наименование должности сотрудника зоопарка
    private String nameHuman = "Человек";

    public String getNameHuman() {
        return nameHuman;
    }

    public void setNameHuman(String nameHuman) {
        this.nameHuman = nameHuman;
    }

    //слежение за белкой Стрелкой
    public void watch() {
        System.out.println("Человек следит за белкой Стрелкой");
    }

    //получение укуса от животного
    private boolean injure;

    public boolean getInjure() {
        return injure;
    }

    public void setInjure(boolean injure) {
        this.injure = injure;
    }
}
