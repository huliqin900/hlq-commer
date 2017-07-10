package com.commer.app.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.commer.app.entity.User;

@Component
public interface UserMapper {
	
	int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    //根据用户id获取用户信息
    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	List<Map<String, Object>> studentsCourseSelection(long courseId);
	
	/**
	 * 根据学号查询该用户是否存在
	 * @author bota
	 * @param userNumber
	 * @return
	 */
	public String selectUserByUserNumber(long userNumber);
	
	/**
	 * 验证登录信息
	 * @author bota
	 * @param usernumber 学号或工号
	 * @param password 密码
	 * @param identity 身份
	 * @return
	 */
	public Map<String, Object> verifyByUser(long userNumber, String password, int identity);

	/**
	 * 修改密码
	 * @param id 用户id
	 * @param password 新密码
	 * @return
	 */
	boolean updatePwd(long id, String password);
	
	
	
	/**
	 * 查询所有的用户
	 * @return
	 */
	List<Map<String, Object>> selectAllUser();
	
	/**
	 * 分页查询所有的用户
	 * @return
	 */
	Map<String, Object> selectAllUser(int pageNum,int pageSize,String whereSql);
	
	/**
	 * 批量删除用户
	 * @param ids
	 * @return
	 */
	boolean deleteByPrimaryKeys(String ids);

	/**
	 * 查询用户的数量
	 * @return 
	 */
	Map<String, Object> selectUserNumber();

	/**
	 *根据用户角色获取该角色的所有的用户
	 * @param identity
	 * @return
	 */
	List<Map<String, Object>> selectAllUserByIdentity(int identity);

	/**
	 * 老师根据条件查询学生列表
	 * @param pageNum 第几页
	 * @param pageSize 每页数量
	 * @param whereSql where条件
	 * @return
	 */
	Map<String, Object> selectUserByTeacher(int pageNum, int pageSize, String whereSql);

	/**
	 * @param pageNum 第几页
	 * @param pageSize 每页数量
	 * @param whereSql where条件
	 * @return
	 */
	Map<String, Object> selectAllStudent(int pageNum, int pageSize, String whereSql);

	/**
	 * 根据学号查询用户
	 * @param userNumber
	 * @return
	 */
	Map<String, Object> selectOneByUserNumber(long userNumber);

	/**
	 * 根据id修改学分
	 * @param id
	 * @param credit
	 * @return
	 */
	boolean updateCreditById(long id, int credit);
}
