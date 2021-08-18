public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int countMiles = service.calculate(3000);
        System.out.println(countMiles);
    }
}