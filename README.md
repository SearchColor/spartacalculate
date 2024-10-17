<p align="center">
<img src="https://cdn.jim-nielsen.com/ios/512/calculator-2017-10-10.png?rf=1024" width="20%" height="20%" title="px(픽셀) 크기 설정" alt="Calculator"></img>
</p>

# Calculator Project
2개의 숫자를 입력받아 계산을 해주는 계산기 프로그램.

>- ## 구현한 기능
>1. 사칙연산( + , - , *, / )기능
>2. 계산한값들 저장기능
>3. 저장된 계산값들과 입력한 숫자중 큰값 비교기능
>4. 계산프로그램 종료기능(exit)

>- ## 설계
>```java
>while(true){ //반복적으로 계산을 하기위한 전체 반복문
>
>      while(true){ //intput 반복문
>        // input data 입력받는 내용
>        // 개별로 입력받아 잘못입력받을시 그지점에서 다시 입력받기위해 반복문으로 구현
>      }
>      
>}
>```
> - 사칙연산기능 : Calculator class 에서 계산하여 return
>
> - 계산한값들 저장기능 : collection 중 queue list를 사용하여 값들을 저장
>
> - 저장한값들과 비교기능 : list에 값들을 저장할때 PriorityQueue(우선순위 큐)에도 저장하고 peek()한 값을 비교하는 방법으로 구현
>
> - 계산기프로그램 종료기능 : scanner로 String conti 를 입력받아 n이면 전체 반복문을 break; 하는 방식으로 구현
>



