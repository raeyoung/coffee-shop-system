## Coffee Shop System

### ERD 다이어그램 
![스크린샷 2024-12-09 오전 10.19.15.png](..%2F..%2FDesktop%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-12-09%20%EC%98%A4%EC%A0%84%2010.19.15.png)

---
### 아키텍처 구조
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

---
### 기술 스택 
- Java 17 
- Spring Boot 3.4.0
- JPA
- H2 Database
- Junit5