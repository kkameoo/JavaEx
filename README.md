# JAVA

---
---
<h2>2024.11.14</h2>

---

    - InputStream - 바이트 스트림용 입력 클래스
    - OutputStream - 바이트 스트림용 출력 클래스
    - Reader - 문자 스트림용 입력 클래스
    - Writer - 문자 스트림용 출력 클래스
    - 4개 다 추상 클래스 

주 스트림

    - 데이터의 출력과 입력이 가능

보조 스트림

     - 데이터를 변환기능을 수행

InputStream

    read()
        - 입력 스트림으로부터 1바이트를 읽고 4바이트 int 타입으로 리턴
        - 리턴된 4바이트 중 끝의 1바이트에만 데이터가 있음
        - 데이터가 없으면 -1 을 반환

OutputStream

    write(int b)
        - 매개변수로 주어진 int 값에서 끝에 있는 1바이트만 출력 스트림으로 전송
    flush()
        - OutputStream은 바로 출력되는 것이 아니라 내부에 있는 작은 버퍼에 쌓여 있다가 순서대로 출력됨

File 클래스

    - 파일 생성 및 삭제, 정보, 디렉토리 관련 기능
    - 파일의 입출력은 stream을 사용해야함

Reader
 
    read()
        - 입력 스트림으로부터 한 개의 문자(2byte)를 읽고 4바이트 int 타입으로 리턴
        - 메서드가 리턴한 int값을 byte로 변환하면 읽은 문자를 읽을 수 있음
    
Writer

    write(String str)
        - 매개변수로 주어진 str 문자열을 출력 스트림으로 전송





---
---
<h2>2024.11.13</h2>

---
HashSet

    - java.util.HashSet
    - 자료의 순서가 없음 중복 불가능
    - 해쉬테이블에서 키 없이 값들만 존재하는 경우
    - 검색이 빠르다
HashCode

    - 객체를 식별할 하나의 정수값을 의미
    - Object의 hashCode()메서드는 객체의 메모리번지를 이용해 해쉬코드를 만들어 리턴
        -> 모든 객체는 다른 값을 가진다
    - Hash 관련 컬렉션들은 hashcode()값을 비교하고 equals()로 값을 비교해서 동등객체인지 판단

    동일성

        - 두 객체가 같은 객체
    동등성

        - 내부 객체가 같은 자격을 가짐

hashTable

    - key - hashset
    - key값은 중복 불가능 순서도 없음
    - value - list
    - 두 쌍을 map 인터페이스를 다루는 자료구조
    
Enumration

    - 벡터와 해시테이블에 존재하는 요소들에 대한 접근방식을 제공하는 인터페이스
    - vector, hashtable 사용
    
iterator

    - 자바에서 제공하는 컬렉션에 대해 각 항목들을 순차적으로 접근하는데 사용
    - 값이 많으면 사용
    - set, List 사용

---
---
<h2>2024.11.12</h2>

---
제네릭

    - 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 것
    사용하는 이유
        
        - 객체의 타입을 컴파일시에 강하게 체크가능
        - 형변환의 위험성(다운캐스팅)을 낮출 수 있음

    상속

        - 제네릭 클래스들도 상속 구조를 나타낼 수 있음
        - extends나 implements로 표현
    
    와일드 카드

        - 기호 ? 로 나타내며 어떤 타입도 가능
        - <?>  -> 모든 타입 가능
        - <? extends T>  -> T와 T를 상속받은 자손들만 가능
        - <? super T>  -> T와 T의 조상들만 가능
컬렉션

    - List -> 순서가 있는 데이터의 집합, 데이터의 중복을 허용
    - Set -> 순서가 없는 데이터의 집합, 데이터의 중복을 허용하지 않음
    - Map -> 순서가 없는 데이터의 집합, 키는 중복x 값은 중복 허용
---

배열

    - 빠른 접근
    - 기본 자료유형 사용 가능
    - 고정 크기
    - 비효율적 메모리 점유
    - 최대 크기를 넘어서는 배열을 새로 정의
    - JAVA 자체적 지원

리스트

    - 가변적 크기
    - 필요시 메모리를 할당하므로 효율적
    - 느린 접근
    - 참조자료 유형만 사용 가능
    - java.util.List 인터페이스 정의
---

Vector

    - 객체만 저장 가능
    - vector의 참조 결과는 항상 Object -> 적절한 Type으로 변환
    - Generic으로 지정하지 않으면 여러 타입을 동시에 저장 가능

LinkedList

    - 링크로 연결된 노드의 집합
    - java.util.LinkedList
    - 임의의 객체를 리스트로 저장하는 기능 제공
    - index를 통한 참조 접근은 불가 -> Head로부터 링크를 따라가면서 접근
    - 각 노드는 자신이 나타내는 데이터와 다음 노드로의 링크를 가지고 있음
    - 링크 생성시 전의 링크의 참조만 끓어서 새 노드에 연결하는 형식

ArrayList

    - java.util.ArrayList
    - vector, LinkedList, ArrayList 모두 추상 클래스 AbstractList를 상속받은 동적 자료구조
    - 배열을 다루는 것과 유사한 방식으로 동적 자료 구조를 사용 가능
    - Vector vs List

        - vector - 동기화된 삽입 삭제 동작 제공
        - List - 삽입과 삭제가 동기화 되어 있지 않음 - 외부적 동기화 필요
    
    - ArrayList는 LinkedList와 동작 방식은 같으나 내부 구현 방식이 다르다
    - ArrayList는 중간에 객체가 삭제되면 뒤의 객체들을 당겨 인덱스를 재구성
    - 따라서 마지막 인덱스에 객체가 추가되는 속도는 LinkedList보다 빠르지만 중간에 객체의 추가 삭제가 빈번하게 일어나는 경우는 속도 저하가 일어난다
    - 하고자 하는 작업에 적합한 자료구조를 택해야 한다
---
Stack

    - java.util.Stack -> Vector클래스를 상속받아 구현
    - LIFO 방식

Queue

    - java.util.Queue
    - 목록에 가장 마지막에 새로운 항목이 추가
    - FIFO 방식

---
---
<h2>2024.11.11</h2>

---
hashcode

    - 객체 식별코드

equals()

    - 객체의 값을 비교

String

    - 불변성

        - 값을 변경하면 객체의 값이 바뀌는게 아니라 새로운 객체를 생성하고 참조 주소를 바꾸기 떄문에 불변성을 지닌다

    String 리터럴 vs new String()

        - string 리터럴로 만든 객체는 값이 같으면 같은 객체라고 인식
        - new 키워드로 생성한 string은 다른 객체라고 인식

StringBuffer 

    - 사용이유

        - string클래스를 써서 대용량 크기의 문자를 다루면 객체의 생성과 삭제에서 많은 처리가 이루어지기 때문에 효율적인 작업을 위해 사용한다
    
    - 특징

        - String은 문자열을 수정하면 새로 객체를 생성하는 반면 Buffer는 객체의 값을 수정하다가 최종적으로 문자열을 반환한다
        

---
---
<h2>2024.11.08</h2>

---
상속

    - 자식클래스를 생성 할 경우 부모클래스의 생성자가 실행되고 자식클래스의 생성자가 실행된다. 

업캐스팅

    - 부모 타입으로 참조되는 자식 객체
    - 참조 타입의 설계도에 있는 것 만 사용 가능

다운캐스팅

    - 부모 타입에서 원래 타입으로 되돌리는 것
    - instanceof 로 객체타입 확인
추상화

    - 추상 메서드를 하나라도 가지고 있어야함
    - 상속받은 클래스에서 메서드를 강제로 구현해야함(강제성 존재)

인터페이스

    - abstract랑 달리 관계없는 것들에게 공통 기능을 넣을 떄 사용
    - 모든 메서드가 추상이여서 키워드를 안넣어도 되고 구현부에서 무조건 구현해야한다

---
---
<h2>2024.11.07</h2>

---
가변 매개변수

    - 일반 매개변수 , 가변 매개변수 가 같이 있을 때 순서가 중요
    - 일반 매개변수가 먼저 선언되고 가변 매개변수가 뒤에 선언되야 함

Getter, Setter

    - 메소드를 통한 접근을 하게 되면 개체의 데이터를 변경할 경우 무결성 체크를 할 수 있다

생성자

    - 생성자를 따로 만들지 않으면 jvm이 객체를 생성 할 떄 기본생성자를 추가한다
    - 사용자가 직접 생성자를 만들경우 jvm이 기본생성자를 추가하지 않는다.

static

    - static 블록은 class가 메모리에 로딩될 때 같이 생성
    - static 블록은 생성자보다 먼저 생성
    - instance 변수는 객체 생성시 메모리에 생성
    - instance 영역에서 class(static)로 접근가능
    - static은 인스턴스 영역으로 접근 불가능
    - static에서 static으로 접근 가능
    - 지역 변수는 메서드가 실행되고 끝날 떄 일시적으로 생성되고 삭제된다
    
Main 메서드는 static인 이유

    실행문은 인스턴스가 생성되기 전에 먼저 생성되어야 하므로 static으로 선언한다.

import

    - browse -> 압출파일 선택
    - build path -> library -> 기존 자바 버전 삭제하고 현재 버전 추가하기

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
객체지향 4가지 특성

    - 상속성 - 상속을 통한 코드 재사용
    - 캡슐화 - 접근자로 접근성 제어
    - 다형성 - 오버로딩을 통한 다양한 형태의 매서드나 클래스 구현
    - 추상화 - 일반화 -> 코드 재사용
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