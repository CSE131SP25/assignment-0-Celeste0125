
package support.assignment0;


import assignment0.RobotInstructions;

public class RobotThread extends Thread {
	
	final private RobotMotionAdapter motion;
	final private RobotInstructions instr;
	public RobotThread(RobotMotionAdapter r, RobotInstructions instr) {
		this.motion = r;
		this.instr = instr;
	}
	
	public void run(){
		try {
			instr.act(motion);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}





