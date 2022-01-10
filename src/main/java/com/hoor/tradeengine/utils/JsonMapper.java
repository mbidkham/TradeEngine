package com.hoor.tradeengine.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class JsonMapper {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private JsonMapper() {
    }

    public static ObjectNode jsonStringToObjectNode(String config)
            throws JsonProcessingException {
        return OBJECT_MAPPER.readValue(config, ObjectNode.class);
    }

    public static <T> T jsonStringToObject(String jsonString, Class<T> objectType) {
        try {
            return OBJECT_MAPPER.readValue(jsonString, objectType);
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
        }
        return null;
    }

    public static String objectNodeToJsonString(Object objectNode) {
        try {
            return OBJECT_MAPPER.writeValueAsString(objectNode);
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
        }
        return null;
    }

    public static ObjectNode objectToObjectNode(Object object)
            throws JsonProcessingException {
        return OBJECT_MAPPER.valueToTree(object);
    }
}
