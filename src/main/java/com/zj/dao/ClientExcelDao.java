package com.zj.dao;
import com.zj.entity.ClientStudent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author : zj
 * @program : onecode
 * @description :
 * @date : 2019-12-27 09:16
 **/
@Mapper
public interface ClientExcelDao {

    List<ClientStudent> findAll();

    void save(ClientStudent student);
}
