package com.lix.mapper;

import com.lix.domain.Yearreportforguarantees;
import com.lix.domain.YearreportforguaranteesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearreportforguaranteesMapper {
    long countByExample(YearreportforguaranteesExample example);

    int deleteByExample(YearreportforguaranteesExample example);

    int insert(Yearreportforguarantees record);

    int insertSelective(Yearreportforguarantees record);

    List<Yearreportforguarantees> selectByExample(YearreportforguaranteesExample example);

    int updateByExampleSelective(@Param("record") Yearreportforguarantees record, @Param("example") YearreportforguaranteesExample example);

    int updateByExample(@Param("record") Yearreportforguarantees record, @Param("example") YearreportforguaranteesExample example);
}