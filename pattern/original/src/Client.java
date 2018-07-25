public class Client {

    public static void main(String args[]){

        AbstractFactory factoryX = new ConcreteFactoryX();
        AbstractFactory factoryY = new ConcreteFactoryY();

        ProductA productAX = factoryX.createProductA();
        productAX.create();
        ProductA productAY = factoryY.createProductA();
        productAY.create();

        ProductB productBX = factoryX.createProductB();
        productBX.create();
        ProductB productBY = factoryY.createProductB();
        productBY.create();

    }
}
