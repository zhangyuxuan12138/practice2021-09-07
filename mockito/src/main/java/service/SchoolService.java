package service;

import po.Student;
import po.Teacher;

import java.util.List;

/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2021/10/4 下午7:35 周一
 */
public interface SchoolService {
    void havingClass(Teacher teacher, Student student);
    void exam(List<Student> studentList);
}
