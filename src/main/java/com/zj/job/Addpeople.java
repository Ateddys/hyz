package com.zj.job;

import com.zj.entity.ImportPer;
import com.zj.service.ClientExcelService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Addpeople {

    private final ClientExcelService excelService;


    public Addpeople(ClientExcelService excelService) {
        this.excelService = excelService;
    }

    //加人
    public void addpeople(){
        long currentTime = System.currentTimeMillis() + 90 * 60 * 1000;
        Date date = new Date(currentTime);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = df.format(date);
        List<ImportPer> list = excelService.getListByondate(format);
        //加入群组，修改状态 type=1
    }


    //减人
    public void delpeople(){

        long currentTime = System.currentTimeMillis() - 130 * 60 * 1000;
        Date date = new Date(currentTime);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = df.format(date);
        //获取交班时间小于
        List<ImportPer> list = excelService.getListByoffdate(format);
    }

}
