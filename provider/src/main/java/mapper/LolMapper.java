package mapper;

import entity.Lol;
import org.apache.ibatis.annotations.Param;

public interface LolMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lol record);

    int insertSelective(Lol record);

    Lol selectByPrimaryKey(@Param("username") String username, @Param("password") String password);

    Lol select01(@Param("username") String username);

    int updateByPrimaryKeySelective(Lol record);

    int updateByPrimaryKey(Lol record);
}