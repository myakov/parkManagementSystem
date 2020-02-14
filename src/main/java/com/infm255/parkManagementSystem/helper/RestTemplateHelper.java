package com.infm255.parkManagementSystem.helper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import static org.springframework.http.MediaType.APPLICATION_JSON;

/**
 * Represents a helper class that makes it easier to send rest requests to the
 * Control System's API.
 */
@Component
@Slf4j
public class RestTemplateHelper {

    private RestTemplate restTemplate = new RestTemplate();


    /**
     * Constructs a REST request to the Control System's API.
     *
     * @param url           The Control System's API url.
     * @param method        The Http method (GET, POST, PUT... etc.).
     * @param request       The request type to write in the request.
     * @param responseClass The desired class of the response.
     * @return The body of the returned response.
     */
    public <RequestType, ResponseType> ResponseType exchange(
            String url,
            HttpMethod method,
            RequestType request,
            Class<ResponseType> responseClass) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(APPLICATION_JSON);
        HttpEntity<RequestType> requestEntity = new HttpEntity<>(request, headers);

        return restTemplate.exchange(
                "localhost:8080" + url,
                method,
                requestEntity,
                responseClass).getBody();
    }

}

