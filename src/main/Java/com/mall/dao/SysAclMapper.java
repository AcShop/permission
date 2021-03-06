package com.mall.dao;

import com.mall.beans.PageQuery;
import com.mall.model.SysAcl;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysAclMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAcl record);

    int insertSelective(SysAcl record);

    SysAcl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAcl record);

    int updateByPrimaryKey(SysAcl record);

    int countByAclModuleId(@Param("aclModuleId") int aclModuleId);

    List<SysAcl> getPageByAclModuleId(@Param("aclModuleId") int aclModuleId,@Param("page") PageQuery page);

    int countByNameAndAclModuleId(@Param("aclModuleId") int aclModuleId,@Param("name") String name,@Param("id") Integer id);
}