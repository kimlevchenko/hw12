public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Diane", "Setterfield");
        Book book1 = new Book("Once upon a river", 2018, author1);
        Author author2 = new Author("Scarlett", "Thomas");
        Book book2 = new Book("Our tragic universe", 2010, author2);
        System.out.println("Book 1 = " + author1.getName() + " " + author1.getLastName() + " " + book1.getName() + " " + book1.getDatePublication());
        System.out.println("Book 2 = " + author2.getName() + " " + author2.getLastName() + " " + book2.getName() + " " + book2.getDatePublication());

        book1.setDatePublication(2020);
        System.out.println("book1.getDatePublication() = " + book1.getDatePublication());
    }
}