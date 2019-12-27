package com.zj.service;

import com.zj.dao.ClientExcelDao;
import com.zj.entity.ClientStudent;
import com.zj.util.ReadExcel;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author : hyz
 * @program : onecode
 * @description : 业务层
 * @date : 2019-12-27 08:41
 **/
@Service
public class ClientExcelServiceImpl implements ClientExcelService {

    private ClientExcelDao excelDao;

    public ClientExcelServiceImpl(ClientExcelDao excelDao) {
        this.excelDao = excelDao;
    }

    /**
     * 读取文件，数据处理，转换实体，添加到数据库
     *
     * @param file
     * @return true
     * @throws IOException
     */
    public String importCsv(MultipartFile file) throws Exception {

        long startTime = System.currentTimeMillis();   //获取开始时间

        String result = "";

        ReadExcel readExcel = new ReadExcel();  //创建处理EXCEL的类

        List<Map<String, Object>> userList = readExcel.getExcelInfo(file);  //解析excel，获取上传的事件单

        //至此已经将excel中的数据转换到list里面了,接下来就可以操作list,可以进行保存到数据库,或者其他操作,

        new Thread(() -> {
            for (Map<String, Object> user : userList) {
                excelDao.save(user.get("name").toString(), Integer.parseInt(user.get("age").toString()), user.get("arre").toString());
            }
        }).start();

        if (userList != null && !userList.isEmpty()) {

            result = "上传成功";

        } else {

            result = "上传失败";

        }

        long endTime = System.currentTimeMillis(); //获取结束时间

        System.out.println(result+"------> 共： " + (endTime - startTime) + "ms");
        return result+"------> 共： " + (endTime - startTime) + "ms";
    }

    /**
     * 测试1
     *
     * @return 集合对象
     */
    public List<ClientStudent> findAll() {
        return excelDao.findAll();
    }
}
