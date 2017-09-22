/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBSingleton;

public class SingletonDBPattern {

    public static void main(String[] args) {

        SingleDBObject object = SingleDBObject.getDBInstance();
        object.showMessage();
    }
}
