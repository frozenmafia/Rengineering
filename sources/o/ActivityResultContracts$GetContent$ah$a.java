package o;

import java.lang.ref.WeakReference;
import o.ActivityResultContracts;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ActivityResultContracts$GetContent$ah$a extends WebSocketListener {
    final WeakReference<ActivityResultContracts.GetContent> toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityResultContracts$GetContent$ah$a(ActivityResultContracts.GetContent getContent) {
        this.toString = new WeakReference<>(getContent);
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(WebSocket webSocket, Response response) {
        ActivityResultContracts.GetContent getContent = this.toString.get();
        if (getContent != null) {
            getContent.ag$a();
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, String str) {
        ActivityResultContracts.GetContent getContent = this.toString.get();
        if (getContent != null) {
            getContent.ah$a(getSynchronousResult.ag$a(str));
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        ActivityResultContracts.GetContent getContent = this.toString.get();
        if (getContent != null) {
            getContent.ag$a(th);
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onClosing(WebSocket webSocket, int i, String str) {
        ActivityResultContracts.GetContent getContent = this.toString.get();
        if (getContent != null) {
            getContent.ah$a();
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(WebSocket webSocket, int i, String str) {
        ActivityResultContracts.GetContent getContent = this.toString.get();
        if (getContent != null) {
            getContent.ah$a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf() {
        this.toString.clear();
    }
}
