package Constructor;

import java.util.Scanner;

class Book 
{
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) 
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getAuthor() 
    {
        return author;
    }

    public String getIsbn() 
    {
        return isbn;
    }

    @Override
    public String toString() 
    {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

class BookShelf 
{
    private Book[] books;
    private int numberOfBooks;

    public BookShelf(int capacity) 
    {
        books = new Book[capacity];
        numberOfBooks = 0;
    }

    public void addBook(Book book) 
    {
        if (numberOfBooks < books.length) 
        {
            books[numberOfBooks] = book;
            numberOfBooks++;
            System.out.println("Book added successfully.");
        } 
        else 
        {
            System.out.println("The bookshelf is full. Cannot add more books.");
        }
    }
    public void removeBook(String isbnToRemove) 
    {
        for (int i = 0; i < numberOfBooks; i++) 
        {
            if (books[i].getIsbn().equals(isbnToRemove)) 
            {
                for (int j = i; j < numberOfBooks - 1; j++) 
                {
                    books[j] = books[j + 1];
                }
                books[numberOfBooks - 1] = null;
                numberOfBooks--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayBooks() 
    {
        if (numberOfBooks == 0) 
        {
            System.out.println("The bookshelf is empty.");
        } 
        else 
        {
            System.out.println("Books in the bookshelf:");
            for (int i = 0; i < numberOfBooks; i++) 
            {
                System.out.println(books[i]);
            }
        }
    }
}

public class AddRemoveBook 
{
	public static void main(String[] args)
	{
		Scanner xyz = new Scanner(System.in);
        BookShelf shelf = new BookShelf(5);

        System.out.println("Welcome to the Bookshelf Manager!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");

            int choice = xyz.nextInt();
            xyz.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter book title:");
                    String title = xyz.nextLine();
                    System.out.println("Enter author:");
                    String author = xyz.nextLine();
                    System.out.println("Enter ISBN:");
                    String isbn = xyz.nextLine();
                    shelf.addBook(new Book(title, author, isbn));
                    break;
                case 2:
                	System.out.println("Enter ISBN of the book to remove:");
                    String isbnToRemove = xyz.nextLine();
                    shelf.removeBook(isbnToRemove);
                    break;
                case 3:
                    shelf.displayBooks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    xyz.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
	}
}





