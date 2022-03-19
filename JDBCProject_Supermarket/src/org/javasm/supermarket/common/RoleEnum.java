package org.javasm.supermarket.common;

import lombok.Getter;

/**
 * @projectName: MyJavaStudy
 * @package: org.javasm.supermarket
 * @author: Nightmare970701
 * @description:
 * @since:
 * @version: JDK11
 * @create: 2022-03-17 10:40
 */
@Getter
public enum  RoleEnum {

    ADMIN("admin","1234") ,
    CASHIER("cashier","1234");

    private String name ;
    private String password ;

    RoleEnum(String name ,String password){
        this.name = name;
        this.password = password;
    }

}