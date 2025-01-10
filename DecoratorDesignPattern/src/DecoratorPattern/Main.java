package DecoratorPattern;
import DecoratorPattern.BaseObject.BasePizza;
import DecoratorPattern.BaseObject.FarmhousePizza;
import DecoratorPattern.Decorator.ExtraCheese;

class Main{
    public static void main(String args[]){
        BasePizza pizza = new ExtraCheese(new FarmhousePizza());
        System.out.println(pizza.cost());
    }
}
