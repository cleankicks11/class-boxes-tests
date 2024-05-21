import java.util.*;

class Book {
    private int id;
    private String name;
    private String author;
    private String desc;
    private int stock;

    public Book(int id, String name, String author, String desc, int stock) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.desc = desc;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDesc() {
        return desc;
    }

    public int getStock() {
        return stock;
    }
}

public class MyBookLibrary {
    private Map<Integer, Book> books;

    public MyBookLibrary() {
        books = new HashMap<>();
        // Hardcoding 5 books
        books.put(1, new Book(1, "War and Peace", "Tolstoy", "Philosphy Novel", 10));
        books.put(2, new Book(2, "Blade", "Marvel", "Undead Vampire Comic", 5));
        books.put(3, new Book(3, "To Kill A Mockingbird", "Harper Lee", "Social Critique", 15));
        books.put(4, new Book(4, "The Odessy", "Plato", "Heros journey", 20));
        books.put(5, new Book(5, "The 7 Habits of Highly Effective People", "Stephen R. Covey", "Self help", 8));
    }

    public void listAllBooks() {
        List<Book> sortedBooks = new ArrayList<>(books.values());
        sortedBooks.sort(Comparator.comparing(Book::getId));
        for (Book book : sortedBooks) {
            System.out.println("\nBook ID: " + book.getId() + "\nName: " + book.getName() + "\nAuthor: " + book.getAuthor() + "\nDesc: " + book.getDesc() + "\nStock: " + book.getStock());
        }
    }

    public void getBookDetailsById(int id) {
        Book book = books.get(id);
        if (book != null) {
            System.out.println("\nBook ID: " + book.getId() + "\nName: " + book.getName() + "\nAuthor: " + book.getAuthor() + "\nDesc: " + book.getDesc() + "\nStock: " + book.getStock());
        } else {
            System.out.println("Book with ID " + id + " not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBookLibrary library = new MyBookLibrary();
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. List all books sorted by ID");
            System.out.println("2. Get details of a book by ID");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    library.listAllBooks();
                    break;
                case 2:
                    System.out.print("Enter the book ID: ");
                    int bookId = scanner.nextInt();
                    library.getBookDetailsById(bookId);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 3);
        scanner.close();
    }
}

