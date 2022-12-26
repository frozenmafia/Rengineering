package o;

import com.google.firebase.database.tubesock.WebSocket;
import com.google.firebase.database.tubesock.WebSocketException;
import java.io.EOFException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import o.stopScroll;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class stopScroll$ag$a implements stopScroll.values, isSmoothScrolling {
    private WebSocket ah$a;
    final /* synthetic */ stopScroll values;

    private stopScroll$ag$a(stopScroll stopscroll, WebSocket webSocket) {
        this.values = stopscroll;
        this.ah$a = webSocket;
        webSocket.ah$a(this);
    }

    @Override // o.isSmoothScrolling
    public void valueOf() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.values.HaptikSDK$b;
        scheduledExecutorService.execute(new Runnable() { // from class: o.stopScroll$ag$a.4
            @Override // java.lang.Runnable
            public void run() {
                ScheduledFuture scheduledFuture;
                detachAndScrapView detachandscrapview;
                detachAndScrapView detachandscrapview2;
                scheduledFuture = stopScroll$ag$a.this.values.ag$a;
                scheduledFuture.cancel(false);
                stopScroll$ag$a.this.values.HaptikSDK$c = true;
                detachandscrapview = stopScroll$ag$a.this.values.getInitSettings;
                if (detachandscrapview.ah$a()) {
                    detachandscrapview2 = stopScroll$ag$a.this.values.getInitSettings;
                    detachandscrapview2.toString("websocket opened", new Object[0]);
                }
                stopScroll$ag$a.this.values.HaptikSDK$c();
            }
        });
    }

    @Override // o.isSmoothScrolling
    public void toString(isItemPrefetchEnabled isitemprefetchenabled) {
        detachAndScrapView detachandscrapview;
        ScheduledExecutorService scheduledExecutorService;
        detachAndScrapView detachandscrapview2;
        final String ag$a = isitemprefetchenabled.ag$a();
        detachandscrapview = this.values.getInitSettings;
        if (detachandscrapview.ah$a()) {
            detachandscrapview2 = this.values.getInitSettings;
            detachandscrapview2.toString("ws message: " + ag$a, new Object[0]);
        }
        scheduledExecutorService = this.values.HaptikSDK$b;
        scheduledExecutorService.execute(new Runnable() { // from class: o.stopScroll$ag$a.3
            @Override // java.lang.Runnable
            public void run() {
                stopScroll$ag$a.this.values.toString(ag$a);
            }
        });
    }

    @Override // o.isSmoothScrolling
    public void values() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.values.HaptikSDK$b;
        scheduledExecutorService.execute(new Runnable() { // from class: o.stopScroll$ag$a.1
            @Override // java.lang.Runnable
            public void run() {
                detachAndScrapView detachandscrapview;
                detachAndScrapView detachandscrapview2;
                detachandscrapview = stopScroll$ag$a.this.values.getInitSettings;
                if (detachandscrapview.ah$a()) {
                    detachandscrapview2 = stopScroll$ag$a.this.values.getInitSettings;
                    detachandscrapview2.toString("closed", new Object[0]);
                }
                stopScroll$ag$a.this.values.invoke();
            }
        });
    }

    @Override // o.isSmoothScrolling
    public void ah$a(final WebSocketException webSocketException) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.values.HaptikSDK$b;
        scheduledExecutorService.execute(new Runnable() { // from class: o.stopScroll$ag$a.5
            @Override // java.lang.Runnable
            public void run() {
                detachAndScrapView detachandscrapview;
                detachAndScrapView detachandscrapview2;
                if (webSocketException.getCause() == null || !(webSocketException.getCause() instanceof EOFException)) {
                    detachandscrapview = stopScroll$ag$a.this.values.getInitSettings;
                    detachandscrapview.ag$a("WebSocket error.", webSocketException, new Object[0]);
                } else {
                    detachandscrapview2 = stopScroll$ag$a.this.values.getInitSettings;
                    detachandscrapview2.toString("WebSocket reached EOF.", new Object[0]);
                }
                stopScroll$ag$a.this.values.invoke();
            }
        });
    }

    @Override // o.stopScroll.values
    public void ag$a(String str) {
        this.ah$a.ah$a(str);
    }

    @Override // o.stopScroll.values
    public void ah$a() {
        this.ah$a.ah$a();
    }

    private void invoke() {
        detachAndScrapView detachandscrapview;
        this.ah$a.ah$a();
        try {
            this.ah$a.ag$a();
        } catch (InterruptedException e) {
            detachandscrapview = this.values.getInitSettings;
            detachandscrapview.toString("Interrupted while shutting down websocket threads", e);
        }
    }

    @Override // o.stopScroll.values
    public void ag$a() {
        detachAndScrapView detachandscrapview;
        detachAndScrapView detachandscrapview2;
        try {
            this.ah$a.HaptikSDK$b();
        } catch (WebSocketException e) {
            detachandscrapview = this.values.getInitSettings;
            if (detachandscrapview.ah$a()) {
                detachandscrapview2 = this.values.getInitSettings;
                detachandscrapview2.ag$a("Error connecting", e, new Object[0]);
            }
            invoke();
        }
    }
}
