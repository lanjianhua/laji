package itheima.dao;

import itheima.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemsDao1 {
    @Select("select * from items")
    public List<Items> findAll();

    @Select("select * from items where id=#{id}")
    public Items findById(Integer id);
}
