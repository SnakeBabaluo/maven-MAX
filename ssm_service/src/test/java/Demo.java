import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 创建日期:  2020/10/18
 * 创建时间:  21:23
 */
public class Demo {

	@Test
	public void test(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("aa.xml");
		ItemsService itemsService = (ItemsService)applicationContext.getBean("itemsServiceImpl");
		System.out.println(itemsService.findAll());
	}

}

