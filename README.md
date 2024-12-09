## Coffee Shop System

### ERD 다이어그램 
![coffe-shop-system-erd](https://github.com/user-attachments/assets/364b3d19-b898-42e3-933a-164343ad2987)


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
