package day07;

public class Employee {
/**
 * 
 * 
 *  @author kmw
 *  @since 2019년 7월 16일
 *  @version 1.0
 * 
 * 
 * 
 */
	private String name;
	private String dept; 
	private boolean single;
	
	public Employee ( ) {
		//초기화 작업을 주로 한다.
		System.out.println("Employee() call");
		name = "사원이름";
		dept = "ooo 부서";
		single =true; 
				
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public boolean isSingle() {
		return single;
	}
	/**
	 * 
	 * @param single 미혼인지?
	 */
	public void setSingle(boolean single) {
		this.single = single;
	}
	/**
	 * Employee 정보 출력
	 * 
	 */
	public void print() {
		System.out.printf("[사원명 :%s 근무부서 :%s single :%b]\n",name,dept,single);
	}
	
	
	
}
