package Oops.Collections;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee a, Employee b) {
        if(a.getExp()>b.getExp())return 1;
        if(a.getExp()<b.getExp())return -1;
        return 0;
    }

}
