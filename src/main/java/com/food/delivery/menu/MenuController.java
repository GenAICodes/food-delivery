
package com.food.delivery.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menus")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @PostMapping
    public ResponseEntity<Menu> addMenuItem(@RequestBody Menu menu) {
        Menu addedMenu = menuService.addMenuItem(menu.getName(), menu.getDescription(), menu.getPrice(), menu.getRestaurantId());
        return new ResponseEntity<>(addedMenu, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Menu> getMenuItemById(@PathVariable Long id) {
        Menu menu = menuService.getMenuItemById(id);
        if (menu != null) {
            return new ResponseEntity<>(menu, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
