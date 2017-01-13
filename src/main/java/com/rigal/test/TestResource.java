package com.rigal.test;

import com.codahale.metrics.annotation.Timed;

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
    @GET
    @Timed
    public Map testMap(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("abc","def");
        return map;
    }

    @GET
    @Path("/test2")
    @Timed
    public Map testMap2(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("abc2","def2");
        return map;
    }
}
