public class CallHandler{
    private static CallHandler instance;
    private final int LEVELS = 3;
    private final int NUM_RESPONDENTS = 10;
    private final int NUM_MANAGERS = 4;
    private final int NUM_DIRECTORS = 2;
    List<List<Employee>> employeeLevels;
    List<List<Call>> callQueues;
    protected CallHandler(){}
    public static CallHandler getInstance(){
        if (instance==null) instance = new CallHandler();
        return instance;
    }
    public Employee getHandlerForCall(Call call){}
    public void dispatchCall(Caller caller){
        Call call = new Call(caller);
        dispathCall(call);
    }
    public void dispathCall(Call call){
        Employee emp = getHandlerForCall(call);
        if (emp!=null){
            emp.receiveCall(call);
            call.setHandler(emp);
        }else{
            call.reply("Please wait for free employee to reply");
            callQueues.get(call.getRank().getValue()).add(call);
        }
    }
    public boolean assignCall(Employee emp){}
}

public class Call{
    private Rank rank;
    private Caller caller;
    private Employee handelr;
    public Call(Caller c){
        rank = Rank.Responder;
        caller = c;
    }
    public void setHandler(Employee e){handelr = e;}
    public void reply(String message){}
    public Rank getRank(){ return rank;}
    public void setRank(Rank r){ rank = r;}
    public Rank incrementRank(){}
    public void disconnect(){}
}

abstract class Employee{
    private Call currentCall = null;
    protected Rank rank;
    public Employee(){}
    public void receiveCall(Call call){}
    public void callCompleted(){}
    public void escalateAndReassign(){}
    public boolean assignNewCall(){}
    public boolean isFree(){ return currentCall == null;}
    public Rank getRank(){return rank;}
}

class Director extends Employee{
    public Director(){
        rank = Rank.Director;
    }
}
class Manager extends Employee{
    public Manager(){
        rank = Rank.Manager;
    }
}
class Respondent extends Employee{
    public Respondent(){
        rank = Rank.Respondent;
    }
}

































