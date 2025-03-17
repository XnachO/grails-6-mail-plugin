package com.example

import grails.config.Config
import grails.core.support.GrailsConfigurationAware
import grails.plugins.mail.MailService
import groovy.transform.CompileStatic

@CompileStatic
class EmailService implements GrailsConfigurationAware {

    MailService mailService

    String toAddress, fromAddress

    def send() {
        ArrayList<String> toList = [
                toAddress,
        ]
        try {
            mailService.sendMail {
                to toList
                from fromAddress
                subject "Email title"
                html view: "/email/auth/verificationCode", model:
                        [
                                codePart1: "123",
                                codePart2: "456",
                        ]
            }
        } catch (Exception e) {
            log.error e.getMessage().toString()
        }

    }

    @Override
    void setConfiguration(Config config) {
        toAddress = config.getProperty("emailService.toAddress")
        fromAddress = config.getProperty("emailService.fromAddress")
    }
}