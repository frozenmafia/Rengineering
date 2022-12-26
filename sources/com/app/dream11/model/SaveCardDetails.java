package com.app.dream11.model;
/* loaded from: classes6.dex */
public class SaveCardDetails {
    private String cardLogo;
    private String card_brand;
    private String card_exp_month;
    private String card_exp_year;
    private String card_fingerprint;
    private String card_isin;
    private String card_issuer;
    private String card_number;
    private String card_reference;
    private String card_token;
    private String card_type;
    private boolean expired;
    private String name_on_card;
    private String nickname;

    public String getCard_token() {
        return this.card_token;
    }

    public void setCard_token(String str) {
        this.card_token = str;
    }

    public String getCard_reference() {
        return this.card_reference;
    }

    public void setCard_reference(String str) {
        this.card_reference = str;
    }

    public String getCard_number() {
        return this.card_number;
    }

    public void setCard_number(String str) {
        this.card_number = str;
    }

    public String getCard_isin() {
        return this.card_isin;
    }

    public void setCard_isin(String str) {
        this.card_isin = str;
    }

    public String getCard_exp_year() {
        return this.card_exp_year;
    }

    public void setCard_exp_year(String str) {
        this.card_exp_year = str;
    }

    public String getCard_exp_month() {
        return this.card_exp_month;
    }

    public void setCard_exp_month(String str) {
        this.card_exp_month = str;
    }

    public String getCard_type() {
        return this.card_type;
    }

    public void setCard_type(String str) {
        this.card_type = str;
    }

    public String getCard_issuer() {
        return this.card_issuer;
    }

    public void setCard_issuer(String str) {
        this.card_issuer = str;
    }

    public String getCard_brand() {
        return this.card_brand;
    }

    public void setCard_brand(String str) {
        this.card_brand = str;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public String getName_on_card() {
        return this.name_on_card;
    }

    public void setName_on_card(String str) {
        this.name_on_card = str;
    }

    public boolean isExpired() {
        return this.expired;
    }

    public void setExpired(boolean z) {
        this.expired = z;
    }

    public String getCard_fingerprint() {
        return this.card_fingerprint;
    }

    public void setCard_fingerprint(String str) {
        this.card_fingerprint = str;
    }

    public void setCardLogo(String str) {
        this.cardLogo = str;
    }

    public String getCardLogo() {
        return this.cardLogo;
    }
}
