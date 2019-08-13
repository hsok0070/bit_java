package day19;

	class Employee implements Comparable<Employee> { //implements Comparable<Employee>
		int number;
		String name;
		String dept;
		
		public Employee() {}
		
		public Employee(int number, String name, String dept) {
			this.number = number;
			this.name = name;
			this.dept = dept;
		}

		@Override
		public String toString() {
			return "Employee [number=" + number + ", name=" + name + ", dept=" + dept + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + number;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (number != other.number)
				return false;
			return true;
		}
		@Override
	    public int compareTo(Employee o) {
			return number - o.number;
		}


		
		
	}

