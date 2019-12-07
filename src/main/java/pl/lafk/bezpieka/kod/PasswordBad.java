package pl.lafk.bezpieka.kod;

import java.io.Console;
import java.io.IOException;

class PasswordBad {

  public static void main (String args[]) throws IOException {
    Console c = System.console();
    if (c == null) {
      System.err.println("No console.");
      System.exit(1); // <1>
    }
    String username = c.readLine("Enter your user name: ");
    String password = c.readLine("Enter your password: "); // <2>
    if (!verify(username, password)) {
      throw new SecurityException("Invalid Credentials");
    }
    // ...
  }
  // Dummy verify method, always returns true
  private static final boolean verify(String username,
      String password) {
    return true;
  }
}
