# 응답/에러모델 만들기

### 공통 API 응답 모델과 에러 모델을 만들고 간단한 성적 저장/조회하는 API를 구현 해보기
<br>

## 🔍 API 요구사항

### 이름과 성적을 입력받아 저장하는 API
* 성적의 입력은 특정 값(위 에러 응답일 경우에서는 6)이 넘었을 경우에는 에러 응답이 나타나야 합니다.

### 입력된 성적을 조회하는 API
* 성적 오름차순으로 조회가 되어야 합니다.

### 특정 성적을 입력받아, 해당 성적의 학생만 조회하는 API

<br>

## 🚨 예외상황
- [x] 이름을 입력하지 않은 경우 -> `이름을 입력해 주세요.`
- [x] 성적을 입력하지 않은 경우 -> `성적을 입력해 주세요.`
- [x] 성적을 6이상 입력한 경우 -> `성적은 6이상을 입력 할 수 없습니다.`
- [x] 성적을 0이하 입력한 경우 -> `성적은 0이하를 입력 할 수 없습니다.`
- [x] 학생이 존재하지 않는 경우 -> `학생이 존재하지 않습니다.`
- [x] 해당 성적에 맞는 학생들이 존재하지 않는 경우 -> `해당 성적에 맞는 학생은 없습니다.`
<br>

## 🚀 구현 요구사항
### ⭐️ Controller에서 응답 모델로 만들어 주어야 합니다.
* ApiResponse<T> 여러 가지 데이터 타입(클래스)를 result로 넣을 수 있도록 제네릭을 사용하여서 구현해야 합니다.
* makeResponse(T result), makeResponse(List<T> results): 결과를 응답 객체로 만들어주기 위한 메서드입니다.
* 단건과 복수건 결과 모두 응답 객체로 만들어 줄 수 있도록 두 개 모두 구현해야 합니다.
### ⭐️ 에러 응답을 만들기 위해서는 @ExceptionHandler를 사용하여 exception의 데이터를 이용해야 합니다.
### ⭐️ exceptionHandler에서 응답 모델을 만들 때 필요한 데이터가 포함시킬 수 있는 customException을 구현해야 합니다.

<br>

## 🎯 (수행기간)
* 2024.02.28 ~ 2024.03.06
* 8일
<br>

## 결과물 예시 

![image](https://github.com/ChangMinPark2/java-shoppingBasket-PBL/assets/110027004/122b0773-0b08-477c-82c4-2bb9170ea220)


## (실행 결과물)

### 생성
* [Post] http://localhost:8080/api/v1/students
![image](https://github.com/ChangMinPark2/java-shoppingBasket-PBL/assets/110027004/d4c2a994-f68d-402b-ab91-cbb5a79f9916)

### 입력된 모든 학생들을 성적 오름차순으로 조회
* [Get] http://localhost:8080/api/v1/students
![image](https://github.com/ChangMinPark2/java-shoppingBasket-PBL/assets/110027004/598282db-cc5f-4f2f-96a7-1705894bba4d)

### 해당 성적에 맞는 학생들을 조회
* [Get] http://localhost:8080/api/v1/students/grade?grade=1
* ![image](https://github.com/ChangMinPark2/java-shoppingBasket-PBL/assets/110027004/f3aa8b63-d01f-4af0-8e8a-4b9c17b1afec)



<br>

## (예외상황 결과물)

### 이름을 입력하지 않은 경우
![image](https://github.com/ChangMinPark2/java-shoppingBasket-PBL/assets/110027004/28c7520a-32d0-49f4-8b21-8c76698bfb7e)

### 성적을 입력하지 않은 경우
![image](https://github.com/ChangMinPark2/java-shoppingBasket-PBL/assets/110027004/4d1cad97-eec4-4cb4-8d2e-e01256676e4f)

### 성적을 6이상 입력한 경우
![image](https://github.com/ChangMinPark2/java-shoppingBasket-PBL/assets/110027004/507736f5-1903-4666-91d9-2c1bc80ade31)

### 성적을 0이하 입력한 경우
![image](https://github.com/ChangMinPark2/java-shoppingBasket-PBL/assets/110027004/70faaa3e-e33b-4da2-b84c-67303e006764)

### 학생이 존재하지 않는 경우
![image](https://github.com/ChangMinPark2/java-shoppingBasket-PBL/assets/110027004/604044d3-3a9f-427d-8594-284e0191dfe7)

### 해당 성적에 맞는 학생들이 존재하지 않는 경우
![image](https://github.com/ChangMinPark2/java-shoppingBasket-PBL/assets/110027004/97ac1aee-7f5d-4543-bfda-f84fd323c176)




