package com.zj.service;

import com.zj.entity.ImportPer;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author : zj
 * @program : onecode
 * @description :
 * @date : 2019-12-27 10:46
 **/
public interface ClientExcelService {

    String importCsv(MultipartFile file) throws Exception;


    List<ImportPer> getListByondate(String format);

    List<ImportPer> getListByoffdate(String format);
}
