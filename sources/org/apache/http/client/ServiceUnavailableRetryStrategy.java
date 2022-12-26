package org.apache.http.client;

import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;
/* loaded from: classes8.dex */
public interface ServiceUnavailableRetryStrategy {
    long getRetryInterval();

    boolean retryRequest(HttpResponse httpResponse, int i, HttpContext httpContext);
}
