import java.util.Scanner;
class student{
	static String name;
	static int m1, m2, m3, m4, m5;
	student(String n, int s1, int s2, int s3, int s4, int s5){
		name = n;
		m1 = s1;
		m2 = s2;
		m3 = s3;
		m4 = s4;
		m5 = s5;
	}
	static int totmarks(){
		int totm;
		totm = m1+m2+m3+m4+m5;
		return totm;
	}
	public static void main(String args[]){
		int i, j, highest =0;
		int marks[] = new int[5];
		String topper_name = "";
		Scanner sc = new Scanner(System.in);
		student s[] = new student[10];
		for(i=0; i<10; i++)
		{
			System.out.println("Enter the name of student " + (i+1));
			String stud_name;
			stud_name = sc.next();
			System.out.println("Enter the marks of student " + (i+1));
			for(j=0; j<5; j++)
			{
				marks[j] = sc.nextInt();
			}
			s[i] = new student(stud_name, marks[0], marks[1], marks[2], marks[3], marks[4]);
			System.out.println("Total marks= " + totmarks());
			if(totmarks()>highest)
			{
				highest = totmarks();
				topper_name = stud_name;
			}
		}
        System.out.println("The topper is: "+ topper_name);
	}
}