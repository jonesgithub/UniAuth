package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.Stakeholder;
import com.dianrong.common.uniauth.server.data.entity.StakeholderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StakeholderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stakeholder
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int countByExample(StakeholderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stakeholder
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int deleteByExample(StakeholderExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * stakeholder
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stakeholder
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int insert(Stakeholder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stakeholder
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int insertSelective(Stakeholder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stakeholder
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    List<Stakeholder> selectByExample(StakeholderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stakeholder
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    Stakeholder selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stakeholder
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int updateByExampleSelective(@Param("record") Stakeholder record, @Param("example") StakeholderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stakeholder
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int updateByExample(@Param("record") Stakeholder record, @Param("example") StakeholderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stakeholder
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int updateByPrimaryKeySelective(Stakeholder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stakeholder
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int updateByPrimaryKey(Stakeholder record);
}