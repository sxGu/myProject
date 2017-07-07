package demo;

import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.render.JsonRender;

public class HelloController extends Controller {  
	public void index() {   
		
		List<Record> users = Db.find("select * from user_t");
		renderJson(users);
		
		render(new JsonRender(users).forIE());//ie  ≈‰
//		renderText("Hello JFinal World.");  
		} 
	} 
