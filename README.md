# java-racingcar-precourse

## 🚘  초간단 자동차 경주 게임

### **⭐️ 필수 - 기능 요구 사항**

----
**입출력 요구사항**
- [x]  콘솔에 "경주할 자동차 이름(이름은 쉼표(,) 기준으로 구분)"를 출력한다.
- [x]  콘솔에 "시도할 횟수"를 출력한다.
- [x]  콘솔에 "실행 결과"를 출력한다.
- [x]  콘솔에 "최종 우승자 : "를 출력한다.
- [x]  전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- [x]  사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- [x]  자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

**주 기능 요구사항**
- [x]  주어진 횟수 동안 n대의 자동차는 전진 할 수 있다.
- [x]  주어진 횟수 동안 n대의 자동차는 멈출 수 있다.
- [x]  경주할 자동차의 이름을 구분자(쉼표)를 기준으로 구분한다.
- [x]  사용자는 경주할 자동차의 이름을 구분자(쉼표)를 기준으로 입력할 수 있어야 한다. 
- [x]  각 자동차에 이름을 부여할 수 있다.
- [x]  자동차 이름을 반환한다. 
- [x]  전진하는 자동차의 상태를 반환한다.
- [x]  자동차 이름은 쉼표(,)를 기준으로 구분한다. 
- [x]  이름은 5자 이하만 가능하다.
- [x]  0에서 9 사이에서 무작위 값을 구한다.
- [x]  전진하는 조건은 무작위 값이 4 이상일 경우이다.
- [x]  우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
- [x]  레이싱 프로그램을 실행시킬 메서드를 구현한다.
- [x]  레이싱 프로그램을 실행한다.

**에러처리 요구사항**
- [x]  사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다.
    - [x]  입력한 이름의 길이가 5글자 이상인 경우

### **추가 - 기능 요구 사항**

-----

**에러처리 요구 사항**

사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.
- [x] 동일한 이름을 입력한 경우
- [x] 이름에 영어가 아닌 다른 문자나 기호가 들어간 경우
### **프로그램 실행 예시**

### **입력**

- 경주할 자동차 이름(이름은 쉼표(,) 기준으로 구분)

```
pobi,woni,jun
```

- 시도할 횟수

```
5
```

### **출력**

- 차수별 실행 결과

```
pobi : --
woni : ----
jun : ---
```

- 단독 우승자 안내 문구

```
최종 우승자 : pobi
```

- 공동 우승자 안내 문구

```
최종 우승자 : pobi, jun
```

### **실행 결과 예시**

```
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,woni,jun
시도할 횟수는 몇 회인가요?
5

실행 결과
pobi : -
woni :
jun : -

pobi : --
woni : -
jun : --

pobi : ---
woni : --
jun : ---

pobi : ----
woni : ---
jun : ----

pobi : -----
woni : ----
jun : -----

최종 우승자 : pobi, jun
```