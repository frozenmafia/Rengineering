package com.sendbird.android.shadow.okhttp3;

import com.sendbird.android.shadow.okio.ByteString;
/* loaded from: classes5.dex */
public interface WebSocket {

    /* loaded from: classes5.dex */
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, String str);

    long queueSize();

    Request request();

    boolean send(ByteString byteString);

    boolean send(String str);
}
