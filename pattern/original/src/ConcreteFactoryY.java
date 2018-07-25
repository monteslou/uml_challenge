public class ConcreteFactoryY implements AbstractFactory{
    public ProductA createProductA(){
        return new ProductAY();
    }
    public ProductB createProductB(){
        return new ProductBY();
    }
}

