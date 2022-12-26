package okhttp3;

import com.sendbird.android.constant.StringSet;
import o.runAnimators;
import okio.ByteString;
/* loaded from: classes5.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i, String str) {
        runAnimators.ag$a(webSocket, "webSocket");
        runAnimators.ag$a(str, StringSet.reason);
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
        runAnimators.ag$a(webSocket, "webSocket");
        runAnimators.ag$a(str, StringSet.reason);
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        runAnimators.ag$a(webSocket, "webSocket");
        runAnimators.ag$a(th, "t");
    }

    public void onMessage(WebSocket webSocket, String str) {
        runAnimators.ag$a(webSocket, "webSocket");
        runAnimators.ag$a(str, "text");
    }

    public void onMessage(WebSocket webSocket, ByteString byteString) {
        runAnimators.ag$a(webSocket, "webSocket");
        runAnimators.ag$a(byteString, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        runAnimators.ag$a(webSocket, "webSocket");
        runAnimators.ag$a(response, "response");
    }
}
