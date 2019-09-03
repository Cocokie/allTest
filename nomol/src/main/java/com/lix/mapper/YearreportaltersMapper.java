package com.lix.mapper;

import com.lix.domain.Yearreportalters;
import com.lix.domain.YearreportaltersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearreportaltersMapper {
    long countByExample(YearreportaltersExample example);

    int deleteByExample(YearreportaltersExample example);

    int insert(Yearreportalters record);

    int insertSelective(Yearreportalters record);

    List<Yearreportalters> selectByExample(YearreportaltersExample example);

    int updateByExampleSelective(@Param("record") Yearreportalters record, @Param("example") YearreportaltersExample example);

    int updateByExample(@Param("record") Yearreportalters record, @Param("example") YearreportaltersExample example);
}