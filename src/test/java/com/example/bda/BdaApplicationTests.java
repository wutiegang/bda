package com.example.bda;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SpringBootTest
class BdaApplicationTests {

    @Test
    void contextLoads(HttpServletResponse resp,HttpServletRequest req) {
        System.out.println("11");
    }


}
