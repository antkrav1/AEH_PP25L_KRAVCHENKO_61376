public class Person {
    // Pola (cechy) obiektu
    String forename;
    String surname;
    int age;

    // Konstruktor domyślny
    public Person() {
        this.forename = "";
        this.surname = "";
        this.age = 0;
    }

    // Konstruktor z parametrami
    public Person(String forename, String surname, int age) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
    }

    // Metoda wypisująca dane osoby
    public void hiToAll() {
        System.out.println("Cześć! Mam na imię " + forename + " " + surname + " i mam " + age + " lat.");
    }

    // Metoda zwiększająca wiek o 1
    public void growOld() {
        this.age += 1;
    }

    // Getter (pobiera imię)
    public String getName() {
        return this.forename;
    }

    // Setter (ustawia imię)
    public void setName(String forename) {
        this.forename = forename;
    }
}