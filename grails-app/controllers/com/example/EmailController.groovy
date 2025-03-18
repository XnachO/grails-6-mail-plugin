package com.example


class EmailController {

    EmailService emailService

    def index() {
        render emailService.send()
    }
}