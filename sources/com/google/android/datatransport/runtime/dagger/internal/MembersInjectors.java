package com.google.android.datatransport.runtime.dagger.internal;

import o.setPendingShowSoftInputRequest;
/* loaded from: classes7.dex */
public final class MembersInjectors {

    /* loaded from: classes7.dex */
    enum NoOpMembersInjector {
        INSTANCE;

        public void injectMembers(Object obj) {
            setPendingShowSoftInputRequest.values(obj, "Cannot inject members into a null reference");
        }
    }
}
