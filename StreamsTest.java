import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String id;
    String name;
    double salary;
    Employee(String id, String name, double salary){
        this.id = id;
        this.name = name;
       this. salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class StreamsTest {
    public static void main(String[] args) {
        Integer[] salArr = new Integer[]{2500,500, 3500, 450};
        List<Integer> salList = Arrays.asList(salArr);

        salList.forEach(x -> System.out.println("@@@ printing normally ... " + x));
        System.out.println("===========================================");
        salList.stream().forEach(z -> System.out.println("!!!! print using stream ..." + z));
        System.out.println("===========================================");
        salList.stream().filter(s->s<1000).forEach(y-> System.out.println("**** Salaries lesser than 1000 : "+y));

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("101", "Mukesh", 13478));
        empList.add(new Employee("102", "Kamal", 7800));
        empList.add(new Employee("105", "Nagma", 35000));


        Map<String, Employee> empMap = new HashMap<>();
        empMap.put("1001", new Employee("1001", "Subramani", 555000));
        empMap.put("1002", new Employee("1002", "Kumar", 1035000));
        empMap.put("1003", new Employee("1003", "Kalyani", 148000));


//        List<Employee> filList = empList.stream().filter(e -> e.salary<15000)
//
//                .collect(Collectors.toList());

        empList.stream().filter(e -> e.salary<15000)

                .forEach(x -> System.out.println(x.name));


        System.out.println("++++++++++++++++++ Now Sorting in ascending order+++++++++++++++++++++++++");
        empList.stream().sorted((o1,o2)-> (int) (o1.salary-o2.salary)).forEach(System.out::println);

        System.out.println("++++++++++++++++++ Now Sorting in ascending order based on salary but a different way  +++++++++++++++++++++++++");
        empList.stream().sorted(Comparator.comparing(f->f.salary)).forEach(System.out::println);

        System.out.println("%%%%%%%%%%%%%%%%% Employee that takes salary less than 15000 from emp map list%%%%%%%%");
        empMap.entrySet().stream().filter(w->w.getValue().salary<150000).forEach(System.out::println);

        System.out.println("################ Sorted employees based on salary from emp map list############");
        empMap.entrySet().stream().sorted((f1,f2)-> (int) ( f1.getValue().salary-f2.getValue().salary))
                .forEach(System.out::println);


        System.out.println("!!!!!!!!!!!!!!!!  Sorted employees based on name in descending order from emp map list !!!!!!!!!!!");
        empMap.entrySet().stream().sorted((t1,t2) -> t2.getValue().name.compareTo(t1.getValue().name)).forEach(System.out::println);


        System.out.println("@@@@@@@@@@@@ Sorting employees from empMap in ascending order by a different way");
        empMap.entrySet().stream().sorted(Comparator.comparing(h->h.getValue().name)).forEach(System.out::println);



    }
}
