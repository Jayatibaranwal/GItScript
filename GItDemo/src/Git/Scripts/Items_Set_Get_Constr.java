package Git.Scripts;
import java.util.List;  

import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement  
public class Items_Set_Get_Constr {
	
	  private String empname, empid,empabc;
	  private int emplevel;
	
	
	public Items_Set_Get_Constr() {
		super();
	}  
	public Items_Set_Get_Constr(String empname, String empid,String empabc,int emplevel) {  
	    super();  
	    this.empid = empid;  
	    this.emplevel = emplevel;  
	    this.empabc = empabc;  
	}
	@XmlElement
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	@XmlElement
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	@XmlElement
	public String getEmpabc() {
		return empabc;
	}
	
	public void setEmpabc(String empabc) {
		this.empabc = empabc;
	}
	@XmlElement
	public int getEmplevel() {
		return emplevel;
	}
	public void setEmplevel(int emplevel) {
		this.emplevel = emplevel;
	}  
	 
}
