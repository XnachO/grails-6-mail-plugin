## Sample project

### Testing with bootRun
`./gradlew bootRun`

When I run the app with this command, the mail is correctly delivered.

`curl --request POST --url http://localhost:8080/email/`

`Email sent`

### Testing with WAR
`./gradlew assemble`
```bash
java -jar build/libs/grails-6-mail-plugin-0.1.war 
```
But when I build the war artifact and then run it, I get the following error:

`curl --request POST --url http://localhost:8080/email/`
> ERROR --- [nio-8080-exec-1] com.example.EmailService                 : Could not locate mail body /email/auth/verificationCode. Is it in a plugin? If so you must pass the plugin name in the [plugin] variable


## Grails 6.2.3 Documentation

- [User Guide](https://docs.grails.org/6.2.3/guide/index.html)
- [API Reference](https://docs.grails.org/6.2.3/api/index.html)
- [Grails Guides](https://guides.grails.org/index.html)
---

## Feature views-json documentation

- [Grails JSON Views documentation](https://views.grails.org/)

