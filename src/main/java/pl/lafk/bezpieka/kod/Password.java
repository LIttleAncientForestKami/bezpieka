package pl.lafk.bezpieka.kod;

import java.io.Console;
import java.io.IOException;
import java.lang.SecurityException;
import java.util.Arrays;

class Password {
  public static void main (String args[]) throws IOException {
    Console c = System.console();
    if (c == null) {
      System.err.println("No console.");
      System.exit(1);
    }
    String username = c.readLine("Enter your user name: ");
    char[]  password = c.readPassword("Enter your password: "); // <1>
    if (!verify(username, password)) {
      throw new SecurityException("Invalid Credentials");
    }
    if (!verify(username, password)) {
      throw new SecurityException("Invalid Credentials");
    }
    // Clear the password
    Arrays.fill(password, ' ');
  }

  // Dummy verify method, always returns true
  private static final boolean verify(String username, char[] password) {
    return true;
  }


}
