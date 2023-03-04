package com.mei.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mql
 * @date 2023年01月29日 10:35
 */
//@Alias("user")
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;

}
