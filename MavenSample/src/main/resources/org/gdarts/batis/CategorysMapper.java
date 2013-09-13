package org.gdarts.batis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.gdarts.batis.Categorys;
import org.gdarts.batis.CategorysExample;

public interface CategorysMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table categorys
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int countByExample(CategorysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table categorys
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int deleteByExample(CategorysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table categorys
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table categorys
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int insert(Categorys record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table categorys
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int insertSelective(Categorys record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table categorys
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	List<Categorys> selectByExample(CategorysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table categorys
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	Categorys selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table categorys
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int updateByExampleSelective(@Param("record") Categorys record,
			@Param("example") CategorysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table categorys
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int updateByExample(@Param("record") Categorys record,
			@Param("example") CategorysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table categorys
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int updateByPrimaryKeySelective(Categorys record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table categorys
	 * 
	 * @mbggenerated Tue Sep 10 14:29:47 JST 2013
	 */
	int updateByPrimaryKey(Categorys record);
}