package com.lix.mapper;

import com.lix.domain.Yearreportalterstocks;
import com.lix.domain.YearreportalterstocksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearreportalterstocksMapper {
    long countByExample(YearreportalterstocksExample example);

    int deleteByExample(YearreportalterstocksExample example);

    int insert(Yearreportalterstocks record);

    int insertSelective(Yearreportalterstocks record);

    List<Yearreportalterstocks> selectByExample(YearreportalterstocksExample example);

    int updateByExampleSelective(@Param("record") Yearreportalterstocks record, @Param("example") YearreportalterstocksExample example);

    int updateByExample(@Param("record") Yearreportalterstocks record, @Param("example") YearreportalterstocksExample example);
}