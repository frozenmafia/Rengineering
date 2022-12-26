package com.apollographql.apollo.exception;

import o.runAnimators;
/* loaded from: classes.dex */
public class ApolloException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloException(String str) {
        super(str);
        runAnimators.valueOf(str, "message");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloException(String str, Throwable th) {
        super(str, th);
        runAnimators.valueOf(str, "message");
        runAnimators.valueOf(th, "cause");
    }
}
