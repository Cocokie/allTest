package com.lix.mapper;

import com.lix.domain.Yearreportforinvs;
import com.lix.domain.YearreportforinvsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearreportforinvsMapper {
    long countByExample(YearreportforinvsExample example);

    int deleteByExample(YearreportforinvsExample example);

    int insert(Yearreportforinvs record);

    int insertSelective(Yearreportforinvs record);

    List<Yearreportforinvs> selectByExample(YearreportforinvsExample example);

    int updateByExampleSelective(@Param("record") Yearreportforinvs record, @Param("example") YearreportforinvsExample example);

    int updateByExample(@Param("record") Yearreportforinvs record, @Param("example") YearreportforinvsExample example);
}