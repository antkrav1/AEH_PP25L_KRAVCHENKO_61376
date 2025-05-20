public class mojaSiodmaAplikacja {
    public static void main(String[] args) {
        // Utworzenie obiektu person1 z domyślnymi parametrami
        Person person1 = new Person();
        person1.hiToAll(); // wyświetlenie domyślnych (pustych) danych

        // Przypisanie wartości do pól obiektu
        person1.forename = "Mateusz";
        person1.surname = "Karmazyn";
        person1.age = 24;
        person1.hiToAll(); // wyświetlenie przypisanych danych

        // Utworzenie drugiego obiektu za pomocą konstruktora z parametrami
        Person person2 = new Person("Dariusz", "Walendziak", 42);
        person2.hiToAll();

        // Zwiększanie wieku
        person1.growOld(); // person1 +1 rok
        for (int i = 0; i < 3; i++) {
            person2.growOld(); // person2 +3 lata
        }

        // Wyświetlenie zmienionych danych
        person1.hiToAll();
        person2.hiToAll();

        // Użycie getterów i setterów
        System.out.println("Imię przed zmianą: " + person1.getName());
        person1.setName("Lolo");
        System.out.println("Imię po zmianie: " + person1.getName());
        person1.hiToAll();
    }
}
