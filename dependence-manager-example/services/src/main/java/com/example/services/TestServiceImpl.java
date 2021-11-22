/*
 * @(#)TestServiceImpl    Created on 2021/11/22
 * Copyright (c) 2021 ZDSoft Networks, Inc. All rights reserved.
 * $$ Id$$
 */
package com.example.services;

import com.example.shared.ExampleShared;

/**
 * @author Y3-012
 * @version $$ Revision: 1.0 $$, $$ Date: 2021/11/22 13:05 $$
 */
public class TestServiceImpl implements TestService{

    @Override
    public String testService() {
        ExampleShared shared = new ExampleShared();
        return shared.getName();
    }
}
