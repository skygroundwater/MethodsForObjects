public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("George "," Orwell ");
        Book book1 = new Book(" 1984", author1, 1949);

        Author author2 = new Author("Star","  Gardt ");
        Book book2 = new Book("Мобилизованная нация ", author2, 1949);

        Author author3 = new Author("Лев ", "Толстой");
        Book book3 = new Book(" Война и мир", author3, 1863);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book1.equals(book3));
        System.out.println(author1);
    }
}