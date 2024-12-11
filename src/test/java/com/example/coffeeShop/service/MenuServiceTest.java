package com.example.coffeeShop.service;

import com.example.coffeeShop.dto.MenuDto;
import com.example.coffeeShop.entity.Menu;
import com.example.coffeeShop.repository.MenuRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MenuServiceTest {

    @Mock
    private MenuRepository menuRepository;  // 모의 객체 설정

    @InjectMocks
    private MenuService menuService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Mockito 어노테이션을 활성화
    }

    @Test
    @DisplayName("전체 메뉴 조회")
    void getAllMenus_success() {
        // Mock 데이터
        Menu menu1 = new Menu(1L, "Americano", 3000);
        Menu menu2 = new Menu(2L, "Latte", 4000);
        List<Menu> menuList = Arrays.asList(menu1, menu2);

        when(menuRepository.findAll()).thenReturn(menuList);

        List<MenuDto> result = menuService.getAllMenus();

        assertNotNull(result);  // null 여부 확인
        assertEquals(2, result.size()); // 사이즈 예상
        assertEquals("Americano", result.get(0).getName()); // 0번째 값 반환
        assertEquals(3000, result.get(0).getPrice());
        assertEquals("Latte", result.get(1).getName());     // 1번째 값 반환
        assertEquals(4000, result.get(1).getPrice());

        verify(menuRepository, times(1)).findAll(); // 데이터베이스 1반 호출 여부 검증
    }
}