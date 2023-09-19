

public class NQueen {
	
	public String NQueen(int n){
		
		LinkStack<Integer> S = new LinkStack<Integer>();
		Integer Qpos = 1;
		String qString = "";
		
		
		while(S.size() != n) {
			
			while(Qpos <= n ) {
				
				if(checkConflict(Qpos, S) == false) {
					
					S.push(Qpos);
					
					
				}
				
				else {
					Qpos++;
				}
				
			}
		
			while(S.size() != 0 && Qpos >= 1) {
			
				S.pop();
			
			}
			
			if(Qpos > n) {
				
				break;
				
			}
		
		}
		
		while(S.isEmpty() != true) {
			int loc = S.pop();
			
			for(int i = 1; i <= n; i++) {
				
				if( i == loc ) {
					
					qString = qString + "Q";
					
				}
				
				else {
					
					qString = qString + "-";
					
				}
				
			}
				
			qString = qString + "\n";
			
		}
		
		
		return qString;
	}
	
	public static boolean checkConflict(Integer Qpos, LinkStack<Integer> S ) {
		
		
		
		return true;
		
	}
	
	
}
