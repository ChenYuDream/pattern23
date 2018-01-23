package com.chenyu.simaplefactory;

import com.chenyu.simaplefactory.Audi;
import com.chenyu.simaplefactory.Byd;

/**
 * @author yu_chen
 * @create 2018-01-22 12:13
 **/
public class CarFactory {

    public static Audi getAudiInstance() {
        return new Audi();
    }


    public static Byd getBydInstance() {
        return new Byd();
    }

}
