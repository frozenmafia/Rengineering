package com.apollographql.apollo.exception;
/* loaded from: classes.dex */
public final class ApolloCanceledException extends ApolloException {
    public ApolloCanceledException() {
        super("Call is cancelled");
    }

    public ApolloCanceledException(String str, Throwable th) {
        super(str, th);
    }
}
