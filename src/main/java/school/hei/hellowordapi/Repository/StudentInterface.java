package school.hei.hellowordapi.Repository;

import school.hei.hellowordapi.Model.Student;

import java.util.List;

public interface StudentInterface {
    List<Student> findAll();
    Student save(Student s);
    void deleteById(String id);
    Student updateNameById(String idStudent, String newName);
    List<Student> findWhereNameLike(String query);
}
// implementez cette interface avec une classe concrete avec JDBC
// Devoir recherche sur google
// proposez unr autre implementation avec JPQL
// language (vous pouvez avoir l'annotation: @Query))