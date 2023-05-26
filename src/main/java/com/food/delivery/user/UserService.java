
package com.food.delivery.user;

public interface UserService {
    User registerUser(String name, String email, String password);
    boolean verifyUser(String email, String password);
}
