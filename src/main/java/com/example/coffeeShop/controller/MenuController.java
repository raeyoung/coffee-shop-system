package com.example.coffeeShop.controller;

import com.example.coffeeShop.dto.MenuDto;
import com.example.coffeeShop.service.MenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    /**
     * 커피 메뉴 목록 조회
     * @return
     */
    @GetMapping
    public ResponseEntity<List<MenuDto>> getMenuList() {
        List<MenuDto> menus = menuService.getAllMenus();
        return ResponseEntity.ok(menus);
    }
}
