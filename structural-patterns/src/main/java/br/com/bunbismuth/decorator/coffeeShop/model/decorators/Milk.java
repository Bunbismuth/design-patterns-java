package br.com.bunbismuth.decorator.coffeeShop.model.decorators;

import br.com.bunbismuth.decorator.coffeeShop.model.Drink;

public class Milk extends DrinkDecorator {

  public Milk(Drink drink) {
    super(drink);
  }

  @Override
  public void serve() {
    drink.serve();
    System.out.println("- Adding 30 ml of Milk");
  }

  @Override
  public Double getPrice() {
    return drink.getPrice() + 0.5;
  }
}
