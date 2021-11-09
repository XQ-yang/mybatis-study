package com.mybatis.pojo;

import java.util.List;

/**
 * @author: 小强
 * @date: 2021/11/9 0009
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public class Banji {
    private Integer id;
    private String name;
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

    public List<Student2> getStudent2List() {
        return student2List;
    }

    public void setStudent2List(List<Student2> student2List) {
        this.student2List = student2List;
    }

    @Override
    public String toString() {
        return "Banji{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student2List=" + student2List +
                '}';
    }
}
