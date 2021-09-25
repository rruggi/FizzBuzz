package fizzBuzz;

public class Buzz extends GeneralNumber {

  private String returnStatement = "Buzz";

  @Override
  public boolean calculateMultiplicity(final Integer number) {

    if (number % 5 == 0) {
      System.out.println(returnStatement);
      return true;
    }
    return false;
  }
}
