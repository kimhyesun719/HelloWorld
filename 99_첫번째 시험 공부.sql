-- 첫번째 시험 공부!! 

------------------------------------ QUIZ 1 ------------------------------------
-- 보너스를 받지 않고 근데 부서배치는 되어있는 사원 조회하고 싶음!!
SELECT *
FROM EMPLOYEE
WHERE BONUS = NULL AND DEPT_CODE != NULL;
-- NULL값에 대해 정상적으로 비교 처리 되지 않음!

-- 문제점 : NULL값 비교할때는 단순한 일반 비교연산자를 통해 비교 할 수 없음!!
--         IS NULL / IS NOT NULL 을 통해 비교 해야 됨
SELECT *
FROM EMPLOYEE
WHERE BONUS IS NULL AND DEPT_CODE IS NOT NULL;
--------------------------------------------------------------------------------

------------------------------------ QUIZ 2 ------------------------------------
-- 검색하고자 하는 내용
-- JOB_CODE가 J7이거나 J6이면서 SALARY값이 200만원 이상이고
-- BONUS가 있고 여자이며 이메일주소는 _ 앞에 3글자만 있는 사원의
-- EMP_NAME, EMP_NO, JOB_CODE, DEPT_CODE, SALARY, BONUS를 조회하고싶다
-- 정상적으로 조회가 잘 된다면 실행결과는 2행(전지연,이태림)이여야만 한다.

-- 위의 내용을 실행시키기 위해 작성된 SQL문은 아래와 같다
SELECT EMP_NAME, EMP_NO, JOB_CODE, DEPT_CODE, SALARY, BONUS
FROM EMPLOYEE
WHERE JOB_CODE = 'J7' OR JOB_CODE ='J6' AND SALARY > 2000000
  AND EMAIL LIKE '____%' AND BONUS IS NULL;

-- 위의 SQL문 실행시 원하는 결과가 제대로 조회되지 않는다. 이때 어떤 문제점(5개의문제점)들이 있는지
-- : JOB_CODE 문을 괄호로 묶어 줘야함, SALARY 기호를 >=으로 바꿔줘야함, BONUS를 IS NOT NULL로
--   로 바꿔 줘야함, SUBSTR (EMP_NO, 8, 1) IN (2,4)추가해야함, EMAIL _앞에 ESCAPE옵션 사용해야함

-- 모두 찾아서 서술해볼것! , 그리고 조치한 완벽한 SQL문을 작성해볼것! 
SELECT EMP_NAME, EMP_NO, JOB_CODE, DEPT_CODE, SALARY, BONUS, EMAIL
FROM EMPLOYEE
WHERE (JOB_CODE = 'J7' OR JOB_CODE ='J6') 
  AND SALARY >= 2000000
  AND EMAIL LIKE '___#_%' ESCAPE '#' 
  AND BONUS IS NOT NULL 
  AND SUBSTR (EMP_NO, 8, 1) IN ( 2, 4);
-- 결론
-- 문제점1. OR연산자와 AND연산자가 나열되어있을 경우 AND연산자 먼저 수행됨! 문제 요구대로 OR연산이 먼저 수행되어야함
-- 문제점2. 급여값 비교 연산을 > 이 아닌 >=로 비교 해야 됨!
-- 문제점3. 보너스가 있는 이라는 조건에 IS NULL이 아닌 IS NOT NULL을 사용해야 됨!
-- 문제점4. 여자라는 조건을 수행 할 구문이 누락 되었다.
-- 문제점5. 이메일에 대한 비교시 네번째 자리에 있는 _를 데이터값으로 취급하기 위해서 새 와일드 카드를 제시한 후 ESCAPE옵션등록을 해야함

----------------------------------- QUIZ 3 -------------------------------------
-- [계정 생성 구문] CREATE USER 계정명 IDENTIFIED BY 비밀번호;

-- 계정명:SCOTT, 비밀번호:TIGER 계정을 생성하고 싶다!
-- 이때 일반 사용자 계정인 KH계정에 접속해서 CREATE USER SCOTT;로 실행하니 문제 발생!!
-- 문제점1. 사용자 계정 생성은 무조건 관리자 계정에서만 가능!
-- 문제점2. SQL문 잘못되어 있음

-- 조치내용1. 관리자계정에 접속해야됨!
-- 조치내용2. CREATE USER SCOTT IDENTIFIED BY TIGER;로 실행!

-- 위의 SQL문(CREATE)만 실행 후 접속을 만들어 접속을 하려고 했더니 실패
-- 뿐만 아니라 해당 계정에 테이블 생성 같은 것도 되지 않음!!
-- 문제점. 사용자 게정 생성 후 최소한의 권한 부여!

-- 조치내용. GRANT CONNECT, RESOURCE TO SCOTT; 구문 실행해서 권한 부여





