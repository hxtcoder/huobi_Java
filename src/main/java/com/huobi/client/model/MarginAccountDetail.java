package com.huobi.client.model;

import java.util.List;

public class MarginAccountDetail {

    private String symbol;

    private String state;

    private String riskRate;

    private String flPrice;

    private List<SubAccountInfo> subAccountInfoList;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRiskRate() {
        return riskRate;
    }

    public void setRiskRate(String riskRate) {
        this.riskRate = riskRate;
    }

    public String getFlPrice() {
        return flPrice;
    }

    public void setFlPrice(String flPrice) {
        this.flPrice = flPrice;
    }

    public List<SubAccountInfo> getList() {
        return subAccountInfoList;
    }

    public void setList(List<SubAccountInfo> subAccountInfoList) {
        this.subAccountInfoList = subAccountInfoList;
    }
}
