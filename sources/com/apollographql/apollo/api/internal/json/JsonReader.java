package com.apollographql.apollo.api.internal.json;

import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes.dex */
public interface JsonReader extends Closeable {

    /* loaded from: classes.dex */
    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        LONG,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    String HaptikSDK$d() throws IOException;

    <T> T HaptikSDK$e() throws IOException;

    long HaptikWebView() throws IOException;

    JsonReader ag$a() throws IOException;

    JsonReader ah$a() throws IOException;

    boolean ah$b() throws IOException;

    void aj$a() throws IOException;

    Token getInitSettings() throws IOException;

    String getSignupData() throws IOException;

    boolean invoke() throws IOException;

    JsonReader valueOf() throws IOException;

    JsonReader values() throws IOException;
}
