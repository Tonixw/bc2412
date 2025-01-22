import DemoUncheckedException.BusinessRuntimeException;

public class LoginManager {
  private String username;
  private String password;

  public LoginManager(String username, String password) {
    this.username = username;
    this.password = password;
  }

  // Approach 2: BusinessRuntimeException
  public static class BusinessException extends RuntimeException {
    // Runtime -> spelling mistake
    // "Invalid User Name."
    // "Invalid Password."" 
    public static BusinessRuntimeException of(SysError sysError) {
      return
    }
  }

  // Approach 1: InvalidUsernameException + InvalidPasswordException
  public static class InvalidUsernameException extends RuntimeException {
    public InvalidUsernameException(String message) {
      super(message);
    }
  }

  public static class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(String message) {
      super(message);
    }
  }

  // !!!
  public void validateUsername() {
    if (this.username == null || this.username.isEmpty()) {
      throw new InvalidUsernameException(
          "Username is invalid: " + this.username);
    }
  }

  public void validateUsername2() {
    if (this.username == null || this.username.isEmpty()) {
      throw InvalidUsernameException of(SysError.INVALID_USERNAME);
    }
  }


   // !!!
  public void validatePassword() {
    if (this.password == null || this.password.length() < 8
        || (!this.password.contains("@") && !this.password.contains("!")
            && !this.password.contains("$") && !this.password.contains("&")
            && !this.password.contains("_"))) {
      throw new InvalidPasswordException(
          "Password is invalid :" + this.password);
    }
  }

  public static void main(String[] args) {
    LoginManager loginManager = new LoginManager("Jacky", "adcd123!");
    // We can define the program flow by custom exception
    // Approach 1
    try {
      loginManager.validateUsername();
      loginManager.validatePassword();
      System.out.println("Login success!");
    } catch (InvalidUsernameException e) {
      System.out.println(e.getMessage());
    } catch (InvalidPasswordException e) {
      System.out.println(e.getMessage());
    }

    // Approach 2
    try {
      loginManager.validateUsername();
      loginManager.validatePassword();
      System.out.println("Login success!");
    } catch (InvalidUsernameException e) {
      System.out.println(e.getMessage());
    } catch (InvalidPasswordException e) {
      System.out.println(e.getMessage());
    }

  }
}
