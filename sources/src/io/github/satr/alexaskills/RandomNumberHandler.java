package io.github.satr.alexaskills;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.Response;

import java.util.Date;
import java.util.Optional;
import java.util.Random;

public class RandomNumberHandler implements com.amazon.ask.dispatcher.request.handler.RequestHandler {

    private final Random random = new Random(new Date().getTime());

    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return true;
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {
        int number = random.nextInt(6) + 1;
        String speechText = "Number is " + number;
        return handlerInput.getResponseBuilder().withSpeech(speechText).build();
    }
}
