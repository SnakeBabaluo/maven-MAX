import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * 创建日期:  2020/10/18
 * 创建时间:  21:00
 */
public class demo {
	@Test
	public void ff(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring_mybatis.xml");
		ItemsDao itemsDao = (ItemsDao)applicationContext.getBean("itemsDao");
		System.out.println("商品列表：：："+itemsDao.findAll());

		Items items = new Items();
		items.setName("商品名称");
		items.setPrice(16666f);
		items.setCreatetime(new Date());
		itemsDao.save(items);


	}


}
