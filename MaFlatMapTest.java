import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaFlatMapTest {
    public static void main(String[] args) {


        List<Student> studList = Stream.of(new Student(108, "Murugan", Arrays.asList("Tennis", "Golf")),
                new Student(109, "Gopika", Arrays.asList("RingBall", "Chess")),
                new Student(110, "Velu", Arrays.asList("Football", "Volleyball"))
        ).collect(Collectors.toList());

        System.out.println(studList);
        System.out.println("@@@@@@@@@@@@@@@@ Using map now @@@@@@@@@@@@@@@@@@@@@@@");
        List<List<String>> sportsList = studList.stream().map(stud -> stud.getSports()).collect(Collectors.toList());
        System.out.println(sportsList);


        System.out.println("%%%%%%%%%%%%% Using flat map%%%%%%%%%%%%%%%%%%%%%%%%");
        List<String> sportsListFromFlat = studList.stream().flatMap(student -> student.getSports().stream()).collect(Collectors.toList());
        System.out.println(sportsListFromFlat);
    }


}
