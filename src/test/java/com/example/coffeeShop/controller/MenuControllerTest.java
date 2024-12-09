package com.example.coffeeShop.controller;

import com.example.coffeeShop.dto.MenuDto;
import com.example.coffeeShop.service.MenuService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MenuController.class)   // 단위 테스트시 필요한 bean 만 올려 주는 기능
class MenuControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MenuService menuService;

    // 상수 정의
    private static final Long MENU_ID = 1L;
    private static final String NAME = "Americano";
    private static final Integer PRICE = 4500;
    private static final String API_URL = "/api/menu";

    @Test
    @DisplayName("메뉴 목록 조회 Controller")
    void menuList() throws Exception {
        // Mock 데이터
        List<MenuDto> menuList = Arrays.asList(
                new MenuDto(1L, "Americano", 4500),
                new MenuDto(2L, "Latte", 5000),
                new MenuDto(3L, "Espresso", 3500)
        );
        // Service 모킹
        when(menuService.getAllMenus()).thenReturn(menuList);

        mockMvc.perform(get(API_URL)    // HTTP GET 요청
                .contentType(MediaType.APPLICATION_JSON)) // 요청 본문은 JSON 형식
            .andExpect(status().isOk()) // HTTP 상태 코드 201 Created 확인
            .andExpect(jsonPath("$[0].id").value(MENU_ID)) // 첫 번째 메뉴의 id 검증
            .andExpect(jsonPath("$[0].name").value(NAME)) // 첫 번째 메뉴의 name 검증
            .andExpect(jsonPath("$[0].price").value(PRICE)); // 첫 번째 메뉴의 price 검증
    }
}