/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotekjaya.app.helpers;

/**
 *
 * @author 11120
 */
public class Password {
    private static int saltLength = 8;
    
    public static String hash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(saltLength));
    }
    
    public static Boolean check(String password, String hashed) {
        return BCrypt.checkpw(password, hashed);
    }
}
