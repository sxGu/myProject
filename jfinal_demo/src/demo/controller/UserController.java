package demo.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

import demo.User;

public class UserController extends Controller {
	public void index(){
		renderJsp("/WEB-INF/user/addPage.jsp");
	}
	public void add(){
		setAttr("userName", getPara("user_name"));
		setAttr("password",getPara("password"));
		
		
		//User user = getModel(User.class,""); getmodal获取数据
		Record user = new Record().set("user_name", getPara("user_name")).set("password", getPara("password")).set("age", getPara("age"));
		Db.save("user_t", user);
		//new User().set("user_name", getPara("userName")).set("password", getPara("password")).set("age", getPara("age")).save(); 
		renderJsp("/WEB-INF/user/afterAdd.jsp");
	}
}
