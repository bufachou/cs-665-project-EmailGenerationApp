/**
 * Name: Yining Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: EmailGenerationApp.java
 * Description: This Class contains the main application code.
 * It creates an object for each customer type
 * and call its generateEmail method to print a personalized email.
 */

package emailgenerationapp;

public class EmailGenerationApp {
    public static void main(String[] args) {
        EmailTemplate emailTemplate = new EmailTemplate();

        Customer businessCustomer = new BusinessCustomer("John", emailTemplate);
        System.out.println(businessCustomer.generateEmail());

        Customer returningCustomer = new ReturningCustomer("Jane", emailTemplate);
        System.out.println(returningCustomer.generateEmail());

        Customer frequentCustomer = new FrequentCustomer("Tom", emailTemplate);
        System.out.println(frequentCustomer.generateEmail());

        Customer newCustomer = new NewCustomer("Alice", emailTemplate);
        System.out.println(newCustomer.generateEmail());

        Customer vipCustomer = new VIPCustomer("Bob", emailTemplate);
        System.out.println(vipCustomer.generateEmail());
    }
}

