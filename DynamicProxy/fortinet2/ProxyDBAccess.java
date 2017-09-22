/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortinet2;
public class ProxyDBAccess implements OfficeDBAccess {

    private String employeeName;
    private RealDBAccess realaccess;

    public ProxyDBAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantDBAccess() {
        if (getRole(employeeName) > 4) {
            realaccess = new RealDBAccess(employeeName);
            realaccess.grantDBAccess();
        } else {
            System.out.println("No Database access granted. Your job level is below 5");
        }
    }

    public int getRole(String emplName) {
        // Check role from the database based on Name and designation  
        // return job level or job designation.  
        return 2;
    }
}
