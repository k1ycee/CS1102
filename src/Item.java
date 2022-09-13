class CostCalculationException extends Exception{}
class Item {
    public void calculateCost() throws CostCalculationException {
        //...
        throw new CostCalculationException();
        //...
    }
}
class Company {
    public void payCost(){
        try {
            new Item().calculateCost();
        } catch (CostCalculationException e) {
            throw new RuntimeException(e);
        }
    }
}