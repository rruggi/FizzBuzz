package fizzBuzz;

public class Fizz extends GeneralNumber {

  private String returnStatement = "Fizz";

  @Override
  public boolean calculateMultiplicity(final Integer number) {

    if (number % 3 == 0) {

      System.out.println(returnStatement);

      return true;
    }

    return false;
  }
}
