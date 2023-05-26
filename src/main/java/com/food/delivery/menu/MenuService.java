
package com.food.delivery.menu;

public interface MenuService {
    Menu addMenuItem(String name, String description, Double price, Long restaurantId);
    Menu getMenuItemById(Long id);
}
