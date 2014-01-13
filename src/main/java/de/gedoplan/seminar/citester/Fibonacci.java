package de.gedoplan.seminar.citester;

/**
 * Demo-Klasse: Berechnung der Fibonacci-Zahlen.
 * 
 * @author dw
 */
public final class Fibonacci
{
  /**
   * Ausgabe der Fibonacci-Folge bis 50
   * 
   * @param n Stelle
   * @return Wert
   */
  public static int fibonacci(int n)
  {
    if (n < 0)
    {
      throw new IllegalArgumentException("n<0");
    }

    if (n <= 1)
    {
      return n;
    }

    int last = 0;
    int current = 1;
    while (n >= 2) // Fehler: Hier müsste n>=2 stehen
    {
      int old = current;
      current = last + current;
      last = old;
      --n;
    }
    return current;
  }

  private Fibonacci()
  {
  }
}
