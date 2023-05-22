public class Book {
    private String name;
    private int datePublication;

    public Book(String name, int datePublication) {
        this.name = name;
        this.datePublication = datePublication;
    }

    public String getName() {
        return this.name;
    }

    public int getDatePublication() {
        return this.datePublication;
    }

    public void setDatePublication(int datePublication) {
        this.datePublication = datePublication;
    }
}
