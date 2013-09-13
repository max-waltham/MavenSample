package org.gdarts.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.gdarts.batis.Items;
import org.gdarts.batis.ItemsExample;
import org.gdarts.batis.ItemsMapper;

public class Main {

	
	public static void main(String[] args) throws IOException {
		String resource = "mybatis-conf.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);

		SqlSession session = sqlSessionFactory
				.openSession(/* autoCommit */true);
		try {

			ItemsMapper mapper = session.getMapper(ItemsMapper.class);
			Items item = new Items();
			item.setItem("aaaあああ");
			// mapper.insert(item);
			List<Items> list = mapper.selectByExample(new ItemsExample());
			
			for (Items i : list) {
				System.out.println(mapper.selectByPrimaryKey(i.getId()).getItem());
				
			}
			
			int count = mapper.countByExample(new ItemsExample());
			System.out.println(count);
			session.close();
		} finally {
			session.close();
		}
	}
}
