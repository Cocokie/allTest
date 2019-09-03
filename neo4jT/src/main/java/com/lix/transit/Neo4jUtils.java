package com.lix.transit;

import org.neo4j.driver.v1.*;

import java.util.ArrayList;
import java.util.List;

public class Neo4jUtils {
    Driver driverfir;
    Driver driversec;
    int sessionMax = 5;
    List<Session> fir = new ArrayList<>();
    List<Session> sec = new ArrayList<>();
   /* Session sessionfir;
    Session sessionsec;*/

    public Neo4jUtils() {
        driverfir = GraphDatabase.driver("bolt://192.168.100.129:7687", AuthTokens.basic("sjcjb", "hpre&-*123"));

        driversec = GraphDatabase.driver("bolt://192.168.104.91:7687", AuthTokens.basic("neo4j", "hpre&-*123"));
    }

    public  Session getSession1() {

        return driverfir.session();
    }

    public  Session getSession2() {

        return driversec.session();
    }


    public void closeSession(Session session) {
        if (session != null)
            session = null;
    }

}

