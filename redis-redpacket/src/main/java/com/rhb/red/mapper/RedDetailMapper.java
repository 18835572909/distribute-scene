package com.rhb.red.mapper;

import com.rhb.api.pojo.RedPacketDetail;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface RedDetailMapper extends Mapper<RedPacketDetail> {

}