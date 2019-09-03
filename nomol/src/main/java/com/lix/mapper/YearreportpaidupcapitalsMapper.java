package com.lix.mapper;

import com.lix.domain.Yearreportpaidupcapitals;
import com.lix.domain.YearreportpaidupcapitalsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearreportpaidupcapitalsMapper {
    long countByExample(YearreportpaidupcapitalsExample example);

    int deleteByExample(YearreportpaidupcapitalsExample example);

    int insert(Yearreportpaidupcapitals record);

    int insertSelective(Yearreportpaidupcapitals record);

    List<Yearreportpaidupcapitals> selectByExample(YearreportpaidupcapitalsExample example);

    int updateByExampleSelective(@Param("record") Yearreportpaidupcapitals record, @Param("example") YearreportpaidupcapitalsExample example);

    int updateByExample(@Param("record") Yearreportpaidupcapitals record, @Param("example") YearreportpaidupcapitalsExample example);
}