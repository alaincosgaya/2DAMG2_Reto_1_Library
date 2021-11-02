package classes;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Clase User que va a contener todos los atributos, getters y setters
 * @author Alain Cosgaya
 */
public class User implements Serializable{
    private long id;
    private String username, email, fullName, password;
    private UserStatusType UserStatus;
    private UserPrivilegeType UserPrivilege;
    private LocalDateTime lastPasswordChange;
    
    
    
    /**
     * Constructor de la clase User que va a contener el valor de todos los
     * atributos.
     * @param id La id de tipo long del usuario.
     * @param username El nombre de usuario.
     * @param email El email de tipo String del usuario.
     * @param fullName El nombre completo de tipo String del usuario.
     * @param password La contraseña de tipo String del usuario.
     * @param UserStatus El estado de tipo StatusType del usuario.
     * @param UserPrivilege Los privilegios de tipo PrivilegeType del usuario.
     * @param lastPasswordChange El ultimo cambio de contraseña de tipo 
     * LocalDateTime del usuario.
     */
    public User(long id, String username, String email, String fullName, String password, UserStatusType UserStatus, UserPrivilegeType UserPrivilege, LocalDateTime lastPasswordChange) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.fullName = fullName;
        this.password = password;
        this.UserStatus = UserStatus;
        this.UserPrivilege = UserPrivilege;
        this.lastPasswordChange = lastPasswordChange;
    }
    /**
     * Constructior vacio de la clase User.
     */
    public User() {
        
    }

   
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
     public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatusType getUserStatus() {
        return UserStatus;
    }

    public void setUserStatus(UserStatusType UserStatus) {
        this.UserStatus = UserStatus;
    }

    public UserPrivilegeType getUserPrivilege() {
        return UserPrivilege;
    }

    public void setUserPrivilege(UserPrivilegeType UserPrivilege) {
        this.UserPrivilege = UserPrivilege;
    }

    public LocalDateTime getLastPasswordChange() {
        return lastPasswordChange;
    }

    public void setLastPasswordChange(LocalDateTime lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }
    
}
