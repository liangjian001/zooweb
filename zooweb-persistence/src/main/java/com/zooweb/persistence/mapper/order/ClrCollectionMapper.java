package com.zooweb.persistence.mapper.order;

import com.zooweb.modle.entities.order.ClrCollection;
import com.zooweb.modle.entities.order.ClrCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClrCollectionMapper {
    int countByExample(ClrCollectionExample example);

    int deleteByExample(ClrCollectionExample example);

    int deleteByPrimaryKey(String id);

    int insert(ClrCollection record);

    int insertSelective(ClrCollection record);

    List<ClrCollection> selectByExample(ClrCollectionExample example);

    ClrCollection selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ClrCollection record, @Param("example") ClrCollectionExample example);

    int updateByExample(@Param("record") ClrCollection record, @Param("example") ClrCollectionExample example);

    int updateByPrimaryKeySelective(ClrCollection record);

    int updateByPrimaryKey(ClrCollection record);
}