package Git.Scripts;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallDemo {

	public void Marshall() throws JAXBException {
		Items_Set_Get_Constr TestObj =new Items_Set_Get_Constr("A01","Temp","MDC",9);
		
		JAXBContext TestJV=JAXBContext.newInstance(Items_Set_Get_Constr.class);
		Marshaller TestMS=TestJV.createMarshaller();
		TestMS.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		TestMS.marshal(TestObj, System.out);
		TestMS.marshal(TestObj, new File("C:\\Jayati\\TestObject.xml"));
	}
}
