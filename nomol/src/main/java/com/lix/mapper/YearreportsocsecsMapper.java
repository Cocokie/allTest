package com.lix.mapper;

import com.lix.domain.Yearreportsocsecs;
import com.lix.domain.YearreportsocsecsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearreportsocsecsMapper {
    long countByExample(YearreportsocsecsExample example);

    int deleteByExample(YearreportsocsecsExample example);

    int insert(Yearreportsocsecs record);

    int insertSelective(Yearreportsocsecs record);

    List<Yearreportsocsecs> selectByExample(YearreportsocsecsExample example);

    int updateByExampleSelective(@Param("record") Yearreportsocsecs record, @Param("example") YearreportsocsecsExample example);

    int updateByExample(@Param("record") Yearreportsocsecs record, @Param("example") YearreportsocsecsExample example);
}