package com.rhb.red.mapper;

import com.rhb.api.pojo.RedPacketRecord;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface RedRecordMapper extends Mapper<RedPacketRecord> {
}