package com.zambrone.Util;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGridException;
import com.zambrone.entity.TEmail;

/**
 * Created by Chamith on 14/07/2017.
 */
public class SendEmail {

    private static SendEmail sendEmail = null;

    private SendEmail() {
    }

    public static SendEmail getSendEmail() {

        if (sendEmail == null) {
            sendEmail = new SendEmail();
        }
        return sendEmail;
    }

    public boolean setcontentMail(TEmail tEmail) {
        boolean status = true;


        SendGrid sendgrid = new SendGrid("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");
        SendGrid.Email email = new SendGrid.Email();
        email.addTo(tEmail.getTo());
        email.setFrom(tEmail.getFrom());
        email.setSubject(tEmail.getSubject());
        email.setHtml(" ");

// Substitute template ID
        email.addFilter(
                "templates",
                "template_id",
                "09621979-566a-4ed9-ae42-44b98f9820be");

//place holders in template, dynamically fill values in template
//        email.addSubstitution(
//                ":firstName",
//                new String[]{firstName});
//        email.addSubstitution(
//                ":lastName",
//                new String[]{lastName});

// send your email
        try {
            SendGrid.Response response = sendgrid.send(email);
        } catch (SendGridException e) {
            e.printStackTrace();
            return false;
        }

        return status;

    }

}
