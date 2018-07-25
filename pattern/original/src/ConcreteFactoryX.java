public class ConcreteFactoryX implements AbstractFactory{

    public ProductA createProductA(){

        return new ProductAX();
    }
    public ProductB createProductB(){
        return new ProductBX();
    }
}

