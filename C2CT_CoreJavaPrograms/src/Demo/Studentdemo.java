package Demo;

public class Studentdemo {

	public static void main(String[] args) {
		Student st = new Student();
		st.setId(101);
		st.setName("Jeeva");
		st.setAge(20);
		
		System.out.println(st);
		
		Student st1 = new Student();
		st1.setId(102);
		st1.setName("Hamal");
		st1.setAge(20);
		
		System.out.println(st1);
		
	}

}
