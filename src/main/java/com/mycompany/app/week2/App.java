/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/
//Package com.mycompany.app
package com.mycompany.app.week2;

import com.mycompany.app.week2.Book;
import com.mycompany.app.week2.AccessControl.Ex3.Debug;

public class App {
    static Debug debug = new Debug();
    public static void main(String[] args) {
    
        Book myObj = new Book("a","b",2);
        System.out.println(myObj.title);
        Recursion x = new Recursion();

        Time hhour = new Time();

        NameNumber nameNumber = new NameNumber("Thanh", "000");
        NameNumber nameNumber2 = new NameNumber("Truong", "000");

        // System.out.println(nameNumber.getLastName());

        NNCollection nnCollection = new NNCollection();
        nnCollection.insert(nameNumber2);
        System.out.println(nameNumber2.getLastName());
    }
}
