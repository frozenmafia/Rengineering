package org.apache.http.protocol;
/* loaded from: classes5.dex */
public interface HttpContext {
    public static final String RESERVED_PREFIX = "http.";

    Object getAttribute(String str);

    Object removeAttribute(String str);

    void setAttribute(String str, Object obj);
}
