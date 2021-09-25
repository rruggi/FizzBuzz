package fizzBuzz;

public class MainProgram {

  public static void main(final String[] args) {

    final GeneralNumber fizzBuzz = new FizzBuzz();
    final GeneralNumber fizz = new Fizz();
    final GeneralNumber buzz = new Buzz();
    final GeneralNumber general = new GeneralNumber();
    final GeneralNumber anotherRule = new AnotherRule();

    for (int i = 1; i <= 100; i++) {
      if (!fizzBuzz.calculateMultiplicity(i)
          && !fizz.calculateMultiplicity(i)
          && !buzz.calculateMultiplicity(i)
          && !anotherRule.calculateMultiplicity(i))
        general.calculateMultiplicity(i);
    }
  }
}

