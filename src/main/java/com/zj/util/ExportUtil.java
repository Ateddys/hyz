package com.zj.util;

import com.zj.entity.ClientStudent;
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
    public static ClientStudent getfilter(String pills){

        ClientStudent student = new ClientStudent();

        String[] split = pills.split(",");

        if (StringUtils.isNotBlank(split[0])){

            student.setId(Integer.valueOf(split[0]));
        }

        if (StringUtils.isNotBlank(split[1])){

            student.setName(split[1]);

        }

        if (StringUtils.isNotBlank(split[2])){

            student.setAge(Integer.valueOf(split[2]));

        }

        if (StringUtils.isNotBlank(split[3])){

            student.setArre(split[3]);

        }

        return student;
    }
}
