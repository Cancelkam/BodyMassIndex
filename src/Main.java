public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float mass = 60;
        float height = (float) 1.8;
        float bmi = service.calculate(mass,height);
        System.out.println(bmi);
    }
}
