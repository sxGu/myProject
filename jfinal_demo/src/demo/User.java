package demo;

import com.jfinal.plugin.activerecord.Model;

public class User extends Model<User>{
	public static User dao = new User().dao();
}
