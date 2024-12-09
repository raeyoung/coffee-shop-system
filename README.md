## Coffee Shop System

### ERD 다이어그램 
![coffe-shop-system-erd.png](..%2F..%2FDesktop%2Fcoffe-shop-system-erd.png)

---
### 프로젝트 구조도
```
src
└── main
├── java
│   └── com.example.coffeeShop
│       ├── controller    # API Controller
│       ├── dto           # Data Transfer Objects
│       ├── entity        # JPA Entity
│       ├── repository    # JpaRepository 인터페이스
│       ├── service       # 서비스 레이어
│       ├── utils         # 유틸리티 클래스
│       └── scheduler     # 인기 메뉴
└── resources
├── application.yml   # 환경 설정 파일
├── schema.sql        # 초기 테이블 스키마
└── data.sql          # 기본 데이터
```

---
### 기술 스택 
- Java 17 
- Spring Boot 3.4.0
- JPA
- H2 Database
- Junit5