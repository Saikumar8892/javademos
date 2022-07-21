package assistedproject3;

public class Synchronization {

	public static void main(String[] args) {
		Board board=new Board();
		TeacherThread t1=new TeacherThread(board);
		StudentThread s1=new StudentThread(board);
		
		t1.start();
		s1.start();
	}
}

class TeacherThread extends Thread{
	Board board;
	String teachernames[]={"Mr Rk", "Mr Bipin", "Miss Komal"};
	TeacherThread(Board board){
		this.board=board;
	}
	
	public void run(){
		board.print(teachernames);
	}
}

class StudentThread extends Thread{
	Board board;
	String studentnames[]={"sai", "venkat", "kumar", "ulli"};
	StudentThread(Board board){
		this.board=board;
	}
	
	public void run(){
		board.print(studentnames);
	}
}

class Board{
	
	synchronized void print(String arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
