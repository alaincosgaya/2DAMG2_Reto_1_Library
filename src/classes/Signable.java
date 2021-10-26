/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import exceptions.ConnectException;
import exceptions.SignInException;
import exceptions.SignUpException;
import exceptions.UpdateException;

/**
 * Interfaz con los tipos de metodos que se van a poder ejecutar en la 
 * aplicacion cliente y servidor.
 * @author Alain Cosgaya
 */
public interface Signable {
    
    /**
     * Metodo que comprueba a traves de un procedimiento almacenado si los
     * campos introducidos por el usuario son correctos.
     * 
     * @param message Los datos introducidos por el usuario por validar.
     *
     * @return Objeto tipo UserInfo con los datos del usuario y un mensaje de
     * tipo enum con lo ocurrido a lo largo de la ejecucion del metodo.
     * 
     * @throws ConnectException
     * @throws SignInException
     * @throws UpdateException 
     */
    public UserInfo signIn(UserInfo message) throws ConnectException, SignInException, UpdateException;
    
    /**
     * Metodo que registra al usuario en la base de datos en el caso de que los
     * valores de login y email no esten ya en uso.
     * 
     * @param message Los datos introducidos por el usuario para su validacion y
     * registro.
     *
     * @return Objeto tipo UserInfo con los datos del usuario y un mensaje de
     * tipo enum con lo ocurrido a lo largo de la ejecucion del metodo.
     * 
     * @throws ConnectException
     * @throws SignUpException
     * @throws UpdateException 
     */
    public UserInfo signUp(UserInfo message) throws ConnectException, SignUpException, UpdateException;
}
