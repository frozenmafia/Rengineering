package com.sendbird.android.shadow.okhttp3;

import java.io.IOException;
/* loaded from: classes5.dex */
public interface Authenticator {
    public static final Authenticator NONE = new Authenticator() { // from class: com.sendbird.android.shadow.okhttp3.Authenticator.1
        @Override // com.sendbird.android.shadow.okhttp3.Authenticator
        public Request authenticate(Route route, Response response) {
            return null;
        }
    };

    Request authenticate(Route route, Response response) throws IOException;
}
