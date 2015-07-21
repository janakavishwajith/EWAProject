/**
 * 
 */
package ucsc.ewa.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author User
 *
 */
@WebService(name = "SampleService", targetNamespace = "http://service.ucsc.ewa")
public class SampleService {

	@WebMethod
	public List<String> getUser( String userName, String password )
	{
		List<String> testList = new ArrayList<String>();
		testList.add("test1");
		testList.add("test12");
		testList.add("test123");
		testList.add("test1234");
		testList.add("test12345");
		
		return testList;
	}
}
