/**
JJ and the needed Javadoc comment.
*/
public class Stack1 {
  /** Add the Javadoc comment.
  */
  public void func(int num1, int num2, double numd1, double numd2,
  char char1, char char2) {
    int sum;
    double prod;
    char max;
    double result;
    sum = num1 + num2;
    prod = numd1 * numd2;
    result = sum / prod;
    max = char1;
    if (char1 < char2) {
      max = char2;
    }
  }
}
