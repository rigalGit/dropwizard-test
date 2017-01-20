package com.rigal.test;

import com.codahale.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jitendragangwar on 1/13/17.
 */
@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class TestResource {
    private static final Logger logger = LoggerFactory.getLogger(TestResource.class);
    @GET
    @Timed
    public Map testMap(){
        logger.info("testMap called ");
        Map<String,String> map = new HashMap<String, String>();
        map.put("abc","def");
        System.out.println("sout map = " + map);
        logger.info("returning response :: "+map);
        return map;
    }

    @GET
    @Path("/test2")
    @Timed
    public Map testMap2(){
        logger.info("testMap2 called ");
        Map<String,String> map = new HashMap<String, String>();
        map.put("abc2","def2");
        System.out.println("soutv2 map = " + map);
        return map;
    }
}
