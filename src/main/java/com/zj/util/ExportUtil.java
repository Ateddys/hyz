package com.zj.util;

import com.zj.entity.ImportPer;
import org.apache.commons.lang.StringUtils;

/**
 * @author : zj
 * @program : onecode
 * @description : 映射实体
 * @date : 2019-12-27 09:00
 **/
public class ExportUtil {

    /**
     * 数据过滤
     *
     * @param pills 读取到的文本行
     * @return ClientStoreInfo
     */
    public static ImportPer getfilter(String pills){

       // ClientStudent student = new ClientStudent();

        ImportPer importPer = new ImportPer();

        String[] split = pills.split(",");


        if (StringUtils.isNotBlank(split[1])){

            importPer.setRoles(split[1]);
        }

        if (StringUtils.isNotBlank(split[2])){

            importPer.setName(split[2]);

        }

        if (StringUtils.isNotBlank(split[3])){

            importPer.setAccount(split[3]);

        }

        if (StringUtils.isNotBlank(split[4])){

            importPer.setOndate(split[4]);

        }

        if (StringUtils.isNotBlank(split[5])){

            importPer.setOffdate(split[5]);

        }


        return importPer;
    }
}
