package com.example.coffeeShop.controller;

import com.example.coffeeShop.dto.MenuDto;
import com.example.coffeeShop.service.MenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@WebMvcTest(MenuControllerTest.class)   // 단위 테스트시 필요한 bean 만 올려 주는 기능
class MenuControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MenuService menuService;

    @Test
    void menuList() {
        // Mock 데이터
        List<MenuDto> menuList = Arrays.asList(
                new MenuDto(1L, "Americano", 4500),
                new MenuDto(2L, "Latte", 5000),
                new MenuDto(3L, "Espresso", 3500)
        );
        // Service 모킹
        when(menuService.getAllMenus()).thenReturn(menuList);

    }
}