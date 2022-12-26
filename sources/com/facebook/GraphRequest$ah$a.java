package com.facebook;

import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GraphRequest$ah$a {
    private final Object ag$a;
    private final GraphRequest toString;

    public GraphRequest$ah$a(GraphRequest graphRequest, Object obj) {
        runAnimators.ag$a(graphRequest, "request");
        this.toString = graphRequest;
        this.ag$a = obj;
    }

    public final Object ag$a() {
        return this.ag$a;
    }

    public final GraphRequest valueOf() {
        return this.toString;
    }
}
