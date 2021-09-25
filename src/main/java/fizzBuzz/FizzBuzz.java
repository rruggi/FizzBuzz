package fizzBuzz;

public class FizzBuzz extends GeneralNumber {

  private String returnStatement = "Fizz buzz";

  @Override
  public boolean calculateMultiplicity(final Integer number) {

    if (number % 3 == 0 && number % 5 == 0) {

      System.out.println(returnStatement);
      return true;
    }
    return false;
  }
}
