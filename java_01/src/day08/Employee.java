package day08;

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
public class Employee {
	static final String cName = "BIT"; // 변경 할수 없는 상수값으로 지정. 
	private String name;
	private String dept; 
	private boolean single;
	
	
	public Employee() { // 초기화 작업을 주로 한다. 
		//System.out.println("Employee() call");
		//this.name = "사원이름";
		//this.dept = "부서명";
		//this.single = false;
		this("사원이름","ooo부서",true); // this() -> 나의 또다른 생성자 함수를 호출

	}
	
	public Employee (String name, String dept, boolean single ) {
		//초기화 작업을 주로 한다.
		//System.out.printf("Employee(%s,%s,%b) call\n",name,dept,single);
		this.name = name;
		this.dept = dept;
		this.single =single; 
				
	}
	public Employee(String name, String dept) {
		//System.out.printf("Employee(%s,%s) call\n",name,dept);
		//this.name = name;
		//this.dept = dept;
		this(name,dept,false);
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
		
		System.out.println("회사명 :"+cName);
	}
	
	
	
}
