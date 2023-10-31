import java.util.ResourceBundle;

public class MidTerm {

	public int check(String uname,String uid) {
		ResourceBundle rv = ResourceBundle.getBundle("config");
		String name = rv.getString("name");
		String id = rv.getString("id");
		if(uname.equals(name) && uid.equals(id)) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
