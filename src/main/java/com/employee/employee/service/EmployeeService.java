package com.employee.employee.service;

import com.employee.employee.model.Employee;
import com.employee.employee.repository.IemployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IemployeeRepo iemployeeRepo;
    public List<Employee> getAll(){
        return  iemployeeRepo.findAll();
    }
    public Employee getById(Long id){
        Optional<Employee> optionalEmployee = iemployeeRepo.findById(id);
        Employee employee=null;
        if(optionalEmployee.isPresent()) employee=optionalEmployee.get();
        return  employee;
    }
    public String addEmployee(Employee employee){
        iemployeeRepo.save(employee);
        return  "added";
    }
    public String addEmployees(List<Employee> employeeList){
        iemployeeRepo.saveAll(employeeList);
        return  "added list of employees";
    }
    public  String deleteById(Long id){
        iemployeeRepo.deleteById(id);
        return  "deleted "+ id;
    }
    public  String updatebyId(Employee employee,Long id)
    {
        Employee newemployee = getById(id);
        if(newemployee!=null){
            newemployee.setAddress(employee.getAddress());
            newemployee.setFirstName(employee.getFirstName());
            newemployee.setLastName(employee.getLastName());
            iemployeeRepo.save(newemployee);
            return "update "+id;
        }
        return "unable to update";

    }
}
