package com.mybatis.pojo;

/**
 * @author: 小强
 * @date: 2021/11/9 0009
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public class StudentIdCard {
    private Integer id;
    private String code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "StudentIdCard{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
