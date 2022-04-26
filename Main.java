public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 10_000;
        int countRublesForMile = service.calculate(ticketPrice);
        System.out.println("Количество бонусных миль: " + countRublesForMile);
    }
}
