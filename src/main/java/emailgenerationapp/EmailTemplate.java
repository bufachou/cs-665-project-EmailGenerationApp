/**
 * Name: Yining Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: EmailTemplate.java
 * Description: This Class contains the base email template.
 *
 */

package emailgenerationapp;

public class EmailTemplate {
    private String template = "Dear [CUSTOMER_TYPE],\n\n[MESSAGE]\n\nRegards,\nThe Company";

    public String getTemplate() {
        return template;
    }
}
