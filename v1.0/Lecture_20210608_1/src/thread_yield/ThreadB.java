package thread_yield;

public class ThreadB extends Thread {
	boolean work = true; // �۾� ������ �ִ���
	boolean stop = false; // ������ ������
	 
	@Override
	public void run() {
		while(stop != true) { // !stop
			if(work) {
				System.out.println("ThreadB �۾�����");
			}
			else {
				Thread.yield(); 
				// �ٸ� �����忡�� ���� �纸
			}
		}
		
		System.out.println("ThreadB ��!");
	}
}