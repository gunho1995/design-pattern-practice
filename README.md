# design-pattern-practice
## Command Pattern
- Before :
  - Calculator ---> Adder 
  - Calculator ---> Subtractor

- After :
  - Calculator ---> Interface Command <--- Adder
  - Calculator ---> Interface Command <--- Subtractor

### 패턴 설명
수학자는 Calculator 를 이용하여 같은 버튼을 눌러 덧셈, 뺄셈을 수행하고 싶다.

Command Pattern 을 적용하지 않았을 시 Calculator 가 덧셈, 뺄셈 뿐만 아니라 추가 기능 실행 시 Calculator 클래스에도 변경이 필요하다.

Command Pattern 을 적용하여 Command Interface 에서 실행될 기능을 캡슐화 하여 재사용하도록 한다.

## Builder Pattern
### 패턴 설명 

## Factory Pattern
#### 패턴 설명
