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

    // 상수 정의
    private static final Long MENU_ID_1 = 1L;
    private static final String MENU_NAME = "Americano";
    private static final String API_URL = "/api/menu";

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    /**
     * 커피 메뉴 목록 조회
     * @return
     */
    @GetMapping
    public ResponseEntity<List<MenuDto>> getMenus() {
        List<MenuDto> menus = menuService.getAllMenus();
        return ResponseEntity.ok(menus);
    }

}
