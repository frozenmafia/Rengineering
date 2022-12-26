package com.google.firebase.database.core.view;
/* loaded from: classes5.dex */
public interface Event {

    /* loaded from: classes5.dex */
    public enum EventType {
        CHILD_REMOVED,
        CHILD_ADDED,
        CHILD_MOVED,
        CHILD_CHANGED,
        VALUE
    }

    void ag$a();

    String toString();
}
