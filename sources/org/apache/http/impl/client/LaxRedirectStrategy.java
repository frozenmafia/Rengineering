package org.apache.http.impl.client;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpHead;
/* loaded from: classes8.dex */
public class LaxRedirectStrategy extends DefaultRedirectStrategy {
    public static final LaxRedirectStrategy INSTANCE = new LaxRedirectStrategy();

    public LaxRedirectStrategy() {
        super(new String[]{"GET", "POST", HttpHead.METHOD_NAME, HttpDelete.METHOD_NAME});
    }
}
