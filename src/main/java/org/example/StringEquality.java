/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 20-02-2023
 *Created With : IntelliJ IDEA Community Edition
 */


package org.example;

public class StringEquality {

    public static void main(String[] args) {

        /*String objects created using new keyword will have different memory
        references. So it will not be equal
        If you use '==' operator, it will not be same.
        If you use equals() method, it will be same whether the memory reference is same or not */
        String name = new String("Seetha");
        String name1 = new String("Seetha");
        if (name.equals(name1)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        /*String objects created using String literals will have same memory
        references. So it will equal */
        String name2 = "Seetha";
        String name3 = "Seetha";
        if (name2.equals(name3)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }
}

