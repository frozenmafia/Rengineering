package org.apache.http.protocol;
@Deprecated
/* loaded from: classes8.dex */
public class SyncBasicHttpContext extends BasicHttpContext {
    public SyncBasicHttpContext(HttpContext httpContext) {
        super(httpContext);
    }

    public SyncBasicHttpContext() {
    }

    @Override // org.apache.http.protocol.BasicHttpContext, org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        Object attribute;
        synchronized (this) {
            attribute = super.getAttribute(str);
        }
        return attribute;
    }

    @Override // org.apache.http.protocol.BasicHttpContext, org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        synchronized (this) {
            super.setAttribute(str, obj);
        }
    }

    @Override // org.apache.http.protocol.BasicHttpContext, org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        Object removeAttribute;
        synchronized (this) {
            removeAttribute = super.removeAttribute(str);
        }
        return removeAttribute;
    }

    @Override // org.apache.http.protocol.BasicHttpContext
    public void clear() {
        synchronized (this) {
            super.clear();
        }
    }
}
