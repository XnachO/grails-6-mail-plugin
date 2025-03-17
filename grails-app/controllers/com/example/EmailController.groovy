package com.example


class EmailController {

    EmailService emailService

    def index() {
        emailService.send()
    }
}