
alter user hr identified by hr account unlock;

sqlplus hr/hr

select * from tab;

--테이블스페이스 생성
create tablespace bit
datafile 'c:\lib\bit.dbf'
size 30M
autoextend on next 2M maxsize UNLIMITED;

-- 계정 생성
create user test01 identified by 1234
default tablespace bit;

create user SCOTT identified by TIGER 
default tablespace bit;

-- 계정 권한부여
grant connect to test01;

grant connect,resource,dba to test01;

-- 계정 권한취소
revoke connect from test01;

-- 계정 삭제
drop user test01 cascade;

-- 스트립터 파일 실행
@c:\lib\scott.sql

--linesize 확인/수정
show linesize;
set linesize 300;

--pagesize 확인/수정
show pagesize;
set pagesize 20;

-- 휴지통 확인/삭제
show recyclebin;
purge recyclebin;

--tablespace 확인
select tablespace_name from dba_tablespaces;


