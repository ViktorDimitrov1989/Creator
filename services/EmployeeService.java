package app.services;
import app.dto.add.AddEmployeeDto;

public interface EmployeeService {

    void save(AddEmployeeDto employee);

   void save(Iterable<AddEmployeeDto> employees);

}
