
package DomainEntities;


import javaTesting.resources.PasswordUtils;

public class User {
    private String name;
    private String password;
    private String salt;

    public User() {
        this("Tomeu", "secret");
    }

    public User(String name, String password) {
        this.name = name;
        this.salt = PasswordUtils.genSalt();
        this.password = PasswordUtils.hashedPassword(password, this.salt);
    }

    public String getName() {
        return this.name;
    }

    public boolean verifyPassword(String passwordEntered) {
        return PasswordUtils.verifyUserPassword(passwordEntered, this.salt, this.password);
    }

    public void setName() {
        this.name = this.name;
    }

    public void setPassword() {
        this.password = PasswordUtils.hashedPassword(this.password, this.salt);
    }
}
