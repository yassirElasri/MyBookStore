package metier;

import java.util.Map;

public interface FormValidator {
	String getValidationMsg();
	Map<String,String> getErrors();
	 void putErrors(String field,String error);
	 void putValidationMsg(String Msg);
	  
	 
	

}
