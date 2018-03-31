import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Date;
import java.util.Optional;
import java.util.Random;

public class RandomNumberHandler implements RequestHandler {
    private Random random = new Random(new Date().getTime());
    @Override
    public boolean canHandle(HandlerInput input) {
        return true;
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        int number = random.nextInt(6) + 1;
        String speechText = "Number is " + number;
        return input.getResponseBuilder().withSpeech(speechText)
                .withSimpleCard("Next number", speechText)
                .build();
    }
}
