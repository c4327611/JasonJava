package tw.org.iii.classroom;

public class hello19 {

	public static void main(String[] args) {
		// 20160820 hello17-2 
		
//		int[] p = new int[6];
//		for (int i=0; i<100; i++){
//		int point = (int) (Math.random()*6); // 0~5
//		p[point]++;
//		}
//		for (int i=0; i<p.length; i++){
//		System.out.println((i+1) + ":" + p[i]);
//}
		int[] p =new int[9];
		for (int i=0; i<100; i++){
			int point = (int) (Math.random()*9);
			p[point]++;	
		}
		for (int i=0; i<p.length; i++){
				System.out.println((i+1) + ":" + p[i]);
				
			}
			
			
			
			
		}
}
}