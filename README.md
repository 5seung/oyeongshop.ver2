## **👗OyeongShop.ver2 (오영샵)**
- 심플하고 직관적으로 상품을 보고 구매 할 수 있도록 설계한 여성의류 쇼핑몰 프로젝트입니다.
- [oyeongshop.ver1](https://github.com/5seung/OyeongShop) 에서 구현하지 못한 쇼핑몰의 핵심 기능을 추가하였습니다.
- 개발 기간 : 23.10.23 ~ 23.11.27<br>
- 참여 인원 : 5명 (amolli: 아몰리)<br>
      
    |<img src="https://avatars.githubusercontent.com/u/126163816?s=400&v=4" width="120" height="160"/><br/>BE 오승언 (팀장) <br/><a href="https://github.com/5seung">GitHub</a>|<img src="https://avatars.githubusercontent.com/u/107999594?v=4" width="120" height="160"/><br/>BE 강정환 <br/> <a href="https://github.com/Ueong2">GitHub</a>|<img src="https://avatars.githubusercontent.com/u/144882233?v=4" width="120" height="160"/><br/>BE 김나영 <br/><a href="https://github.com/nayonez">GitHub</a>|<img src="https://avatars.githubusercontent.com/u/140488622?v=4" width="120" height="160"/><br/>BE 김윤설 <br/><a href="https://github.com/Yseolcoding">GitHub</a>|<img src="https://avatars.githubusercontent.com/u/147739911?v=4" width="120" height="160"/><br/>BE 박형배 <br/><a href="https://github.com/dev-hubris">GitHub</a>|
    |:---:|:---:|:---:|:---:|:---:|
    | <strong>주요 역할</strong> <br> &middot; 프로젝트 총괄 <br> &middot; 회원 및 결제 파트 <br> &middot; 프론트 디자인|<strong>주요 역할</strong> <br> &middot; 상품 파트 | <strong>주요 역할</strong> <br> &middot; 리뷰 및 위시리스트 파트 <br/> &middot; 프론트 디자인 | <strong>주요 역할</strong> <br/> &middot; 주문 파트 | <strong>주요 역할</strong> <br/> &middot; 장바구니 파트 |

<br>

##  🛠 기술스택

### **[Front-end]**
![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
![jQuery](https://img.shields.io/badge/jquery-%230769AD.svg?style=for-the-badge&logo=jquery&logoColor=white)
![Bootstrap](https://img.shields.io/badge/bootstrap-%238511FA.svg?style=for-the-badge&logo=bootstrap&logoColor=white)


### **[Back-end]**   
![Java](https://img.shields.io/badge/java11-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Spring boot](https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-%23005C0F.svg?style=for-the-badge&logo=Thymeleaf&logoColor=white)

### **[DB]**
![Mysql](https://img.shields.io/badge/Mysql-4479A1?style=for-the-badge&logo=Mysql&logoColor=white)

### **[Tool & Environment]**
![git](https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white)
![github](https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white)
![IntelliJ idea](https://img.shields.io/badge/IntelliJ_idea-000000?style=for-the-badge&logo=IntelliJidea&logoColor=white)
![figma](https://img.shields.io/badge/figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white)

</br>

## 💻 ERD
- [📌ERD 링크](https://www.erdcloud.com/d/De5eKLR9fHqGtaWEs)
- Table 16

![image](https://github.com/sesac-amolli/oyeongshop.ver2/assets/126163816/5222cf19-d258-4b98-beb7-784673799052)

</br>

## 📍 주요 기능
** 담당기능에 작성 코드를 링크하였습니다.

### 기본
- 유저 및 관리자 권한 구분 [📌시큐리티 설정 code](https://github.com/5seung/oyeongshop.ver2/blob/68d0016f92a8536bd094f7035d3ab807f754a13b/src/main/java/com/amolli/oyeongshop/ver2/security/config/SecurityConfig.java#L33-L66)
  
### 유저(회원) 권한

<details>
<summary>회원가입 및 로그인</summary>
  
- 사이트를 통한 회원 가입 및 로그인 [📌회원가입 서비스 code](https://github.com/5seung/oyeongshop.ver2/blob/68d0016f92a8536bd094f7035d3ab807f754a13b/src/main/java/com/amolli/oyeongshop/ver2/user/service/UserServiceImpl.java#L46-L56)
- 소셜 로그인(카카오, 네이버, 구글) 인증 후 로그인 [📌서비스 code](https://github.com/5seung/oyeongshop.ver2/blob/68d0016f92a8536bd094f7035d3ab807f754a13b/src/main/java/com/amolli/oyeongshop/ver2/security/config/oauth/PrincipalOauth2UserService.java#L27-L83)
- 아이디 중복 체크 [📌ajax code](https://github.com/5seung/oyeongshop.ver2/blob/68d0016f92a8536bd094f7035d3ab807f754a13b/src/main/resources/static/js/user/signup.js#L1-L28)
  
</details>

<details>
<summary>상품</summary>
  
- 카테고리별 상품 조회
- 상품 목록조회
- 상품 정보 상세보기
- 찜하기(위시리스트 담기)
- 장바구니 담기
  
</details>

<details>
<summary>회원(마이페이지)</summary>
  
- 위시리스트 조회
  
</details>

<details>
<summary>주문/결제</summary>
  
- 단일상품 주문
  + 상품 상세보기 페이지 주문하기 진행 시
    
- 다중 상품 주문
  + 장바구니에서 선택한 상품 주문 진행 시
    
- 결제 [📌포트원 결제 api 요청 code](https://github.com/5seung/oyeongshop.ver2/blob/68d0016f92a8536bd094f7035d3ab807f754a13b/src/main/resources/static/js/order/order.js#L143-L212)
- 주문 내역 조회

</details>
<details>
<summary>리뷰</summary>
 
- 리뷰 작성  
  + 자신이 구매한 상품만 리뷰 생성 가능
  + 리뷰 이미지는 선택적으로 첨부 가능
  + 리뷰 이미지는 AWS S3 에 저장
    
- 리뷰 조회  
   + 상품별 리뷰 조회 (상품 상세보기 페이지 하단)  
   + 내가 작성한 리뷰 (마이페이지)
  
- 리뷰 삭제  
  + 구매자 본인만 삭제 가능
  
</details>


### 관리자 권한
<details>
<summary>상품</summary>
  
- 상품 등록  
  + 상품 이미지는 1장 이상 필수 입력
  + 상품 이미지는 AWS S3 에 저장
  
- 상품 상세 내용 수정
  
</details>


### 기능 데모 보기


[📺영상 보러가기(사용 시나리오)📺](https://drive.google.com/file/d/14KWPkBUEHtn1dkOeODKUJ2nfTmbdnnED/view?usp=sharing)


<br/>

## 👀 참고 자료
- [요구사항 명세서](https://drive.google.com/drive/folders/1drUy5x3xpRw3aRBuF25Uy3SH0cDC2xQu)
- [화면설계: 와이어프레임](https://drive.google.com/drive/folders/1drUy5x3xpRw3aRBuF25Uy3SH0cDC2xQu)
- [API](https://drive.google.com/drive/folders/1drUy5x3xpRw3aRBuF25Uy3SH0cDC2xQu)
- [발표자료](https://drive.google.com/file/d/14KWPkBUEHtn1dkOeODKUJ2nfTmbdnnED/view?usp=sharing)

</br>

## 💫 프로젝트 회고
<details>
<summary> 🌈 좋았던 점 </summary>

 - 팀장으로 프로젝트 진행률 관리와 의사소통의 어려움을 느꼈고, 이번 경험을 통해 좋은 의사소통이란 무엇일까 다시 한번 고민하였다.
 - 스프링 시큐리티, 소셜로그인 api사용 등 기술적으로 학습하고 발전시킨 부분을 체감할 수 있었다.
 - 여전히 jpa 개념이 부족한 부분이 많지만, 엔티티의 매핑관계를 이해하고 순환참조 문제를 해결했다는 부분에서 뿌듯했다. 특히 metahaus 프로젝트에서 사용 실패했던 경험이 있기때문에 더 뜻 깊었다. 

</details>
<details>
<summary> 🌧️ 아쉬웠던 점 </summary>

 - 소셜 로그인과 셋트로 등장하는 개념인 jwt를 이해하고 구현하고 싶었는데 프로젝트 관리의 어려움때문에 충분한 시간을 확보하지 못해 충분히 공부하지 못한것이 아쉽다.
 - AWS 배포, 테스트 코드 작성, 익셉션관리 등 구현 이외의 백엔드 개발자로의 역량을 키워야한다고 생각한 부분을 성장시키지 못한것이 아쉽다.
 - 회의록 및 프로젝트 이슈 관리가 효율적으로 관리되지 못해 무용지물이 되었다 느껴졌고, 꼭 개선이 필요한 부분이라 생각된다.

</details>

</br>

## 🚀 정보
- 청년취업사관학교 새싹 영등포 SW캠퍼스<br>
  - 백엔드 구축을 위한 클라우드 기술 활용 개발자 과정(JAVA 기반)
- Sesac 🌱 Final Project
