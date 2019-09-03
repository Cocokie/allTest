package com.lix.mapper;

import com.lix.domain.Yearreportsubcapitals;
import com.lix.domain.YearreportsubcapitalsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearreportsubcapitalsMapper {
    long countByExample(YearreportsubcapitalsExample example);

    int deleteByExample(YearreportsubcapitalsExample example);

    int insert(Yearreportsubcapitals record);

    int insertSelective(Yearreportsubcapitals record);

    List<Yearreportsubcapitals> selectByExample(YearreportsubcapitalsExample example);

    int updateByExampleSelective(@Param("record") Yearreportsubcapitals record, @Param("example") YearreportsubcapitalsExample example);

    int updateByExample(@Param("record") Yearreportsubcapitals record, @Param("example") YearreportsubcapitalsExample example);
}