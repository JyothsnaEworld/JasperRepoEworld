package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KQ42035 extends BaseModel {

	private String begDateTxt;
	private String endDateTxt;
	private Integer numOfChildren;

    public KQ42035() {
    }

    @Override
    public void setProperties(String[] values) {
        this.begDateTxt = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.endDateTxt = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : values[1]:"";
        this.numOfChildren = values.length>=3?(StringUtils.isEmpty(values[2])) ? 0 : Integer.parseInt(values[2]):0;
    }
}
