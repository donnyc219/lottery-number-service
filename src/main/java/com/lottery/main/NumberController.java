package com.lottery.main;

import com.lottery.main.Objects.MegaMillion;
import com.lottery.main.Objects.Powerball;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NumberController {
    private static final String ALLOWED_URL = "http://localhost:4200";
    private static final String POWERBALL_URL = "https://data.ny.gov/resource/8vkr-v8vh.json";
    private static final String MEGAMILLION_URL = "https://data.ny.gov/resource/h6w8-42p9.json";

    @CrossOrigin(ALLOWED_URL)
    @RequestMapping("/test2")
    public Map<String, String> test2(){
        Map m = new HashMap();
        m.put("test", "it works!");
        return m;
    }

    @CrossOrigin(ALLOWED_URL)
    @RequestMapping("/getLatestPowerball")
    public Powerball getPowerballLatestNumbers(){
        RestTemplate rt = new RestTemplate();

        Powerball[] powerballs = rt.getForObject(POWERBALL_URL, Powerball[].class);

        return powerballs[0];
    }

    @CrossOrigin(ALLOWED_URL)
    @RequestMapping("/getLatestMegaMillion")
    public MegaMillion getMegaMillionLatestNumbers(){
        RestTemplate rt = new RestTemplate();

        MegaMillion[] mega = rt.getForObject(MEGAMILLION_URL, MegaMillion[].class);

        return mega[0];
    }
}


