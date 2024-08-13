package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHFB4E3R extends BaseModel {


//    private String zipCode;
    private Integer srsCount;
    private String category;

    public KHFB4E3R(){

    }

    @Override
    public void setProperties(String[] values) {
  //      this.zipCode = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.category = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.srsCount = values.length>=2?(StringUtils.isEmpty(values[1])) ? 0 : Integer.parseInt(values[1]):0;
    }
}
