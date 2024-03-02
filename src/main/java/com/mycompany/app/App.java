/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/
//Package com.mycompany.app
package com.mycompany.app;

import com.mycompany.app.week2.Book;

public class App {
    public static void main(String[] args) {
        Book myObj = new Book("a","b",2);
        System.out.println(myObj.title);
        
    }
}
