select * from emp;

select ename,sal from emp where deptno=10;

select ename,sal,deptno from emp order by deptno;

######################################
join
######################################

select ename,dname from emp,dept where emp.deptno = dempt.deptno;

select ename,d.deptno as 부서번호 , dname,loc from emp e,detp d where e.deptno = d.deptno;

select * from emp, e,detp d where e.deptno = dept.deptno and sal>2500;

######################################
ANSI join	. -> join , where -> on
######################################
select ename,d.deptno,dname,loc from emp e,dept d where e.deptno = d.deptno;

오라클 join -> 안시 join
-- inner 양쪽 테이블에 모두 존재하는 내용만 출력
select ename, d.deptno, dname, loc from emp e inner join dept d on e.deptno = d.deptno where sal>2500;

######################################
outer join
######################################
*** + null 쪽에 마킹 ***
select ename,sal,dname,loc,e.deptno from emp e,dept d where e.deptno(+)=d.deptno; 

-- anci 방식
select ename,sal,dname,loc,e.deptno from emp e right outer join dept d on e.d
eptno=d.deptno;

select ename,sal,dname,loc,e.deptno from emp e left outer join dept d on e.d
eptno=d.deptno;

select ename,sal,dname,loc,e.deptno from emp e join dept d on e.deptno(+)=d.deptno; 

######################################
non-equi join
######################################

select * from salgrade;

select ename,sal,grade from emp e , salgrade s where sal between losal and hisal;

select ename,sal,grade from emp e join salgrade s on sal between losal and hisal;

######################################
3개의 테이블 조인
######################################
select ename,sal,dname,loc,grade from emp e, salgrade s, dept d 
where e.deptno=d.deptno and e.deptno=20 and sal between losal and hisal order by e.deptno;

select ename,sal,dname,loc,grade from emp e join dept d 
on e.deptno = d.deptno join salgrade on sal between losal and hisal order by e.deptno;

select ename, sal, dname,loc,grade from emp join dept on emp.deptno = dept.deptno join salgrade
on sal between losal and hisal order by emp.deptno;

select ename, sal, dname,loc,grade from emp join dept on emp.deptno = dept.deptno join salgrade
on sal between losal and hisal where emp.deptno=10 order by emp.deptno;

######################################
salf 조인
######################################

select e.ename 사원명, e.mgr, m.empno,m.ename 상사명 from emp e , emp m where e.mgr = m.empno;

select e.ename 사원명, e.mgr, m.empno,m.ename 상사명 from emp e , emp m where e.mgr = m.empno(+);

--ansi조인
select e.ename 사원명, e.mgr, m.empno,m.ename 상사명 from emp e inner join emp m on e.mgr = m.empno;

select e.ename 사원명, e.mgr, m.ename,m.ename상사명 from emp e  left outer join emp m on e.mgr = m.empno(+);

select e.ename 사원명, e.mgr, m.ename 상사명 from emp e  left outer join emp m on e.mgr = m.empno(+);

select e.ename 사원명, e.mgr, nvl(m.ename,'CEO') 상사명 from emp e  left outer join emp m on e.mgr = m.empno(+);

-- 상사보다 급여가 많은 사원 목록
select e.ename, e.sal ,dname,loc , m.ename, m.sal from emp e  left outer join emp m on e.mgr = m.empno
join dept on e.deptno = dept.deptno where e.sal > m.sal;

######################################
집계함수
######################################

select ename,round(sal) from emp;
select avg(sal) from emp;

select round(avg(sal)) 평균급여 from emp;

select count(empno), count(comm), count(*), count(mgr), round(avg(sal)) 평균급여 from emp;

select round (jab) from emp;
select round(distinct job) from emp;

select sum(sal), count(*), round(avg(sal)),sum(sal)/count(*) from emp;

select round(avg(sal)) 평균급여 from emp;
select round(avg(sal)) 평균급여 from emp where deptno = 10;
select round(avg(sal)) 평균급여 from emp where deptno = 20;
select round(avg(sal)) 평균급여 from emp where deptno = 30;
select round(avg(sal)) 평균급여 from emp where deptno = 40;

select deptno, round(avg(sal)) 평균급여 from emp group by deptno;

-- 부서 이름 별 평균 급여 구하기

select e.deptno,dname,round(avg(sal)) 평균급여 from emp e , dept d where e.deptno=d.deptno 
group by dname, e.deptno order by deptno;

select max(sal),min(sal),count(*),avg(sal) from emp;

select deptno, max(sal),min(sal),count(*),avg(sal) from emp group by deptno;

select e.deptno,dname,round(avg(sal)) 평균급여 from emp e join dept d on e.deptno=d.deptno 
group by dname, e.deptno order by deptno;

-- 부서별 평균 급여가 2000이상인 리스트

select dname, round(avg(sal)) 평균급여 from emp e , dept d where e.deptno=d.deptno group by dname
having avg(sal)>=2000;

-- FORD 보다 급여를 많이 받는 사원 리스트

select ename, sal from emp where 

select sal from emp where ename='FORD';

select * from emp where sal>(select sal from emp where ename='FORD');


-- 평균 급여보다 적게 받는 사원 목록
select ename, avg(sal) from emp where avg(sal) < ename;

select * from emp where sal<(select avg(sal) from emp);

-- 가장 작은 급여 리스트

select min(sal),ename from emp where ;

select * from emp where sal = (select min(sal) from emp);

select * from emp where sal = (select max(sal) from emp);

-- 각각의 부서에서 급여가 가장 작은 사원 리스트

select dname,ename,sal from emp e , dept d where e.deptno=d.deptno and sal in 
(select min(sal) from emp group by deptno);

###############################################################
상관관계 서브쿼리 : outer 쿼리의 컬럼중 하나가 inner 쿼리문에서 사용되는 쿼리문 
###############################################################

-- 자신이 속한 부서의 평균 급여보다 적은 사람 리스트

select * from emp outer where sal < (select avg(sal) from emp where deptno=outer.deptno);


###########
rownum
###########

select rownum, ename,sal,hiredate from emp;

select rownum, ename,sal,hiredate from emp order by sal desc;

select rownum, ename,sal,hiredate from (select * from emp order by sal desc);

select rownum, ename,sal,hiredate from (select * from emp order by sal desc)
where rownum <4;

--주의 (rownum 데이터가 만들어지면서 순차적으로 넘버가 생성 된다.)
select rownum, ename,sal,hiredate from (select * from emp order by sal desc)
where rownum >4;

select rownum, ename,sal,hiredate from (select * from emp order by sal desc)
where rownum between 1 and 4;


############################
page 처리
############################

select * from (select rownum row#,ename,sal,hiredate from(select * from emp order by sal desc))
where row# between 5 and 9;



















