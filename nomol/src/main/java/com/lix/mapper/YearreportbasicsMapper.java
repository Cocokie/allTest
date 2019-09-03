package com.lix.mapper;

import com.lix.domain.Yearreportbasics;
import com.lix.domain.YearreportbasicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearreportbasicsMapper {
    long countByExample(YearreportbasicsExample example);

    int deleteByExample(YearreportbasicsExample example);

    int insert(Yearreportbasics record);

    int insertSelective(Yearreportbasics record);

    List<Yearreportbasics> selectByExample(YearreportbasicsExample example);

    int updateByExampleSelective(@Param("record") Yearreportbasics record, @Param("example") YearreportbasicsExample example);

    int updateByExample(@Param("record") Yearreportbasics record, @Param("example") YearreportbasicsExample example);
}