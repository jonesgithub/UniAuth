package com.dianrong.common.uniauth.server.data.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.dianrong.common.uniauth.server.data.entity.User;
import com.dianrong.common.uniauth.server.data.entity.UserExample;
import com.dianrong.common.uniauth.server.data.entity.ext.UserExt;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * user
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * user
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * user
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * user
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * user
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * user
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * user
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * user
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * user
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * user
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * user
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int updateByPrimaryKey(User record);

    List<User> getGroupOwners(Integer groupId);

    // userId + email + groupId
    List<UserExt> getUsersByParentGrpIdByUserType(Map params);

    List<User> selectByEmailOrPhone(Map<String, String> map);

    List<User> getUsersByGroupCodeRoleIds(Map<String, Object> param);
}
