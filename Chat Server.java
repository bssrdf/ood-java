public class UserManager{
    private static UserManager instance;
    private HashMap<Integer, User> usersById;
    private HashMap<String, User> usersByAccountName;
    private HashMap<Integer, User> onlineUsers;
    public static UserManager getInstance(){}
    public void addUser(User fromUser, String toAccountName){}
    public void approveAddRequest(AddRequest req){}
    public void rejectAddRequest(AddRequest req){}
    public void userSignedOn(String accountName){}
    public void userSignedOff(String accountName){}
}

public class User{}
public abstract class Conversation{}
public class GroupChat extends Conversation{}
public class PrivateChat extends Conversation{} 
public class Message{}
public class AddRequest{}
public class UserStatus{}

