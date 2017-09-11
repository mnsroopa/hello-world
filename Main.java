import java.util.*;
public class Main {

	public static void main(String[] args)
	{

		//You may test that your code works find here
		//Please check that your code works and has no
		//compilation problems before to submit
		StudentGroup sg = new StudentGroup(5);

	  Date dt=new Date(1997,9,01);
		Student obj = new Student(21,"roopa",dt,72.02);
		 sg.addFirst(obj);
        sg.addLast(obj));
		  System.out.println(sg.getStudent(0).getId());

	}

}
