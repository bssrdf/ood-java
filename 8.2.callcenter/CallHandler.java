package 8.2.callcenter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CallHandler{
    private static CallHandler instance;
    private final int LEVELS = 3;
    private final int NUM_RESPONDENTS = 10;
    private final int NUM_MANAGERS = 4;
    private final int NUM_DIRECTORS = 2;

    List<List<Employee>> employeeLevels;
    List<List<Call>> callQueues;

    protected CallHandler(){
        employeeLevels = new ArrayList<List<Employee>>(LEVELS);
        callQueues = new ArrayList<List<Call>>(LEVELS);

        ArrayList<Employee> respondents = new ArrayList<Employee>(NUM_RESPONDENTS);
        for (int k = 0; k<NUM_RESPONDENTS-1; k++)  {
            respondents.add(new Respondent());
        }
        employeeLevels.add(respondents);
    

        ArrayList<Employee> managers = new ArrayList<Employee>(NUM_MANAGERS);
        managers.add(new Manager());
        employeeLevels.add(managers);

        // Create directors.
        ArrayList<Employee> directors = new ArrayList<Employee>(NUM_DIRECTORS);
        directors.add(new Director());
        employeeLevels.add(directors);
    }

        public static CallHandler getInstance() {
        if (instance == null) {
            instance = new CallHandler();
        }
        return instance;
    }

    
}
