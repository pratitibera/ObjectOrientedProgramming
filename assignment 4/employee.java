import java.util.Scanner;
class employee{
	int work_time, over_time;
	employee(int w_time, int o_time){
		this.work_time = w_time;
		this.over_time = o_time;
	}
	void calculate_pay() {
		System.out.println("General pay= "+ (work_time*150));
		System.out.println("Overtime pay= "+ (over_time*250));
	}
	static void OvertimeCalculator(){
		System.out.println("General pay of an employee = General work hours x 150");
		System.out.println("Overtime pay of an employee = Overtime hours x 250");
	}
	public static void main(String args[]){
		int i, w_time, o_time;
		Scanner sc = new Scanner(System.in);
		OvertimeCalculator();
		employee emp[] = new employee[3];
		for(i=0; i<3;i++){
			System.out.println("Enter general work hours of employee "+ (i+1));
			w_time = sc.nextInt();
			System.out.println("Enter overtime work hours of employee "+ (i+1));
			o_time = sc.nextInt();
			emp[i] = new employee(w_time,o_time);
			emp[i].calculate_pay();
		}
	}
}