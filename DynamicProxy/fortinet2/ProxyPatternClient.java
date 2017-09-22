/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortinet2;

public class ProxyPatternClient {  
    public static void main(String[] args)   
    {  
        OfficeDBAccess access = new ProxyDBAccess("Ashwani Rajput");  
        access.grantDBAccess();  
    }  
}  