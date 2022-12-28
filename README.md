## 📃프로젝트 소개
Spring Boot와 JPA,스프링 시큐티리를 활용한 소셜 로그인과 CRUD 기능을 제작하였고 RDS와 연결하였습니다.  AWS의 가상 서버인 EC2를 사용하여 프로젝트를 배포하였으며 그 후 Nginx 서버를 등록하여 무중단 배포하였습니다.
***

### ⏲개발기간
2022.12.22 ~ 2022.12.28

### 🧑‍🤝‍🧑개인 프로젝트

### ⚙개발환경
🔹언어 Java 8 (JDK 1.8),Spring Boot 2.4.1

🔹프레임워크 Spring Boot t 2.4.1

🔹서버 Tomcat Server 8.0 , Nginx, AWS EC2

🔹DB	Amazon RDS

🔹개발 도구 IntelliJ community 2022.2, DB Browser , AWS

🔹API NAVER/GOOGLE Login API

### ⭐요구사항 분석

게시판 기능

- 게시글 조회
- 게시글 등록
- 게시글 수정
- 게시글 삭제

회원 기능

- 구글/네이버 로그인(실제론 토큰이 없기 때문에 테스트 코드만 정상 수행됨)
- 로그인한 사용자 글 작성 권한
- 본인 작성 글에 대한 권리

✔ RDS를 이용한 DB 생성

![rds](https://user-images.githubusercontent.com/103393439/209842368-281008a3-1088-4575-a3ce-a65d4436f795.jpg)

✔ JPA를 사용한 CRUD 기능
![글 등록](https://user-images.githubusercontent.com/103393439/209836164-84bb3edc-a7f0-421f-ab95-62ff3d02c39a.jpg)
![글 삭제](https://user-images.githubusercontent.com/103393439/209836174-894ddf61-d7ae-4af4-8c89-c07393f08d43.jpg)
![글 수정 드록](https://user-images.githubusercontent.com/103393439/209836184-abdce7e2-3a41-4940-a2b6-62efa00bfdc8.jpg)
![글수정](https://user-images.githubusercontent.com/103393439/209836194-fb93274e-782f-4841-b630-7bc4d24944a6.jpg)


✔ git action을 이용한 배포

<img src="https://user-images.githubusercontent.com/103393439/209840128-dd687e71-d61d-4c1d-ad8d-a3b019627b38.jpg" width="500" />

✔ codedeploy를 사용한 배포 

![codeplay check](https://user-images.githubusercontent.com/103393439/209846951-ac9b80f3-1a24-4792-80d4-437f3ed1bcc1.jpg)

✔Nginx를 이용한 무중단 배포
![nginx 접속](https://user-images.githubusercontent.com/103393439/209839963-c42c8ad1-d0dd-4392-a9fb-42aceeb68c88.jpg)
![nginx 설정 후 접속](https://user-images.githubusercontent.com/103393439/209840066-172287c2-ff54-4990-9863-558e64cfcaf2.jpg)

