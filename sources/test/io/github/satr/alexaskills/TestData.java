package io.github.satr.alexaskills;

public class TestData {
    public static String getRequestContent() {
        return "{\n" +
                "\t\"version\": \"1.0\",\n" +
                "\t\"session\": {\n" +
                "\t\t\"new\": true,\n" +
                "\t\t\"sessionId\": \"amzn1.echo-api.session.1234567890\",\n" +
                "\t\t\"application\": {\n" +
                "\t\t\t\"applicationId\": \"amzn1.ask.skill.1234567890\"\n" +
                "\t\t},\n" +
                "\t\t\"user\": {\n" +
                "\t\t\t\"userId\": \"amzn1.ask.account.1234567890\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"context\": {\n" +
                "\t\t\"AudioPlayer\": {\n" +
                "\t\t\t\"playerActivity\": \"IDLE\"\n" +
                "\t\t},\n" +
                "\t\t\"Display\": {},\n" +
                "\t\t\"System\": {\n" +
                "\t\t\t\"application\": {\n" +
                "\t\t\t\t\"applicationId\": \"amzn1.ask.skill.1234567890\"\n" +
                "\t\t\t},\n" +
                "\t\t\t\"user\": {\n" +
                "\t\t\t\t\"userId\": \"amzn1.ask.account.1234567890\"\n" +
                "\t\t\t},\n" +
                "\t\t\t\"device\": {\n" +
                "\t\t\t\t\"deviceId\": \"amzn1.ask.device.1234567890\",\n" +
                "\t\t\t\t\"supportedInterfaces\": {\n" +
                "\t\t\t\t\t\"AudioPlayer\": {},\n" +
                "\t\t\t\t\t\"Display\": {\n" +
                "\t\t\t\t\t\t\"templateVersion\": \"1.0\",\n" +
                "\t\t\t\t\t\t\"markupVersion\": \"1.0\"\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"apiEndpoint\": \"https://api.amazonalexa.com\",\n" +
                "\t\t\t\"apiAccessToken\": \"1234567890\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"request\": {\n" +
                "\t\t\"type\": \"IntentRequest\",\n" +
                "\t\t\"requestId\": \"amzn1.echo-api.request.1234567890\",\n" +
                "\t\t\"timestamp\": \"2018-04-01T08:32:22Z\",\n" +
                "\t\t\"locale\": \"en-US\",\n" +
                "\t\t\"intent\": {\n" +
                "\t\t\t\"name\": \"RandomNumberIntent\",\n" +
                "\t\t\t\"confirmationStatus\": \"NONE\"\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}";
    }
}
