##################
p231 view 권한 체크
##################

뷰란?
- 뷰는 하나의 가상 테이블이라 생각 하면 된다.
- 뷰는 실제 데이터가 저장 되는 것은 아니지만 뷰를 통해 데이터를 관리 할 수 있다.
- 뷰는 복잡합 Query를 통해 얻을 수 있는 결과를 간단한 Qurey로 얻을 수 있게 한다.
- 한개의 뷰로 여러 테이블에 대한 데이터를 검색 할 수 있다.
- 특정 평가 기준에 따른 사용자 별로 다른 데이터를 엑세스할 수 있도록 한다.



select ename,d.deptno,dname,loc from emp e,dept d where e.deptno = d.deptno;

conn system/1234
grant dba to SCOTT;
conn SCOTT/TIGER

create or replace view emp_dept as
select ename,d.deptno,dname,loc from emp e,dept d where e.deptno = d.deptno;

drop view emp_dept;

select user from dual;

--자기가 속한 부서의 평균 급여보다 많이 받는 사람들의 명단을 view로 만드세요.

create or replace view highsalavg as 
select dname,ename,sal from emp e , dept d where sal > 
(select avg(sal) from emp where e.deptno=d.deptno);


##########################################################
sequence 오라클에서만 사용 가능 표준이 아니다.
##########################################################

delete from dept2;
select * from dept2;
select * from emp2;

create sequence deptno_seq;

insert into dept2 (deptno,dname,loc) values(deptno_seq.nextval,'인사부','비트');

select deptno_seq.currval from dual;





create sequence deptno_seq start with 10 increment by 10;
insert into dept2 (deptno,dname,loc) values(deptno_seq.nextval,'인사부','비트');

delete from dept2;
insert into dept2 (deptno,dname,loc) values((select nvl(max(deptno),0)+10 from dept2),'인사부','비트');

########################################
index
########################################

select * from emp;
select * from dept;

set autotrace on;



select * from emp where empno = 7698; //index 기반
select * from emp where ename = 'FORD'; // full scan


create index emp_ename_idx on emp(ename);

drop index emp_ename_idx;

select index_name,table_name from user_indexes;
