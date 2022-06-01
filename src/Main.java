
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Астрид", "Линдгрен");
        Author author2 = new Author("Астрид", "Линдгрен");

        Book book1 = new Book("Малыш и Карлосон", author1,1955);
        Book book2 = new Book("Карлосон,который живёт на крыше", author2,1962);

        System.out.println(book1.getTitle() + "" + book1.getYear() + "" + book1.getAuthor().getName() + "" + book1.getAuthor().getSurname());
        System.out.println(book2.getTitle() + "" + book2.getYear() + "" + book2.getAuthor().getName() + "" + book2.getAuthor().getSurname());
    }
}