package fizzBuzz;

public class AnotherRule extends GeneralNumber {

  private String returnStatement = "Aqui tem uma OUTRA REGRA";

  @Override
  public boolean calculateMultiplicity(final Integer number) {

    if (number == 47) {
      System.out.println(returnStatement);
      return true;
    }
    return false;
  }
}
