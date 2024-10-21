package org.iti.productservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class HeaderLoggingAdvice {

    private static final Logger logger = LoggerFactory.getLogger(HeaderLoggingAdvice.class);

    @RequestMapping(value = "/api/products/**", method = RequestMethod.GET)
    public void logHeaders(HttpServletRequest request) {
        // Log all headers
        request.getHeaderNames().asIterator().forEachRemaining(headerName ->
                logger.info("Header: {} = {}", headerName, request.getHeader(headerName))
        );
    }
}
