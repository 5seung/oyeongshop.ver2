## **👗OyeongShop.ver2 (오영샵)**
- 심플하고 직관적으로 상품을 보고 구매 할 수 있도록 설계한 여성의류 쇼핑몰 프로젝트입니다.
- [oyeongshop.ver1](https://github.com/5seung/OyeongShop) 에서 구현하지 못한 쇼핑몰의 핵심 기능을 추가하였습니다.
- 개발 기간 : 23.10.23 ~ 23.11.27<br>
- 참여 인원 : 5명 (amolli: 아몰리)<br>
      
    |<img src="#" width="140" height="160"/><br/>BE 오승언 (팀장) <br/><a href="#">GitHub</a>|<img src="#" width="140" height="160"/><br/>BE 강정환 <br/> <a href="#">GitHub</a>|<img src="#" width="140" height="160"/><br/>BE 김나영 <br/><a href="#">GitHub</a>|<img src="#" width="140" height="160"/><br/>BE 김윤설 <br/><a href="#">GitHub</a>|<img src="#" width="140" height="160"/><br/>BE 박형배 <br/><a href="#">GitHub</a>|
    |:---:|:---:|:---:|:---:|:---:|
    | <strong>주요 역할</strong> <br> &middot; 전체 프로젝트 관리 <br> &middot; 회원 및 결제 파트 <br> &middot; 프론트 디자인|<strong>주요 역할</strong> <br> &middot; 상품 파트 | <strong>주요 역할</strong> <br> &middot; 리뷰 및 위시리스트 파트 <br/> &middot; 프론트 디자인 | <strong>주요 역할</strong> <br/> &middot; 주문 파트 | <strong>주요 역할</strong> <br/> &middot; 장바구니 파트 |

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
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/IntelliJ idea-000000?style=for-the-badge&logo=IntelliJ idea&logoColor=white"> <img src="https://img.shields.io/badge/figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white">

## 💻 ERD


</br>

## 📍 주요 기능
### [유저(회원) 권한]

<details>
<summary>회원가입 및 로그인</summary>
  
- 사이트를 통한 회원 가입 및 로그인
- 소셜 로그인(카카오, 네이버, 구글) 인증 후 로그인
- 아이디 중복 체크
  
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
    
- 결제(포트원 결제 api)
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


### [관리자 권한]
<details>
<summary>상품</summary>
  
- 상품 등록  
  + 상품 이미지는 1장 이상 필수 입력
  + 상품 이미지는 AWS S3 에 저장
  
- 상품 상세 내용 수정
  
</details>



### [기능 영상] 






</br>

## 💊 트러블 슈팅

</br>

## 💫 프로젝트 회고

### 🌈 좋았던 점
- 
- 
### 🌧️ 아쉬웠던 점
- 
- 

</br>

## 🚀 정보
- 청년취업사관학교 새싹 영등포 SW캠퍼스<br>
  - 백엔드 구축을 위한 클라우드 기술 활용 개발자 과정(JAVA 기반)
- Sesac 🌱 Final Project
