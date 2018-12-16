package com.tt.springruan3.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/** @作者：GG
*   @时间：2018/11/3 9:41
*   @描述：
*/
public class Student {
    private Integer studentNo;
    private String studentName;
    private String loginPwd;
    //使用Jackson格式化日期
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private Date riqi;

    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public Student() {
    }

    public Student(Integer studentNo, String studentName, String loginPwd) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.loginPwd = loginPwd;
    }
}
