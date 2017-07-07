package demo; 
import com.jfinal.config.*;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;

import demo.controller.UserController; 
public class DemoConfig extends JFinalConfig {  
	public void configConstant(Constants me) {   
		me.setDevMode(true);  //jfinal运行在开发环境
		}  
	public void configRoute(Routes me) {   
		me.add("/hello", HelloController.class); 
		me.add("/user",UserController.class);//路由配置
		}  
	public void configEngine(Engine me) {}  
	//数据库相关
	public void configPlugin(Plugins me) {
		//文件配置db
	    PropKit.use("/resource/db.properties");
		//url ,用户名, 密码
		DruidPlugin dp = new DruidPlugin(PropKit.get("url"),PropKit.get("username"),PropKit.get("password"));
		 me.add(dp);  
		 ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);  
		 me.add(arp); 
		 
		 //表名,主键（为id可省略第二个参数),实体类
		 arp.addMapping("user_t", "id", User.class); //映射实体关系
		
	}  
	public void configInterceptor(Interceptors me) {}  
	public void configHandler(Handlers me) {} 
}