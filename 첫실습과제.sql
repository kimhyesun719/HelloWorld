-- 1. �� ������� ������� �ֹι�ȣ�� ��ȸ
--    ��, �ֹι�ȣ 9��° �ڸ����� �������� '*' �� ä���� ��ȸ
--    EX) 771120-1******
SELECT EMP_NAME "�����", RPAD(SUBSTR(EMP_NO, 1, 8), 14, '*') "�ֹι�ȣ"
FROM EMPLOYEE;

-- 2. �� ������� ������, �����ڵ�, ���ʽ����Կ���(��) ��ȸ
--    ��, ���ʽ����Կ������� ���� NULL�� ���ͼ��� �ȵ�
--    �Ӹ��ƴ϶� �̶� ���ʽ����Կ����� \57,000,000�� �������� ��ȸ�ǰ� ��
SELECT EMP_NAME, JOB_CODE, TO_CHAR(SALARY+(SALARY*BONUS)*12, 'L99,999,999')||'��' AS ����
FROM EMPLOYEE
WHERE BONUS IS NOT NULL ;

-- 3. �μ��ڵ尡 D5, D9�� ������ �� 2004�⿡ �Ի��� �������� ���, �����, �μ��ڵ�, �Ի��� ��ȸ
SELECT EMP_ID, EMP_NAME, DEPT_CODE, HIRE_DATE
FROM EMPLOYEE
WHERE DEPT_CODE IN ('D9', 'D5') AND EXTRACT(YEAR FROM HIRE_DATE) = 2004; 

-- 4. ������, �Ի���, �Ի��� ���� �ٹ��ϼ�(�ָ��� ���Ѱ� ������� �� ��) ��ȸ
SELECT EMP_NAME, HIRE_DATE, LAST_DAY(HIRE_DATE) - HIRE_DATE +1
FROM EMPLOYEE;

-- 5. ������, �μ��ڵ�, ������� ��ȸ
--    ��, ��������� XX�� XX�� XX�� �������� ��ȸ�ǰ� ��
--    ��!!! ����� 200, 201, 214�� �ƴ� �����θ� ��ȸ�Ͻÿ�!!
--    (�ֳĸ�... 200, 201, 214�� ������� �ֹι�ȣ�� ������� ���� ��¥�� �̻��Ҳ�����..�Ф�)
SELECT EMP_NAME "������" ,DEPT_CODE "�μ��ڵ�"
FROM EMPLOYEE
WHERE EMP_ID NOT IN(200, 201, 214);

-- 6. �μ��ڵ尡 D5, D6, D9�� ����鸸 ��ȸ�� �ϵ� �̶� ������, �μ��ڵ�, �μ����� ��ȸ
--    (�μ��� ���� �����δ�
--     �ش� �μ��ڵ尡 D5�� ���� �ѹ��η�, D6�� ��� ��ȹ�η�, D9�� ��� �����η� ��ȸ�ǰԲ� �Ͻÿ�)
--    => CASE WHEN�� ����غ���, DECODE�� ����غ���!

SELECT EMP_NAME "������", DEPT_CODE "�μ��ڵ�", 
                         CASE WHEN DEPT_CODE = 'D5' THEN '�ѹ���'
                         WHEN DEPT_CODE = 'D6' THEN '��ȹ��'
                         WHEN DEPT_CODE = 'D9' THEN '������'
                         END AS "�μ���"
FROM EMPLOYEE
WHERE DEPT_CODE IN ('D5','D6','D9');


SELECT EMP_NAME "������", DEPT_CODE "�μ��ڵ�",
                         DECODE(DEPT_CODE, 'D5', '�ѹ���',
                                           'D6', '��ȹ��',
                                           'D9', '������')
FROM EMPLOYEE
WHERE DEPT_CODE IN ('D5','D6','D9');
                                
                                
                                
                                