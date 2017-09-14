package online.shixun.test;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateTest01 {
	public static void main(String[] args) {

		// 获取配置文件
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		// 注册服务对象
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ServiceRegistry serviceRegistry = ssrb.applySettings(configuration.getProperties()).build();
		// 获取sessionfactory
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		// 二级缓存
		sessionFactory.close();
	}
}
