package jp.co.internouce.easylogin.model.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internouce.easylogin.model.domain.MstUser;

@Mapper
public interface MstUserMapper {

	@Select("SELECT * FROM mst_user WHERE user_name= #{userName} AND password = #{password}")
	MstUser findByUserNameAndPassword( String userName, String password );
}
