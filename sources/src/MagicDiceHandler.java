import com.amazon.ask.Skill;
import com.amazon.ask.builder.StandardSkillBuilder;
import com.amazon.ask.model.RequestEnvelope;
import com.amazon.ask.model.ResponseEnvelope;
import com.amazon.ask.model.services.Serializer;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.amazonaws.util.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class MagicDiceHandler implements RequestStreamHandler {
    private final Skill skill;
    private final Serializer serializer;

    public MagicDiceHandler() {
        skill = new StandardSkillBuilder()
                .addRequestHandler(new RandomNumberHandler())
                .build();
        serializer = new com.amazon.ask.util.JacksonSerializer();
    }

    @Override
    public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {
        String serializedRequest = IOUtils.toString(input);
        RequestEnvelope requestEnvelope = serializer.deserialize(serializedRequest, RequestEnvelope.class);
        ResponseEnvelope response = skill.invoke(requestEnvelope);
        byte[] serializedResponse = serializer.serialize(response).getBytes(StandardCharsets.UTF_8);
        output.write(serializedResponse);
    }
}
