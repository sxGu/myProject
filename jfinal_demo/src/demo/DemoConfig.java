package demo; 
import com.jfinal.config.*;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;

import demo.controller.UserController; 
public class DemoConfig extends JFinalConfig {  
	public void configConstant(Constants me) {   
		me.setDevMode(true);  //jfinal�����ڿ�������
		}  
	public void configRoute(Routes me) {   
		me.add("/hello", HelloController.class); 
		me.add("/user",UserController.class);//·������
		}  
	public void configEngine(Engine me) {}  
	//���ݿ����
	public void configPlugin(Plugins me) {
		//�ļ�����db
	    PropKit.use("/resource/db.properties");
		//url ,�û���, ����
		DruidPlugin dp = new DruidPlugin(PropKit.get("url"),PropKit.get("username"),PropKit.get("password"));
		 me.add(dp);  
		 ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);  
		 me.add(arp); 
		 
		 //����,������Ϊid��ʡ�Եڶ�������),ʵ����
		 arp.addMapping("user_t", "id", User.class); //ӳ��ʵ���ϵ
		
	}  
	public void configInterceptor(Interceptors me) {}  
	public void configHandler(Handlers me) {} 
}