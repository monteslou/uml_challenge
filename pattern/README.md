# ENDAVA  CHALLENGE

**Exercise 2: Pattern**

## Pattern

![](https://raw.githubusercontent.com/monteslou/uml_challenge/dev/pattern/pattern_original.png)

## Notes

A factory creator/generator class *FactoryProducer* can be created. Client class uses FactoryProducer to get an **AbstractFactory** object. In this case X or Y type product.



We also need to create an **interface** (AbstractFactory) class for each of the components that are in the themes we wish to provide(ConcreteFactoryX and ConcreteFactoryY. We don't use **abstract** class beacause we are not using concrete methods or objects.

# Results

![](https://raw.githubusercontent.com/monteslou/uml_challenge/dev/pattern/pattern_results_original.png)

## Design Pattern: Abstract Factory

Abstract Factory is a *creational* design pattern, which solves the problem of creating entire product families without specifying their concrete classes _(each factory type corresponds to a certain product variety.)_. It allows the same client code work with different products.

**What is this design pattern useful for?**

