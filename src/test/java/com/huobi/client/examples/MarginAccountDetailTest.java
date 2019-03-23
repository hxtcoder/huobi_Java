package com.huobi.client.examples;

import com.huobi.client.SyncRequestClient;
import com.huobi.client.model.MarginAccountDetail;
import org.junit.Before;
import org.junit.Test;

public class MarginAccountDetailTest {

    private SyncRequestClient syncRequestClient;

    @Before
    public void setUp() {
         syncRequestClient = SyncRequestClient.create(
                "xxxxxx", "xxxxxx");
    }

    @Test
    public void getMarginAccountDetail() {
        MarginAccountDetail marginAccountDetail = syncRequestClient.getMarginAccountInfo("btcusdt");
        System.out.println(marginAccountDetail);
    }
}
