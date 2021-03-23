package com.alilbaba.dto;

import com.alilbaba.dto.data.CustomerDTO;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
public class CustomerAddCmd{
    @NotNull
    private String cmdId;
    @Valid
    private CustomerDTO customerDTO;

}
