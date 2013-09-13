package org.gdarts.vaadin;

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

import com.vaadin.Application;
import com.vaadin.event.ShortcutAction;
import com.vaadin.event.ShortcutListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

/**
 * Main application class.
 */
public class Vaa6Application extends Application {

	static SqlSessionFactory sqlSessionFactory;
	static {
		String resource = "MyBatis-conf.xml";

		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();

		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		Window mainWindow = new Window("Vaa6 Application");
		Label label = new Label("");
		mainWindow.addComponent(label);
		addItems(mainWindow);

		setMainWindow(mainWindow);
	}

	private void addItems(final Window w) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			ItemsMapper mapper = session.getMapper(ItemsMapper.class);

			List<Items> list = mapper.selectByExample(new ItemsExample());
			int[] modKeys = { ShortcutAction.ModifierKey.CTRL };

			for (Items i : list) {
				Window dw = new Window();
				VerticalLayout subContent = new VerticalLayout();
				subContent.setMargin(true);
				dw.setContent(subContent);

				TextArea tArea = new TextArea();
				subContent.addComponent(tArea);
				
				Items item = mapper.selectByPrimaryKey(i.getId());
				tArea.setValue(item.getItem());
				tArea.setData(item);
				tArea.addShortcutListener(new ShortcutListener("Down",
						ShortcutAction.KeyCode.S, modKeys) {
					private static final long serialVersionUID = 6830202254084906356L;

					public void handleAction(Object sender, Object target) {
						if (target instanceof TextArea) {
							Items item = (Items) ((TextArea) target).getData();
							item.setItem(((TextArea) target).getValue()
									.toString());
							SqlSession session = sqlSessionFactory
									.openSession(true);
							try {
								ItemsMapper mapper = session
										.getMapper(ItemsMapper.class);
								mapper.updateByPrimaryKeySelective(item);
							} finally {
								session.close();
							}
							w.showNotification("Save!");
						}
					}
				});
				w.addWindow(dw);
				dw.setVisible(true);
			}
		} finally {
			session.close();
		}
	}
}
