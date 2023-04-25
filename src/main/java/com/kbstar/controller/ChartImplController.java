package com.kbstar.controller;

import com.kbstar.dto.Browser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class ChartImplController {

    @RequestMapping("/container1")
    public Object container1(String year){
        JSONArray ja = new JSONArray();
        for(int i=1; i<=12; i++){
            Random r = new Random();
            int num = r.nextInt(100)+1;
            ja.add(num);
        }
        return ja;
    };

    @RequestMapping("/container2")
    public Object container2(String year){

        List<Double> testList = new ArrayList<Double>();
        for(int i=1; i<=10; i++) {
            Random r = new Random();
            double num = r.nextInt(100) + 1;
            testList.add(num);
        }
        int sum = 0;
        for (double num: testList) {
            sum += num;
        }
        List<String> testList2 = new ArrayList<String>(Arrays.asList("Chrome", "Edge", "Firefox", "Safari", "Internet Explorer","Opera", "Sogou Explorer", "QQ", "Other"));
        ArrayList<Browser> alist = new ArrayList<Browser>();
        for(int j=0; j<=9; j++) {
            alist.add(new Browser(testList2.get(j), testList.get(j)/sum));
        }

        return alist;
    };
}
