package com.google.api.client.http;

import java.io.IOException;
import o.PrintHelper;
import o.copyAttributes;
import o.systemSupportsPrint;
import org.apache.http.message.TokenParser;
/* loaded from: classes7.dex */
public class HttpResponseException extends IOException {
    private static final long serialVersionUID = -1875819453475890043L;
    private final String content;
    private final transient PrintHelper headers;
    private final int statusCode;
    private final String statusMessage;

    public HttpResponseException(systemSupportsPrint systemsupportsprint) {
        this(new HttpResponseException$ag$a(systemsupportsprint));
    }

    protected HttpResponseException(HttpResponseException$ag$a httpResponseException$ag$a) {
        super(httpResponseException$ag$a.toString);
        this.statusCode = httpResponseException$ag$a.valueOf;
        this.statusMessage = httpResponseException$ag$a.values;
        this.headers = httpResponseException$ag$a.ag$a;
        this.content = httpResponseException$ag$a.ah$a;
    }

    public final boolean isSuccessStatusCode() {
        return copyAttributes.toString(this.statusCode);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public PrintHelper getHeaders() {
        return this.headers;
    }

    public final String getContent() {
        return this.content;
    }

    public static StringBuilder computeMessageBuffer(systemSupportsPrint systemsupportsprint) {
        StringBuilder sb = new StringBuilder();
        int values = systemsupportsprint.values();
        if (values != 0) {
            sb.append(values);
        }
        String HaptikSDK$b = systemsupportsprint.HaptikSDK$b();
        if (HaptikSDK$b != null) {
            if (values != 0) {
                sb.append(TokenParser.SP);
            }
            sb.append(HaptikSDK$b);
        }
        return sb;
    }
}
