/**
 * Name: Yining Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: Customer.java
 * Description: This Class contains the abstract base customer class.
 * This class also has basic structure of all customers.
 */

package emailgenerationapp;

public abstract class Customer {
    protected String name;
    protected EmailTemplate emailTemplate;

    public Customer(String name, EmailTemplate emailTemplate) {
        this.name = name;
        this.emailTemplate = emailTemplate;
    }

    public abstract String generateEmail();
}

