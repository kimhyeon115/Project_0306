package Package_5;
import java.io.IOException;
public class SchedulerTest {

	public static void main(String[] args)	throws IOException {
		// R, L, P
		System.out.println("전화 상담 배분방식을 선택하세요. R, L, P");
		int ch = System.in.read();									//Scanner 같은 기능이지만  한글자만 (문자타입 1개) 사용가능
		Scheduler scheduler = null;
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'H' || ch =='l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원하지 않는 기능입니다");
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
