## ๐ํ๋ก์ ํธ ์๊ฐ
Spring Boot์ JPA,์คํ๋ง ์ํํฐ๋ฆฌ๋ฅผ ํ์ฉํ ์์ ๋ก๊ทธ์ธ๊ณผ CRUD ๊ธฐ๋ฅ์ ์ ์ํ์๊ณ  RDS์ ์ฐ๊ฒฐํ์์ต๋๋ค.  AWS์ ๊ฐ์ ์๋ฒ์ธ EC2๋ฅผ ์ฌ์ฉํ์ฌ ํ๋ก์ ํธ๋ฅผ ๋ฐฐํฌํ์์ผ๋ฉฐ ๊ทธ ํ Nginx ์๋ฒ๋ฅผ ๋ฑ๋กํ์ฌ ๋ฌด์ค๋จ ๋ฐฐํฌํ์์ต๋๋ค.

ํ๋ก์ ํธ ํ์๋ผ์ธ๊ณผ ์ค์  ๊ฒช์๋ Error๋ ๋งํฌ๋ฅผ ํตํ์ฌ ํ์ธ ๊ฐ๋ฅํฉ๋๋ค.

https://mulberry-echium-a73.notion.site/Spring-Project-4d1f0d7f1c4249338ba6ca19d1ecd91b
***

### โฒ๊ฐ๋ฐ๊ธฐ๊ฐ
2022.12.22 ~ 2022.12.28

### ๐งโ๐คโ๐ง๊ฐ์ธ ํ๋ก์ ํธ

### โ๊ฐ๋ฐํ๊ฒฝ
๐น์ธ์ด Java 8 (JDK 1.8),Spring Boot 2.4.1

๐นํ๋ ์์ํฌ Spring Boot t 2.4.1

๐น์๋ฒ Tomcat Server 8.0 , Nginx, AWS EC2

๐นDB	Amazon RDS

๐น๊ฐ๋ฐ ๋๊ตฌ IntelliJ community 2022.2, DB Browser , AWS

๐นAPI NAVER/GOOGLE Login API

### โญ์๊ตฌ์ฌํญ ๋ถ์

๊ฒ์ํ ๊ธฐ๋ฅ

- ๊ฒ์๊ธ ์กฐํ
- ๊ฒ์๊ธ ๋ฑ๋ก
- ๊ฒ์๊ธ ์์ 
- ๊ฒ์๊ธ ์ญ์ 

ํ์ ๊ธฐ๋ฅ

- ๊ตฌ๊ธ/๋ค์ด๋ฒ ๋ก๊ทธ์ธ(์ค์ ๋ก  ํ ํฐ์ด ์๊ธฐ ๋๋ฌธ์ ํ์คํธ ์ฝ๋๋ง ์ ์ ์ํ๋จ)
- ๋ก๊ทธ์ธํ ์ฌ์ฉ์ ๊ธ ์์ฑ ๊ถํ
- ๋ณธ์ธ ์์ฑ ๊ธ์ ๋ํ ๊ถ๋ฆฌ

โ RDS๋ฅผ ์ด์ฉํ DB ์์ฑ

![rds](https://user-images.githubusercontent.com/103393439/209842368-281008a3-1088-4575-a3ce-a65d4436f795.jpg)

โ JPA๋ฅผ ์ฌ์ฉํ CRUD ๊ธฐ๋ฅ
![๊ธ ๋ฑ๋ก](https://user-images.githubusercontent.com/103393439/209836164-84bb3edc-a7f0-421f-ab95-62ff3d02c39a.jpg)
![๊ธ ์ญ์ ](https://user-images.githubusercontent.com/103393439/209836174-894ddf61-d7ae-4af4-8c89-c07393f08d43.jpg)
![๊ธ ์์  ๋๋ก](https://user-images.githubusercontent.com/103393439/209836184-abdce7e2-3a41-4940-a2b6-62efa00bfdc8.jpg)
![๊ธ์์ ](https://user-images.githubusercontent.com/103393439/209836194-fb93274e-782f-4841-b630-7bc4d24944a6.jpg)


โ git action์ ์ด์ฉํ ๋ฐฐํฌ

<img src="https://user-images.githubusercontent.com/103393439/209840128-dd687e71-d61d-4c1d-ad8d-a3b019627b38.jpg" width="500" />

โ codedeploy๋ฅผ ์ฌ์ฉํ ๋ฐฐํฌ 

![codeplay check](https://user-images.githubusercontent.com/103393439/209846951-ac9b80f3-1a24-4792-80d4-437f3ed1bcc1.jpg)

โNginx๋ฅผ ์ด์ฉํ ๋ฌด์ค๋จ ๋ฐฐํฌ
![nginx ์ ์](https://user-images.githubusercontent.com/103393439/209839963-c42c8ad1-d0dd-4392-a9fb-42aceeb68c88.jpg)
![nginx ์ค์  ํ ์ ์](https://user-images.githubusercontent.com/103393439/209840066-172287c2-ff54-4990-9863-558e64cfcaf2.jpg)

