class Author {
     String name;
     String email;
     char gender;

    // Parameterized Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
 
    @Override   //The @Override annotation is used in Java to indicate that a method is overriding a method in its superclass. If you override a method in the subclass, it means you are providing a new version of that method in the subclass, which will be used instead of the version in the superclass.
    public String toString() {
        return "Author Name: " + name + "\nAuthor Email: " + email;
    }
}

class Book {
     String name;
     Author author; // Author object
     double price;
     int qtyInStock;

    // Parameterized Constructor
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {  //This overridden toString() method in the Book class provides a string representation of a Book object.
        return "Book Name: " + name + "\nPrice: " + price + "\nQuantity in Stock: " + qtyInStock + "\n" + author.toString();
    }
}

public class Q21_Author {
    public static void main(String[] args) {
        // Creating an Author object
        Author author = new Author("Louisa May Alcott", "louisa@gmail.com", 'F');

        // Creating a Book object
        Book book = new Book("Little Women", author, 500, 50);

        // Printing details of the book
        System.out.println(book.toString());
    }
}
