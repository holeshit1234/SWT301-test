/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.testng.main;

import org.testng.TestNG;
import org.testng.swt301.Swt301Testng;

/**
 *
 * @author Chau Nhat Truong
 */
public class Main {

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[]{Swt301Testng.class});
        testng.run();
    }
}
