package com.employee.employee.controller;

import com.employee.employee.model.Address;
import com.employee.employee.model.Employee;
import com.employee.employee.service.AddressService;
import com.employee.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("getall")
    public List<Employee> getAllemployee(){
        return employeeService.getAll();
    }
    @GetMapping("getbyId/{Id}")
    public Employee getById(@PathVariable Long Id){
        return employeeService.getById(Id);
    }
    @PostMapping("addAll")
    public String addAll(@RequestBody List<Employee> employeeList){
        return  employeeService.addEmployees(employeeList);
    }
    @PostMapping("addone")
    public String employee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);

    }
    @DeleteMapping("delete/{Id}")
    public String deletedByid(@PathVariable Long Id){
        return employeeService.deleteById(Id);
    }
    @PutMapping("update/{Id}")
    public String updateById(@RequestBody Employee employee, @PathVariable Long Id){
        return employeeService.updatebyId(employee,Id);
    }


}
