package com.zj.controller;

import com.zj.entity.ImportPer;
import com.zj.service.ClientExcelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@RestController
@RequestMapping("/zj")
public class ClientExcelController {

    private final ClientExcelService excelService;

    public ClientExcelController(ClientExcelService excelService){
        this.excelService = excelService;
    }


    @RequestMapping("/page")
    public String page(){


        return "hello";
    }

    /**
     * 导入文件
     *
     * @param file 上传的文件
     * @return Result<Boolean>
     */
    @RequestMapping("/import")
    public String importCsv(MultipartFile file) throws Exception {
        return excelService.importCsv(file);
    }

    /**
     * 获取全部导入记录
     * @return
     */
    @RequestMapping("/findAll")
    public List<ImportPer> findAll(){
        return excelService.findAll();
    }



}
