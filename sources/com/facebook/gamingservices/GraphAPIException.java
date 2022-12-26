package com.facebook.gamingservices;

import o.runAnimators;
/* loaded from: classes6.dex */
public final class GraphAPIException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphAPIException(String str) {
        super(str);
        runAnimators.ag$a(str, "message");
    }
}
