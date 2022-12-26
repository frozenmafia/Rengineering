package com.google.firebase.database.connection;

import com.google.firebase.database.logging.Logger;
import com.sendbird.android.constant.StringSet;
import java.util.HashMap;
import java.util.Map;
import o.detachAndScrapView;
import o.setScrollingTouchSlop;
import o.stopInterceptRequestLayout;
import o.stopScroll;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class Connection implements stopScroll.toString {
    private static long ah$a;
    private State HaptikSDK$c;
    private setScrollingTouchSlop ag$a;
    private toString toString;
    private stopScroll valueOf;
    private final detachAndScrapView values;

    /* loaded from: classes5.dex */
    public enum DisconnectReason {
        SERVER_RESET,
        OTHER
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum State {
        REALTIME_CONNECTING,
        REALTIME_CONNECTED,
        REALTIME_DISCONNECTED
    }

    /* loaded from: classes5.dex */
    public interface toString {
        void toString(String str);

        void toString(Map<String, Object> map);

        void valueOf(long j, String str);

        void valueOf(String str);

        void values(DisconnectReason disconnectReason);
    }

    public Connection(stopInterceptRequestLayout stopinterceptrequestlayout, setScrollingTouchSlop setscrollingtouchslop, String str, toString tostring, String str2) {
        long j = ah$a;
        ah$a = 1 + j;
        this.ag$a = setscrollingtouchslop;
        this.toString = tostring;
        Logger HaptikSDK$c = stopinterceptrequestlayout.HaptikSDK$c();
        this.values = new detachAndScrapView(HaptikSDK$c, "Connection", "conn_" + j);
        this.HaptikSDK$c = State.REALTIME_CONNECTING;
        this.valueOf = new stopScroll(stopinterceptrequestlayout, setscrollingtouchslop, str, this, str2);
    }

    public void ah$a() {
        if (this.values.ah$a()) {
            this.values.toString("Opening a connection", new Object[0]);
        }
        this.valueOf.ah$a();
    }

    public void ah$a(DisconnectReason disconnectReason) {
        if (this.HaptikSDK$c != State.REALTIME_DISCONNECTED) {
            if (this.values.ah$a()) {
                this.values.toString("closing realtime connection", new Object[0]);
            }
            this.HaptikSDK$c = State.REALTIME_DISCONNECTED;
            stopScroll stopscroll = this.valueOf;
            if (stopscroll != null) {
                stopscroll.valueOf();
                this.valueOf = null;
            }
            this.toString.values(disconnectReason);
        }
    }

    public void valueOf() {
        ah$a(DisconnectReason.OTHER);
    }

    public void ag$a(Map<String, Object> map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("t", "d");
        hashMap.put("d", map);
        toString(hashMap, z);
    }

    @Override // o.stopScroll.toString
    public void ag$a(Map<String, Object> map) {
        try {
            String str = (String) map.get("t");
            if (str != null) {
                if (str.equals("d")) {
                    ah$a((Map) map.get("d"));
                    return;
                } else if (str.equals("c")) {
                    valueOf((Map) map.get("d"));
                    return;
                } else if (this.values.ah$a()) {
                    detachAndScrapView detachandscrapview = this.values;
                    detachandscrapview.toString("Ignoring unknown server message type: " + str, new Object[0]);
                    return;
                } else {
                    return;
                }
            }
            if (this.values.ah$a()) {
                detachAndScrapView detachandscrapview2 = this.values;
                detachandscrapview2.toString("Failed to parse server message: missing message type:" + map.toString(), new Object[0]);
            }
            valueOf();
        } catch (ClassCastException e) {
            if (this.values.ah$a()) {
                detachAndScrapView detachandscrapview3 = this.values;
                detachandscrapview3.toString("Failed to parse server message: " + e.toString(), new Object[0]);
            }
            valueOf();
        }
    }

    @Override // o.stopScroll.toString
    public void values(boolean z) {
        this.valueOf = null;
        if (!z && this.HaptikSDK$c == State.REALTIME_CONNECTING) {
            if (this.values.ah$a()) {
                this.values.toString("Realtime connection failed", new Object[0]);
            }
        } else if (this.values.ah$a()) {
            this.values.toString("Realtime connection lost", new Object[0]);
        }
        valueOf();
    }

    private void ah$a(Map<String, Object> map) {
        if (this.values.ah$a()) {
            detachAndScrapView detachandscrapview = this.values;
            detachandscrapview.toString("received data message: " + map.toString(), new Object[0]);
        }
        this.toString.toString(map);
    }

    private void valueOf(Map<String, Object> map) {
        if (this.values.ah$a()) {
            detachAndScrapView detachandscrapview = this.values;
            detachandscrapview.toString("Got control message: " + map.toString(), new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str != null) {
                if (str.equals(StringSet.s)) {
                    valueOf((String) map.get("d"));
                    return;
                } else if (str.equals("r")) {
                    values((String) map.get("d"));
                    return;
                } else if (str.equals("h")) {
                    values((Map) map.get("d"));
                    return;
                } else if (this.values.ah$a()) {
                    detachAndScrapView detachandscrapview2 = this.values;
                    detachandscrapview2.toString("Ignoring unknown control message: " + str, new Object[0]);
                    return;
                } else {
                    return;
                }
            }
            if (this.values.ah$a()) {
                detachAndScrapView detachandscrapview3 = this.values;
                detachandscrapview3.toString("Got invalid control message: " + map.toString(), new Object[0]);
            }
            valueOf();
        } catch (ClassCastException e) {
            if (this.values.ah$a()) {
                detachAndScrapView detachandscrapview4 = this.values;
                detachandscrapview4.toString("Failed to parse control message: " + e.toString(), new Object[0]);
            }
            valueOf();
        }
    }

    private void valueOf(String str) {
        if (this.values.ah$a()) {
            this.values.toString("Connection shutdown command received. Shutting down...", new Object[0]);
        }
        this.toString.toString(str);
        valueOf();
    }

    private void values(Map<String, Object> map) {
        long longValue = ((Long) map.get(StringSet.ts)).longValue();
        this.toString.valueOf((String) map.get("h"));
        String str = (String) map.get(StringSet.s);
        if (this.HaptikSDK$c == State.REALTIME_CONNECTING) {
            this.valueOf.values();
            valueOf(longValue, str);
        }
    }

    private void valueOf(long j, String str) {
        if (this.values.ah$a()) {
            this.values.toString("realtime connection established", new Object[0]);
        }
        this.HaptikSDK$c = State.REALTIME_CONNECTED;
        this.toString.valueOf(j, str);
    }

    private void values(String str) {
        if (this.values.ah$a()) {
            detachAndScrapView detachandscrapview = this.values;
            detachandscrapview.toString("Got a reset; killing connection to " + this.ag$a.ah$a() + "; Updating internalHost to " + str, new Object[0]);
        }
        this.toString.valueOf(str);
        ah$a(DisconnectReason.SERVER_RESET);
    }

    private void toString(Map<String, Object> map, boolean z) {
        if (this.HaptikSDK$c != State.REALTIME_CONNECTED) {
            this.values.toString("Tried to send on an unconnected connection", new Object[0]);
            return;
        }
        if (z) {
            this.values.toString("Sending data (contents hidden)", new Object[0]);
        } else {
            this.values.toString("Sending data: %s", map);
        }
        this.valueOf.toString(map);
    }
}
