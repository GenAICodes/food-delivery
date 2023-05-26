
package com.food.delivery.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Menu addMenuItem(String name, String description, Double price, Long restaurantId) {
        Menu menu = new Menu(name, description, price, restaurantId);
        return menuRepository.save(menu);
    }

    @Override
    public Menu getMenuItemById(Long id) {
        return menuRepository.findById(id).orElse(null);
    }
}
