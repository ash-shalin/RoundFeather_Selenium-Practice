package prevent.windows.locking;

import java.awt.Robot;

public class PreventLocking {
	public static void main(String[] args) {
		Robot robot;
		try {
			robot = new Robot();
			while (true) {
				robot.mouseMove(500, 500);
				robot.delay(1000);
				robot.mouseMove(550, 500);
				robot.delay(60000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
