package com.mybatis.pojo;

import java.util.List;

/**
 * @author: 小强
 * @date: 2021/11/9 0009
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public class Course {
    private Integer id;
    private String name;
    private String code;
    private List<Student2> student2List;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Student2> getStudent2List() {
        return student2List;
    }

    public void setStudent2List(List<Student2> student2List) {
        this.student2List = student2List;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", student2List=" + student2List +
                '}';
    }
}
