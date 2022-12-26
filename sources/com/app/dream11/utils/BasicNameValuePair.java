package com.app.dream11.utils;
/* loaded from: classes3.dex */
public class BasicNameValuePair implements NameValuePair {
    private String name;
    private String value;

    public BasicNameValuePair(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    @Override // com.app.dream11.utils.NameValuePair
    public String getName() {
        return this.name;
    }

    @Override // com.app.dream11.utils.NameValuePair
    public String getValue() {
        return this.value;
    }

    public String toString() {
        return String.format("Key: %s; Value: %s", this.name, this.value);
    }
}
