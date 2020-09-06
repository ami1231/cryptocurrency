package com.cz.cryptocurrency.coin.eth;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EthScanApi {

    RestTemplate restTemplate = new RestTemplate();

    private String token = "";


}
