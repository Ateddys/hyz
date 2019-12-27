package com.zj.service;

import com.zj.entity.ClientStudent;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author : hyz
 * @program : onecode
 * @description :
 * @date : 2019-12-27 10:46
 **/
public interface ClientExcelService {

    String importCsv(MultipartFile file) throws Exception;

    List<ClientStudent> findAll();
}
