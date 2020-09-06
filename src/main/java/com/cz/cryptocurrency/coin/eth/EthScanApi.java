package com.cz.cryptocurrency.coin.eth;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EthScanApi {

    private RestTemplate restTemplate = new RestTemplate();
    private String host = "https://api.etherscan.io/api?/api?module=transaction&action=gettxreceiptstatus&txhash=0x79a195ab87f11d479ce269a5fb43cde19a19439800b2208a3dae6dbc2db9513c";
    private String token = "EHFETXEVAQGNXCH76CCMCSHZ8HVY88QJ3J";

    public void queryTransaction(String hashCode){

        String url = host+"&apikey="+token;
        Object param = null;
        ResponseEntity<String> data = restTemplate.getForEntity(url,String.class, param);
        System.out.println(data.getBody());


    }


}
