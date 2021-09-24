-- 1. 전 사원들의 직원명과 주민번호를 조회
--    단, 주민번호 9번째 자리부터 끝까지는 '*' 로 채워서 조회
--    EX) 771120-1******
SELECT EMP_NAME "사원명", RPAD(SUBSTR(EMP_NO, 1, 8), 14, '*') "주민번호"
FROM EMPLOYEE;

-- 2. 전 사원들의 직원명, 직급코드, 보너스포함연봉(원) 조회
--    단, 보너스포함연봉값에 절대 NULL이 나와서는 안됨
--    뿐만아니라 이때 보너스포함연봉은 \57,000,000원 형식으로 조회되게 함
SELECT EMP_NAME, JOB_CODE, TO_CHAR(SALARY+(SALARY*BONUS)*12, 'L99,999,999')||'원' AS 연봉
FROM EMPLOYEE
WHERE BONUS IS NOT NULL ;

-- 3. 부서코드가 D5, D9인 직원들 중 2004년에 입사한 직원들의 사번, 사원명, 부서코드, 입사일 조회
SELECT EMP_ID, EMP_NAME, DEPT_CODE, HIRE_DATE
FROM EMPLOYEE
WHERE DEPT_CODE IN ('D9', 'D5') AND EXTRACT(YEAR FROM HIRE_DATE) = 2004; 

-- 4. 직원명, 입사일, 입사한 달의 근무일수(주말에 대한건 고려하지 말 것) 조회
SELECT EMP_NAME, HIRE_DATE, LAST_DAY(HIRE_DATE) - HIRE_DATE +1
FROM EMPLOYEE;

-- 5. 직원명, 부서코드, 생년월일 조회
--    단, 생년월일은 XX년 XX월 XX일 형식으로 조회되게 함
--    꼭!!! 사번이 200, 201, 214가 아닌 사원들로만 조회하시오!!
--    (왜냐면... 200, 201, 214번 사원들의 주민번호쪽 생년월일 보면 날짜가 이상할꺼에용..ㅠㅠ)
SELECT EMP_NAME "직원명" ,DEPT_CODE "부서코드"
FROM EMPLOYEE
WHERE EMP_ID NOT IN(200, 201, 214);

-- 6. 부서코드가 D5, D6, D9인 사원들만 조회를 하되 이때 직원명, 부서코드, 부서명을 조회
--    (부서명에 대한 값으로는
--     해당 부서코드가 D5일 경우는 총무부로, D6일 경우 기획부로, D9일 경우 영업부로 조회되게끔 하시오)
--    => CASE WHEN도 사용해보고, DECODE도 사용해보삼!

SELECT EMP_NAME "직원명", DEPT_CODE "부서코드", 
                         CASE WHEN DEPT_CODE = 'D5' THEN '총무부'
                         WHEN DEPT_CODE = 'D6' THEN '기획부'
                         WHEN DEPT_CODE = 'D9' THEN '영업부'
                         END AS "부서명"
FROM EMPLOYEE
WHERE DEPT_CODE IN ('D5','D6','D9');


SELECT EMP_NAME "직원명", DEPT_CODE "부서코드",
                         DECODE(DEPT_CODE, 'D5', '총무부',
                                           'D6', '기획부',
                                           'D9', '영업부')
FROM EMPLOYEE
WHERE DEPT_CODE IN ('D5','D6','D9');
                                
                                
                                
                                