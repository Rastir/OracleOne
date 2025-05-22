package com.aluracursos.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obtenerTraduccion(String texto) {
        OpenAiService service = new OpenAiService("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");

        CompletionRequest requisicion = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduce a español el siguiente texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var respuesta = service.createCompletion(requisicion);
        return respuesta.getChoices().get(0).getText();
    }
}