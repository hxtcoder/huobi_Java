package com.huobi.client.examples;

import com.huobi.client.SyncRequestClient;
import com.huobi.client.model.Loan;
import com.huobi.client.model.MarginAccountDetail;
import com.huobi.client.model.request.LoanOrderRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

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

    @Test
    public void getBorrowedHistory() {
        LoanOrderRequest req = new LoanOrderRequest("btcusdt", null, null, null,
                2000680L, "next",null);
        List<Loan> loanHistory = syncRequestClient.getLoanHistory(req);
        System.out.println(loanHistory);
    }
}
