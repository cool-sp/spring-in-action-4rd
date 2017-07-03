package spittr;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EqualsAndHashCode(exclude={"username", "password", "firstName", "lastName", "email"})
public class Spitter {
    @Getter @Setter private Long id;

    @NotNull @Size(min=5, max=16) @Getter @Setter private String username;
    @NotNull @Size(min=5, max=25) @Getter @Setter private String password;
    @NotNull @Size(min=2, max=30) @Getter @Setter private String firstName;
    @NotNull @Size(min=2, max=30) @Getter @Setter private String lastName;

    @Getter @Setter private String email;

    public Spitter() {

    }

    public Spitter(String username, String password, String firstName, String lastName, String email) {
        this(null, username, password, firstName, lastName, email);
    }

    public Spitter(Long id, String username, String password, String firstName, String lastName, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}