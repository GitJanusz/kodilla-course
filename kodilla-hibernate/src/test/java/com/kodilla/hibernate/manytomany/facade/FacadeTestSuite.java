package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.Facade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFilterCompanies() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company dataSource = new Company("Data Source");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(dataSource);
        //When
        List<Company> facadeResult = facade.filterCompanies("ma");
        //Then
        assertEquals(2, facadeResult.size());
        //CleanUp
        companyDao.deleteAll();
    }

    @Test
    void testFilterEmployee() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaPosmil = new Employee("Linda", "Posmil");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaPosmil);
        //When
        List<Employee> result = facade.filterEmployees("smi");
        //Then
        assertEquals(2, result.size());
        //CleanUp
        companyDao.deleteAll();
    }

    @Test
    void clean() {
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }
}
