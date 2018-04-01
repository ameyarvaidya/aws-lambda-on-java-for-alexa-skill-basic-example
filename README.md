## AWS Lambda on Java - for Alexa Skill. Basic example.

https://youtu.be/Iz4hBfXfwGQ

AWS Lambda on Java for Alexa Skills guideline:
https://github.com/alexa/alexa-skills-kit-sdk-for-java/wiki/Setting-Up-The-ASK-SDK

Dependencies:
```
com.amazonaws:aws-java-sdk-lambda
com.amazon.alexa:ask-sdk
```
Note:
```
com.amazonaws:aws-java-sdk-lambda adds also
  com.amazonaws:aws-lambda-java-core
  etc.
com.amazon.alexa:ask-sdk adds also:
  com.amazon.alexa:ask-sdk-core
  com.amazon.alexa:ask-sdk-lambda-support
  com.amazon.alexa:ask-sdk-servlet-support
  com.amazon.alexa:ask-sdk-dynamodb-persistence-adapter
  com.amazon.alexa:ask-sdk-apache-client
  etc.
```
AWS console: 
https://console.aws.amazon.com 

Developer console: 
https://developer.amazon.com 

Request and Response JSON Reference reference:
https://developer.amazon.com/docs/custom-skills/request-and-response-json-reference.html

Testing of Alexa Skill
https://developer.amazon.com/docs/devconsole/test-your-skill.html
https://developer.amazon.com/designing-for-voice/
Testing with ASK CLI
https://developer.amazon.com/docs/smapi/ask-cli-command-reference.html#get-simulation-subcommand 

Possible errors, when SDK does not exist in the jar-artifact, or the jar-artifact was created (with imported dependencies) before updating versions of module dependencies (solution - re-create the jar-artifact):
```
java.lang.NoClassDefFoundError: com/amazon/ask/Skills
	at LambdaFunctionHandler.<init>(LambdaFunctionHandler.java:23)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
...

java.lang.NoClassDefFoundError: com/amazon/ask/builder/StandardSkillBuilder
	at LambdaFunctionHandler.<init>(LambdaFunctionHandler.java:20)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
...
```

IntelliJ IDEA plugin - Connector for AWS Lambda:
https://github.com/satr/intellij-idea-plugin-connector-for-aws-lambda
