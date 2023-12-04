package br.com.bunbismuth.decorator.coffeeShop.model;

public class Tea implements Drink {

  @Override
  public void serve() {
    System.out.println("- Adding 100 ml of tea");
  }

  @Override
  public Double getPrice() {
    return 1.0;
  }
}
