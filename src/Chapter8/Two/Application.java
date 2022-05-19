package Chapter8.Two;

public class Application {
    public static void main(String[] args){
        ConcreteMediator mediator=new ConcreteMediator();
        RentHouse[] rentHouse = new RentHouse[3];
        rentHouse[0] = new RentHouse(mediator);
        rentHouse[1] = new RentHouse(mediator);
        rentHouse[2] = new RentHouse(mediator);
        rentHouse[0].setName("张三");
        rentHouse[1].setName("李四");
        rentHouse[2].setName("王五");
        BegRentHouse[] begRentHouse = new BegRentHouse[2];
        begRentHouse[0] = new BegRentHouse(mediator);
        begRentHouse[1] = new BegRentHouse(mediator);
        begRentHouse[0].setName("朱方");
        begRentHouse[1].setName("甲方");
        mediator.registerRentHouse(rentHouse);
        mediator.registerBegRentHouse(begRentHouse);
        rentHouse[0].giveMess("房屋出租：租金是800元/月");
        rentHouse[1].giveMess("房屋出租：租金是900元/月");
        rentHouse[2].giveMess("房屋出租：租金是1900元/月");
        begRentHouse[0].giveMess("求租房屋：租金不高于800元/月");
        begRentHouse[1].giveMess("求租房屋：租金不高于4000元/月");
    }

}
