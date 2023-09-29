
public class Main {
    public static void main(String[] args) {

            phoneBook phoneBook = new phoneBook();
            phoneBook.add("123456789", "Ксана Сидорук");
            phoneBook.add("987654321", "Иван");
            phoneBook.add("456789123", "Алексей федоров");
            phoneBook.add("321654987", "Илья");
            phoneBook.add("789123456", "Алексадр");

            System.out.println(phoneBook.getPhoneNum("123456789"));
            System.out.println(phoneBook.getByName("Ксана"));
            System.out.println(phoneBook.getAll());
    }
}
