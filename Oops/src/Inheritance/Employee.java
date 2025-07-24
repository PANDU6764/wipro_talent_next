package Inheritance;

	public class Employee extends Person {
		private double Annual_salary;
		private int join_year;
		private String National_Insurance_number;

		public Employee(String name,double Annual_salary,int join_year,String National_Insurance_number) {
			super(name);
			this.Annual_salary=Annual_salary;
			this.join_year=join_year;
			this.National_Insurance_number=National_Insurance_number;	
		}


		public double getAnnual_salary() {
			return Annual_salary;
		}

		public void setAnnual_salary(double annual_salary) {
			Annual_salary = annual_salary;
		}

		public int getJoin_date() {
			return join_year;
		}

		public void setJoin_date(int join_year) {
			this.join_year = join_year;
		}

		public String getNational_Insurance_number() {
			return National_Insurance_number;
		}

		public void setNational_Insurance_number(String national_Insurance_number) {
			National_Insurance_number = national_Insurance_number;
		}
		public String toString() {
			return 	"Name:"+getName()+"\n"
					+"Annual_salary:Rs."+Annual_salary+"\n"
					+"join_year:"+join_year+"\n"
					+"National_Insurance_number:"+National_Insurance_number;
					
		}

}