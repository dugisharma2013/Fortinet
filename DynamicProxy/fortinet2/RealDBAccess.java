/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortinet2;


public class RealDBAccess implements OfficeDBAccess {

    private String employeeName;

    public RealDBAccess(String empName) {
        this.employeeName = empName;
    }

    @Override
    public void grantDBAccess() {
        System.out.println("Database Access granted for employee: " + employeeName);
    }
}
