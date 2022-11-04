package com.mediastep.beecow.common.dto;

import lombok.Data;

@Data
public class DistrictDTO {

    private Long id;

    private String code;

    private String inCountry;

    private String outCountry;
    
    private String zone;
    
    private Long cityId;
}
