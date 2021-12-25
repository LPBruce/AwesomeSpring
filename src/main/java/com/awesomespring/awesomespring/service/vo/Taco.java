package com.awesomespring.awesomespring.service.vo;

import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Taco {
    
    @NotNull
    private String name;
    private List<String> ingredients;
}
