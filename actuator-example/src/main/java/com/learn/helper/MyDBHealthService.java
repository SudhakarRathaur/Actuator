package com.learn.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;

@Controller
public class MyDBHealthService implements HealthIndicator {

    public static final String DB_Service = "Database Service";

    public boolean  isHealthGood(){
        //  Custom Logic
        return true;
    }
    @Override
    public Health health() {
        if(isHealthGood()){
            return Health.up().withDetail(DB_Service, "DataBase Service is running").build();
        }
        return Health.down().withDetail(DB_Service, "DataBase Service is down").build();
    }
}
