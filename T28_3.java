package objectClass;

public class T28_3 {
	String name;
	int rollNo;

	T28_3(String name, int rollNO) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public boolean equals(Object obj) {
		try {
		String name1 = this.name;
		int rollNo1 = this.rollNo;
		T28_3 r = (T28_3) obj;
		String name2 = r.name;
		int rollNo2 = r.rollNo;

		if (name1.equals(name2) && rollNo1 == rollNo2) {

			return true;
		} else {

			return false;
		}
		}catch(ClassCastException e) {
			e.printStackTrace();
			return false;
		}catch(NullPointerException e) {
			e.printStackTrace();
			return false;
		}

	}

	public static void main(String[] args) {

		T28_3 t1 = new T28_3("Ritesh", 101);

		T28_3 t2 = new T28_3("Vivek", 102);

		T28_3 t3 = new T28_3("Ritesh", 101);

		T28_3 t4 = t1;
		System.out.println(t1.equals(t2));// false
		System.out.println(t1.equals(t3));// false
		System.out.println(t1.equals(t4));// true

	}

}