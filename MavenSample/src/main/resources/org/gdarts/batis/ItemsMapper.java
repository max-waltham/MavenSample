package org.gdarts.batis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.gdarts.batis.Items;
import org.gdarts.batis.ItemsExample;

public interface ItemsMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table items
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int countByExample(ItemsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table items
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int deleteByExample(ItemsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table items
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table items
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int insert(Items record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table items
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int insertSelective(Items record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table items
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	List<Items> selectByExampleWithBLOBs(ItemsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table items
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	List<Items> selectByExample(ItemsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table items
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	Items selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table items
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int updateByExampleSelective(@Param("record") Items record,
			@Param("example") ItemsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table items
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int updateByExampleWithBLOBs(@Param("record") Items record,
			@Param("example") ItemsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table items
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int updateByExample(@Param("record") Items record,
			@Param("example") ItemsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table items
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int updateByPrimaryKeySelective(Items record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table items
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int updateByPrimaryKeyWithBLOBs(Items record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table items
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int updateByPrimaryKey(Items record);
}