import org.w3c.dom.ls.LSOutput;

interface Measure{
    int measure(int a, int b);
}
public class LamdaWithParamTest {
    public static void main(String[] args) {
        Measure res = (a,b) -> {
            return a+b;
        };
        System.out.println("@@@@ Final answer : " + res.measure(3,2));
    }



}
