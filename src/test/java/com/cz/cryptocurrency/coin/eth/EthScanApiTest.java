package com.cz.cryptocurrency.coin.eth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EthScanApiTest {

    @Resource
    private EthScanApi ethScanApi;

    @Test
    public void testScan(){
        ethScanApi.queryTransaction("aaa");
    }
}
