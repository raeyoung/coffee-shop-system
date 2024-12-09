package com.example.coffeeShop.service;

import com.example.coffeeShop.dto.MenuDto;
import com.example.coffeeShop.repository.MenuRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuService {
    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<MenuDto> getAllMenus() {
        return menuRepository.findAll()
                .stream()
                .map(menu -> new MenuDto(menu.getId(), menu.getName(), menu.getPrice()))
                .collect(Collectors.toList());
    }
}
