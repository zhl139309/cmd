package com.xzjy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {
    //这里改成了String
    private Integer recordId;
    //业主姓名
    private String houseId;
    //业主电话
    private String ownerTelphone;

    //private String ownerName;
    //缴费类型
    private String recordType;
    //缴费金额
    private double recordMoney;
    //缴费时间
    private String recordDate;
}
