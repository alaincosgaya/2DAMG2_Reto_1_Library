/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * Enum de los tipos de peticiones/respuestas que pueden haber en la aplicacion.
 * @author Alain Cosgaya
 */
public enum MessageType {
    SIGNIN_REQUEST, SIGNUP_REQUEST, SIGNIN_EXCEPTION, SIGNUP_EXCEPTION,
    UPDATE_EXCEPTION, CONNECT_EXCEPTION, SIGNIN_OK, SIGNUP_OK
}
