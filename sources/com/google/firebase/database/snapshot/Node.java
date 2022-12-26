package com.google.firebase.database.snapshot;

import java.util.Iterator;
import o.bindViewHolder;
import o.detachViewAt;
import o.dispatchDetachedFromWindow;
import o.getDecoratedBottom;
import o.getLeftDecorationWidth;
/* loaded from: classes5.dex */
public interface Node extends Comparable<Node>, Iterable<getLeftDecorationWidth> {
    public static final dispatchDetachedFromWindow valueOf = new dispatchDetachedFromWindow() { // from class: com.google.firebase.database.snapshot.Node.2
        @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
        public boolean HaptikSDK$b() {
            return false;
        }

        @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
        public Node HaptikSDK$c() {
            return this;
        }

        @Override // o.dispatchDetachedFromWindow
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // o.dispatchDetachedFromWindow, java.lang.Comparable
        /* renamed from: toString */
        public int compareTo(Node node) {
            return node == this ? 0 : 1;
        }

        @Override // o.dispatchDetachedFromWindow
        public String toString() {
            return "<Max Node>";
        }

        @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
        public boolean valueOf(detachViewAt detachviewat) {
            return false;
        }

        @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
        public Node toString(detachViewAt detachviewat) {
            if (detachviewat.HaptikSDK$b()) {
                return HaptikSDK$c();
            }
            return getDecoratedBottom.HaptikWebView();
        }
    };

    /* loaded from: classes5.dex */
    public enum HashVersion {
        V1,
        V2
    }

    Iterator<getLeftDecorationWidth> HaptikSDK$a();

    boolean HaptikSDK$b();

    Node HaptikSDK$c();

    detachViewAt ag$a(detachViewAt detachviewat);

    Object ah$a();

    boolean invoke();

    String o_();

    Node toString(bindViewHolder bindviewholder);

    Node toString(bindViewHolder bindviewholder, Node node);

    Node toString(detachViewAt detachviewat);

    Object toString(boolean z);

    Node valueOf(detachViewAt detachviewat, Node node);

    String valueOf(HashVersion hashVersion);

    boolean valueOf(detachViewAt detachviewat);

    int values();

    Node values(Node node);
}
