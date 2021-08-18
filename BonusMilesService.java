public class BonusMilesService {
    public int calculate(int priceTicket) {
        int priceMile = 20;
        int countMiles = priceTicket / priceMile;
        return countMiles;
    }
}
