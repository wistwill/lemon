package cloud.xiguapi.lemon.admin.mapper;

import cloud.xiguapi.lemon.admin.model.SysUser;
import cloud.xiguapi.lemon.admin.model.SysUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * author 大大大西西瓜皮🍉
 * date 00:50 2020-07-26
 * description:
 */
@Mapper
public interface SysUserMapper {
	long countByExample(SysUserExample example);

	int deleteByExample(SysUserExample example);

	int deleteByPrimaryKey(Long id);

	int insert(SysUser record);

	int insertSelective(SysUser record);

	List<SysUser> selectByExample(SysUserExample example, @Param("listItem") String listItem);

	SysUser selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example, @Param("listItem") String listItem);

	int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

	int updateByPrimaryKeySelective(SysUser record);

	int updateByPrimaryKey(SysUser record);

	List<SysUser> findAll();

	List<SysUser> findPage();

	void deleteByUserId(Long id);

	SysUser findByName(String name);
}