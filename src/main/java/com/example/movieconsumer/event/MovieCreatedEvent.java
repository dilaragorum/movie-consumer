package com.example.movieconsumer.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieCreatedEvent <T> {
        private T body;
        private String key;
        private String topic;
        private Map<String, String> headers;
}
