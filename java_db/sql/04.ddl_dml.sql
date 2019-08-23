##################
Table 생성  DDL
##################

create table book(
	bookno 	number(5) constraint scott_book_pk primary key,
	title 	varchar2(30) constraint scott_book_title_unique unique,
	author 	varchar2(30),
	price   number(7,2) constraint book_price_check check(price>0),
	pubdate date default sysdate
);

drop table book;
create table book(
	bookno 	number(5), 
	title 	varchar2(30) unique,
	author 	varchar2(30),
	price   number(7,2)  check(price>0),
	pubdate date default sysdate
	);

alter table book add constraint pk_bookno primary key(bookno);



insert into book values (2,'jsp','홍길동',22000,sysdate);

insert into book values (3,'java','김길동',32000,default);

insert into book values (5,'','김길동',32000,default);

insert into book values(1,'java','kim',sysdate);
insert into book values(2,'jsp','홍',sysdate);
insert into book values(2,'jsp','홍',sysdate);
insert into book values(2,'jsp','홍','19/02/02');

insert into book (bookno,title) values(3,'db');	

insert into book (bookno,title,author,pubdate) values(4,'db',null,null);	

insert into book values(5,'db','','');

delete from book;

delete from book where title = 'db';
delete from book where author is null;
delete from book where author = '홍';

desc book;

alter table book add (
price number(7)
);
insert into book values (4,'db','','',900);

update book set price=10;

update book set price=900 where title='db';

update book set author='~~~~~',price=900,pubdate=sysdate where bookno=3;

update book set price=null;
alter table book modify(price number(7,2));
alter table book drop column price;

insert into book (bookno,title,author,pubdate) values (4,'db',null,null);
delete from book where author = '홍';
update book set author='~~~~~',price=900,pubdate=sysdate, where bookno=3;

delete from book; --rollback 가능

truncate table book; -- rollback 불가능

drop table book;

select* from book;
#####################
#####################

select * from emp;
select * from dept;

-- 테이블을 복사
create table emp2 as select * from emp; 
create table dept2 as select * from dept; 

insert into dept values(50,'EDU','SEOUL');
insert into dept2 values(50,'EDU','SEOUL');

insert into dept values(10,'EDU','SEOUL');
insert into dept2 values(10,'EDU','SEOUL');

insert into emp(empno,ename,hiredate,sal,deptno) values (9999,'홍길동',sysdate,0,90);

###########################################
트랜잭션
###########################################
create table emp2 as select * from emp;
select *from emp2

창1
delete from emp2 where deptno=10;

창2
update emp2 set comm=0 where deptno=10;

###########################################
emp dept
###########################################
delete from dept where deptno=50;

create table dept2 as select * from dept;
create table emp2 as select * from emp;
alter table emp2 add constraint pk_emp2 primary key(empno);

alter table dept2 add constraint pk_dept2 primary key(deptno);

alter table emp2 add constraint FK_mgr foreign key(mgr) references emp2;

alter table emp2 add constraint FK_emp2 foreign key(deptno) references dept2;

delete from dept2 where deptno=20; x

alter table emp2 drop constraint FK_emp2;
alter table emp2 add constraint FK_emp2 foreign key(deptno) references dept2 on delete set null;
alter table emp2 add constraint FK_emp2 foreign key(deptno) references dept2 on delete cascade;
delete from dept2 where deptno=20; x

delete from emp2 where deptno=20;


insert into dept2 values(50,'EDU','SEOUL');

insert into emp2(empno,ename,hiredate,sal,deptno) values (9999,'홍길동',sysdate,0,50);

insert into emp2(empno,ename,hiredate,sal,deptno) values (7777,'고길동',sysdate,0,null);

insert into emp2(empno,ename,hiredate,sal,deptno,mgr) values (8888,'이길동',sysdate,0,null,10);







