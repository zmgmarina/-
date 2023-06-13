package HW_Employee;

import java.util.Comparator;

public class WorkExperienceComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        // 1 0 -1
        return Double.compare(o2.workExperience, o1.workExperience);
        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);

    }
}
