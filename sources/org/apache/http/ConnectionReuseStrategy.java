package org.apache.http;

import org.apache.http.protocol.HttpContext;
/* loaded from: classes5.dex */
public interface ConnectionReuseStrategy {
    boolean keepAlive(HttpResponse httpResponse, HttpContext httpContext);
}
