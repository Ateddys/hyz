package com.zj.controller;

import com.zj.entity.ClientStudent;
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
     * 测试1
     * @return 集合对象
     */
    @RequestMapping("/findAll")
    public List<ClientStudent> findAll(){
        return excelService.findAll();
    }

}
