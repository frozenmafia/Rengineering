package com.sendbird.android.shadow.okhttp3.internal.http2;

import com.sendbird.android.shadow.okio.BufferedSource;
import java.io.IOException;
import java.util.List;
/* loaded from: classes5.dex */
public interface PushObserver {
    public static final PushObserver CANCEL = new PushObserver() { // from class: com.sendbird.android.shadow.okhttp3.internal.http2.PushObserver.1
        @Override // com.sendbird.android.shadow.okhttp3.internal.http2.PushObserver
        public boolean onHeaders(int i, List<Header> list, boolean z) {
            return true;
        }

        @Override // com.sendbird.android.shadow.okhttp3.internal.http2.PushObserver
        public boolean onRequest(int i, List<Header> list) {
            return true;
        }

        @Override // com.sendbird.android.shadow.okhttp3.internal.http2.PushObserver
        public void onReset(int i, ErrorCode errorCode) {
        }

        @Override // com.sendbird.android.shadow.okhttp3.internal.http2.PushObserver
        public boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
            bufferedSource.skip(i2);
            return true;
        }
    };

    boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, List<Header> list, boolean z);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}
