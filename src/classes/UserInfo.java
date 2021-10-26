/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * Clase UserInfo con la cual se va a trabajar en la aplicacion del servidor.
 * @author Alain Cosgaya
 */
public class UserInfo {
    private User user;
    private MessageType message;

    public UserInfo() {
    }
    
    public UserInfo(User user, MessageType message) {
        this.user = user;
        this.message = message;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MessageType getMessage() {
        return message;
    }

    public void setMessage(MessageType message) {
        this.message = message;
    }

    
}
