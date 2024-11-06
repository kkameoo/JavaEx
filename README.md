# JAVA
---
---
<h2>2024.11.06</h2>

---
배열의  크기

    - 배열의 크기를 변경 불가능
    - 새 크기의 배열을 생성하고 복사
    - System.arraycopy() 메서드를 사용하면 간편함

        arraycopy()의 매개변수
            - 원본, 원본시작위치, 복사본, 복사본시작위치, 복사할길이       

---
String[] args

    args 단자에 java is fun 이라는 매개변수 담기

        java -jar MainArgs.jar java is fun
---
new

    - Heap메모리에 객체를 생성

---
사용하지 않는 객체

     - 참조가 없는 객체는 jvm이 가비지 콜렉터에 버린다




---
---

<h2>2024.11.05</h2>

---
참조값 비교

    String varName = "문자열";
    String varName2 = "문자열";
    String varName = new String("문자열");

        -> varName 이랑 varName2는 똑같은 문자열이면같은 위치를 참조하기 때문에 == 를 쓰면 true가 나온다.

        -> 하지만 varName3는 다른 위치의 객체를 참조하기 떄문에 false가 나온다.

    참조 복제 -> 참조(주소)값 복사

        -> 같은 주소를 가르키는 것 이므로 복사한 객체에서 값을 바꾸면 원본의 값이 변경이 된다.
---
특수문자

    이스케이프 문자 \
    형식 문자열 %
---
formatting 

    String.format 메서드 활용한 것
    %d 뒤에 ' , ' 를 찍으면 일정 단위마다 , 를 찍어준다.
---
배열

    길이 0부터 시작 -> 0 ~ length - 1

---
---

<h2>2024.11.01</h2>

---
표준 입력 STD in

    stdin -- > System.in

표준 출력 STD out

    stdout -- > System.out

표준 에러 STD err

    stderr -- > System.err
---
import

    - java.lang 이외의 기능을 불러올 때는 import 필요

    - System 자원은 한정적이기 때문에 다 쓰고 close() 함수를 통해 닫아줘야한다
---
단축키

    Ctrl + Shift + o --> 자동 import 기능 단축키

    Ctrl + Space --> 코드 자동완성 기능 단축키
---
이클립스 git
    - 프로젝트 -> team -> share project -> git생성

    - .gitignore 등록
	- 목적 : 특정 시스템의 환경 정보 등을 git에 등록 안한다는 의미

방법 1

    - https://github.com/github/gitignore
	
    - 필요한 언어, 환경의 gitignore를 참조
방법 2

	- https://gitignore.io/
---
설정

    - Git Perspective
	    - 저장소 우클릭
	        -Properties
			    -Add Entry - > user.name , user.email 등록
---
[GitHub]

    - 원격 저장소 생성
    - https://github.com/kkameoo/JavaEx.git
    1. Personal access tokens
    2. Tokens (classic)
    3. 토큰 발행
---
- GIT : 분산 관리 시스템

- GITHUB : 저장소
--- 
<h3> 1. </h3>

    1) git init -> 저장소 생성
    2) git 설정
        ``` bash
        - git config user.name "donggil Han"
        - git config user.email "khdg1202@naver.com"
        # 공용 git 설정 -g
        ex) git config -g user.name 이름
    3) git add -> staging 등록
        ``` bash
        - git add .
    4) git commit -> 실제 저장소 저장
        ``` bash
        - git commit -m "이름"
    5) git status (상태 확인)
    6) git log

### Local Git to GitHub
    - 깃헙에서 저장소 생성
    - 저장소 주소
        - https://github.com/kkameoo/GITTEST.git

    - 원격지 등록
        - git remote add 이름 주소
        - git remote add origin https://github.com/kkameoo/GITTEST.git
    
    - push
        - git push 원격지 브랜치명
        - git push -u origin master

### From Github to Local Git
 - 복제할 원격 저장소 주소 확보
 - 복제
        - git clone 원격지 주소
---
---

<h2>2024.10.31</h2>

---
utf8 

    언어코드 + 문자코드 -> 압축   
---
final 

    - 한 번 할당되면 재할당 불가능 
    - 상수선언에 사용
    - 상수의 이름은 모두 대문자 사용, ' _ ' 로 구분
---
상수

    - 데이터에 불변성을 부여하는 것
---
Casting (형변환)

    - 특정 자료를 다른 자료형으로 바꾸는 작업

    Implicit Casting (암묵적 형변환)

        - 표현 범위가 좁은 자료형에서 넓은 자료형으로 변환할 때 자동으로 변환되는 현상
---
    Forcing Casting (강제 형변환)

        - 표현 범위가 넓은 자료혀에서 좁은 자료형으로 변환
        - 강제로 변환 -> 자료 유실 위험
---
---

<h2>2024.10.30</h2>

---
cmd 

    절대경로 탐색 - root (\)기준

    dir - 현재 계층에서 디렉토리 파일들을 보여준다
    cd - 다른 디렉토리 파일로 이동

    ex) cd\Users\202-00\Documents
---

    상대경로 탐색 - CurrentWorkingDirectory (CWD)기준

    . - 현재 dir
    .. - 부모 dir

    ex> cd..\Downloads
---
class 이름 명명 규칙

    - 각 단어의 첫글자 대문자
    - 영문자 사용
    - _ , $ , 숫자 사용 가능
    - 맨 앞글자 숫자 사용 불가능
    - 클래스 이름은 파일명과 일치해야함
---
패키지 명명 규칙

    영문소문자 , ' . '
---
변수 명명 규칙

    - 문자, 숫자, $, _ 의 조합으로 생성
    - 숫자로 시작 불가능
    - 소문자로 작성, 단어의 조합이면 카멜표기법
---
print 표기법

    0b -> 2진수 표기
    0 -> 8진수 표기
    0x -> 16진수 표기
---
캐스팅시 유의사항

    byte * byte = byte
    byte를 int형으로 반환하고 다시 byte로 반환
    - 바람직하지 않은 형태
---
부동소수점 처리 유의사항

    - float, double은 정밀도 포기, 표현 범위 넓힌 것
    - 정밀한 실수 계산을 할 때는 다른 방법을 사용
---
---