package Oops.Collections;

import java.util.*;

public class Main {

    public static void main(String[] args){
        List<Employee> E = Arrays.asList(
                new Employee[]{
                        new Employee(24,"e2",2),
                        new Employee(12,"e3",3),
                        new Employee(89,"e4",5),
                        new Employee(82,"e1",1),
                        new Employee(41,"e5",4)
                }
        );

        EmployeeComparator employeeComparator = new EmployeeComparator();
        Collections.sort(E);
        System.out.println("Id sorting");
        E.forEach(employee -> System.out.println(employee.toString()));
        System.out.println("Exp sorting");
        Collections.sort(E,employeeComparator);
        E.forEach(employee -> System.out.println(employee.toString()));

        Collections.sort(E,employeeComparator);
        E.forEach(employee -> System.out.println(employee.toString()));

        Set<Employee> hashSet = new HashSet<>();
        Set<Employee> linkedSet = new LinkedHashSet<>();
        Set<Employee> treeSet = new TreeSet<>();

        for(Employee e : E){
            hashSet.add(e);
            linkedSet.add(e);
            treeSet.add(e);
        }

        Iterator hs = hashSet.iterator();
        Iterator ls = linkedSet.iterator();
        Iterator ts = treeSet.iterator();
        System.out.println("Hash set");
        while (hs.hasNext()){
            System.out.println(hs.next().toString());
        }
        System.out.println("Linked Hash Set");
        while (ls.hasNext()){
            System.out.println(ls.next().toString());
        }
        System.out.println("Tree Set");
        while (ts.hasNext()){
            System.out.println(ts.next().toString());
        }

    }

}
