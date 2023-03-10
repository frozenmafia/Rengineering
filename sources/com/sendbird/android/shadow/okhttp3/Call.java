package com.sendbird.android.shadow.okhttp3;

import com.sendbird.android.shadow.okio.Timeout;
import java.io.IOException;
/* loaded from: classes5.dex */
public interface Call extends Cloneable {

    /* loaded from: classes5.dex */
    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    Timeout timeout();
}
