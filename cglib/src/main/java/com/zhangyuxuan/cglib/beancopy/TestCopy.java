package com.zhangyuxuan.cglib.beancopy;

import net.sf.cglib.beans.BeanCopier;

/**
 * @description: BeanCopier的效率比其他的方式都非常高，但是基于标准的get和set方法，如果get和set写的不标准，相应的属性就会copy失败
 * @author: zhangyuxuan
 * @date: 2021/9/26 上午6:50 周日
 */
public class TestCopy {
    public static void main(String[] args) {
        User user = new User();
        user.setId("1");
        user.setName("2");
        user.setSex("nv");
        Person person = new Person();
        BeanCopier beanCopier = BeanCopier.create(User.class, Person.class, false);
        beanCopier.copy(user, person, null);
        System.out.println(user);
        System.out.println(person);
        Teacher teacher = new Teacher();
        BeanCopier beanCopier1 = BeanCopier.create(User.class, Teacher.class, false);
        beanCopier1.copy(user, teacher, (Object value, Class target, Object context) -> {
            return null;
        });
        System.out.println(teacher);
    }
}
