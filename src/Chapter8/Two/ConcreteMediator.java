package Chapter8.Two;

public class ConcreteMediator {
    RentHouse [] rentHouse;
    BegRentHouse [] begRentHouse;
    public void registerRentHouse(RentHouse [] rentHouse){
        this.rentHouse=rentHouse;
    }
    public void registerBegRentHouse(BegRentHouse [] begRentHouse){
        this.begRentHouse=begRentHouse;
    }
    public void deliverMess(Colleague colleague,String mess){
        if(colleague instanceof RentHouse){
            for (BegRentHouse house : begRentHouse) {
                house.receiverMess(colleague.getName() + mess);
            }
        }
        else if(colleague instanceof BegRentHouse){
            for (RentHouse house : rentHouse) {
                house.receiverMess(colleague.getName() + mess);
            }
        }
    }

}
