package com.lix.mapper;

import com.lix.domain.Yearreportwebsiteinfos;
import com.lix.domain.YearreportwebsiteinfosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearreportwebsiteinfosMapper {
    long countByExample(YearreportwebsiteinfosExample example);

    int deleteByExample(YearreportwebsiteinfosExample example);

    int insert(Yearreportwebsiteinfos record);

    int insertSelective(Yearreportwebsiteinfos record);

    List<Yearreportwebsiteinfos> selectByExample(YearreportwebsiteinfosExample example);

    int updateByExampleSelective(@Param("record") Yearreportwebsiteinfos record, @Param("example") YearreportwebsiteinfosExample example);

    int updateByExample(@Param("record") Yearreportwebsiteinfos record, @Param("example") YearreportwebsiteinfosExample example);
}