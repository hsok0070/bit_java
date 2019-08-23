select * from emp;
select * from dept;

select ename,hiredate from emp;

select ename,sal,comm from emp;

select ename,sal,sal*12,comm from emp;
desc dept;

select ename,sal,sal*12 as 년봉,comm from emp;
select ename,sal,sal*12 as "년 봉",comm from emp;
select ename,sal,sal*12 "년 봉",comm from emp;

select dname,loc from dept;

conn hr/hr
select* from employees;
select first_name,job_id,department_id from employees;

conn SCOTT/TIGER

--null을 포함한 산술식은 null
select empno, ename,sal,comm , sal+comm 지급급여 from emp;

-- null을 0값으로 변경 할려면 nvl(속성명,0)
select empno, ename,sal,comm, nvl(comm,0), sal+nvl(comm,0) 월급여 from emp;
select empno, ename,sal,comm, (sal+nvl(comm,0))*12 년봉 from emp;

-- 숫자 타입의 속성을 to_char를 이용하여 문자로 캐스팅

select empno, ename,nvl(mgr,'CEO'),deptno from emp; 'x'

select empno, ename,nvl(to_char(mgr),'CEO'),deptno from emp;

-- ### 문자열 연결 연산자 ||
select empno, ename,deptno from emp;
select empno||'   '||ename||'   '||deptno from emp;
select empno, ename,deptno||'원' as deptno from emp;

--가상테이블 dual
select 10*24*24 from dual;
select 10*24*24 from emp;

select sysdate from dual;

-- 중복제거 (distinct)
select job  from emp;
select distinct job from emp;

select deptno from emp;
select distinct deptno from emp;

select * from emp;

-- row 제한 where 절 사용 (조건 대상은 대소문자 구분)
select * from emp where deptno=20;

select * from emp where job='manager';
select * from emp where job='MANAGER';

-- 대소문자 구분없이 검색하는 방법 lower소문자 upper대문자
select * from emp where lower(job)='manager';

-- 연산자
select * from emp where hiredate = '81/09/28';
select * from emp where hiredate <> '81/09/28';
select * from emp where hiredate != '81/09/28';

select * from emp where sal >= 3000;

select * from emp where sal >= 3000  and sal <=5000;

select * from emp where sal between 3000 and 5000;
select * from emp where sal not between 3000 and 5000;


-- 집합연산자 in
select * from emp where deptno=20 or deptno=30;
select * from emp where deptno in(10,20);

select * from emp where deptno not in(10,20);

select * from dept where (deptno,loc) IN((10,'DALLAS'),(30,'CHICAGO'));

-- like 연산자
select * from emp where ename = 'ALLEN';

select * from emp where ename like 'S%';

select * from emp where ename like '%M_T%';

-- 정규식 처리
select * from emp where regexp_like(ename, 'A|B|C|D');

select * from emp where regexp_like(ename, '[A-D]');
select * from emp where regexp_like(ename, '^[A-D]');

select * from emp where regexp_like(ename, '[A-D]$');

--null 비교는 = 이 아닌 is 로 
select * from emp where comm is null;

--row 제한 where 절 사용, 별칭 사용 안됨
select ename, sal, comm,sal+nvl(comm,0) total from emp where total>3000;
select ename, sal, comm,sal+nvl(comm,0) total from emp where sal+nvl(comm,0)>3000; 

select ename,sal,comm,sal+nvl(comm,0) total from emp where deptno=20;

-- 정렬 order by 기본 오름차순, 별칠 사용 가능
select ename, sal, comm,sal+nvl(comm,0) total,deptno from emp order by deptno;

select ename, sal, comm,sal+nvl(comm,0) total,deptno from emp order by deptno desc;

select ename, sal, comm,sal+nvl(comm,0) as total,deptno from emp order by total;

select ename, sal, comm,sal+nvl(comm,0) as total,deptno from emp order by 2;

select ename, sal, comm,sal+nvl(comm,0) as total,deptno from emp order by deptno desc, total;


select * from emp where deptno=20 order by sal;

select * from emp where deptno in (20,30);

select * from emp where deptno = any (20,30) order by sal;
select * from emp where deptno != any (20,30) order by sal;
select * from emp where deptno <> any (20,30) order by sal;

-- 내장 함수 p204 single row function

select * from dept;

select dname,loc from dept;		
select dname,lower(dname),loc,lower(loc) from dept;

select round(45.5678) , trunc(45.5678) from dual;
select round(45.5678,2) , trunc(45.5678,2) from dual;

select sysdate , sysdate+1 from dual;

select ename , substr(hiredate,1,2) as 입사년도 from emp;

select sysdate , to_char(sysdate,'day') from dual;

--emp 테이블에서 사원들의 입사월 출력
select ename, hiredate, to_char(hiredate,'mm') from emp;

-- 문자를 날짜로 변경 to_date
select sysdate,to_date('2019/08/14') from dual;

select sysdate,to_date('08/04/19') from daul;
select sysdate,to_date('08/14/19','mm/dd/yy') from dual;

--nvl()함수
select ename, mgr , nvl(to_char(comm),'_') from emp;
select ename, mgr , nvl(comm,0) from emp;

--nvl2(a,b,c)
select ename, mgr, nvl2(comm,comm,0) from emp;

select ename, nvl2(mgr,'O','X'), nvl(comm,0) from emp;

--decode 함수
select ename, sal, deptno, decode(deptno, 10 , sal*1,
								  deptno, 20 , sal*2,
								  deptno, 30 , sal*3,
								  sal) as 계산 from emp;