package com.rigal.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by jitendragangwar on 1/13/17.
 */
public class RequestFilter implements ContainerRequestFilter {
    private static Logger logger = LoggerFactory.getLogger(RequestFilter.class);

    public void filter(ContainerRequestContext requestContext) throws IOException {

        String uuid = UUID.randomUUID().toString();
        MDC.put("id",uuid);
        requestContext.setProperty("id", uuid);

       logger.info("uuid = " + uuid);

    }
}
