/**
 * Name: Yining Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: FrequentCustomer.java
 * Description: This Class generates messages for frequent customers
 * about special coupon or acknowledgement.
 *
 */

package emailgenerationapp;

public class FrequentCustomer extends Customer {
    public FrequentCustomer(String name, EmailTemplate emailTemplate) {
        super(name, emailTemplate);
    }

    @Override
    public String generateEmail() {
        String email = emailTemplate.getTemplate();
        return email.replace("[CUSTOMER_TYPE]", "Frequent Customer " + name)
                .replace("[MESSAGE]", "We appreciate your frequent visits. Here's a special Coupon just for you.");
    }
}

