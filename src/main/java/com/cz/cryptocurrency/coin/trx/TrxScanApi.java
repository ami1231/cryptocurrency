package com.cz.cryptocurrency.coin.trx;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TrxScanApi {

    RestTemplate restTemplate = new RestTemplate();
    private String host = "https://apilist.tronscan.org/";

    /**
     * 查詢波場交易區塊
     * @param hashCode
     */
    public void queryTrxHash(String hashCode){

    }

}
