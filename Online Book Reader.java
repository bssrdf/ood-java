public class OnlineReaderSystem{
    private Library library;
    private UserManager userManager;
    private Display display;
    private Book activeBook;
    private User activeUser;

    public OnlineReaderSystem(){
        userManager = new UserManager();
        library = new Library();
        display = new Display();
    }

    public Library getLibrary(){}
    public UserManager getUserManager(){}
    public Display getDisplay(){}
    public Book getActiveBook(){}
    public void setActiveBook(Book book){}
    public User getActiveUser(){}
    public void setActiveUser(User user){}

}

public class Library{
    private Hashtable<Integer, Book> books;
    public Book addBook(int id, String details){
        if (books.containsKey(id)){
            return null;
        }
        Book book = new Book(id, details);
        books.put(id, book);
        return book;
    }
    public boolean remove(Book b){}
    public boolean remove(int id){
        if (!books.containsKey(id)){
            return false;
        }
        books.remove(id);
        return true;
    }
    public Book find(int id){
        return book.get(id);
    }
}

public class UserManager{
    private Hashtable<Integer, User> users;
    public User addUser(int id, String details, int accountType){}
    public boolean remove(User u){}
    public boolean remove(int id){}
    public User find(int id){}
}

public class Display{
    private Book activeBook;
    private User activeUser;
    private int pageNumber = 0;

    public void displayUser(User user){}
    public void displayBook(Book book){}
    public void turnPageForward(){}
    public void turnPageBackward(){}
    public void refreshUsername(){}
    public void refreshTitle(){}
    public void refreshDetails(){}
    public void refreshPage(){}
}

public class Book{
    private int bookId;
    private String details;
    public Book(int id, String det){}
    public int getID(){}
    public void setID(int id){}
    public String getDetails(){}
    public void setDetails(String d){}

}

public class User{
    private int userId;
    private String details;
    private int accountType;
    public void renewMembership(){}
    public User(int id, String details, int accountType){}
    public int getID(){}
    public void setID(int id){}
    public String getDetails(){}
    public void setDetails(String d){}
    public int getAccountType(){}
    public void setAccountType(int t){}
}

