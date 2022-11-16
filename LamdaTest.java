interface Calculate{
    void calculate();
}
public class LamdaTest {
    public static void main(String[] args) {
        Calculate cal = () -> {
            System.out.println("Calculate is overriden using lamda");
        };
        cal.calculate();

    }
}
