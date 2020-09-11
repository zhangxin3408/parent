package mapper;

import entity.Student;

import java.util.List;

public interface StudentMapper {

    int insert(Student student);
    Student selectByPrimarykey(Integer id);
    List<Student> selectByName(String name);

}
