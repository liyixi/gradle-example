/*
 * @(#)Hello    Created on 2021/11/22
 * Copyright (c) 2021 ZDSoft Networks, Inc. All rights reserved.
 * $$ Id$$
 */
package com.example;

import com.example.services.TestServiceImpl;

/**
 * @author Y3-012
 * @version $$ Revision: 1.0 $$, $$ Date: 2021/11/22 11:32 $$
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Application ,Hello world," + new TestServiceImpl().testService());
    }
}
