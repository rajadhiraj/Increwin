package failRun;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Runner {

	public static void main(String[] args) {
		
		TestNG runner = new TestNG();
		
		List<String> list = new ArrayList<String>();
		
		list.add("E:\\MachineTest\\Com.Increwin\\test-output\\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
	}

}
