package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.events.Event;
import o.startUpdate;
/* loaded from: classes4.dex */
public abstract class Event<T extends Event> {
    private static int sUniqueID;
    private boolean mInitialized;
    private int mSurfaceId;
    private long mTimestampMs;
    private int mUIManagerType;
    private int mUniqueID;
    private int mViewTag;

    public boolean canCoalesce() {
        return true;
    }

    public short getCoalescingKey() {
        return (short) 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getEventCategory() {
        return 2;
    }

    protected WritableMap getEventData() {
        return null;
    }

    public abstract String getEventName();

    public void onDispose() {
    }

    public Event() {
        int i = sUniqueID;
        sUniqueID = i + 1;
        this.mUniqueID = i;
    }

    @Deprecated
    public Event(int i) {
        int i2 = sUniqueID;
        sUniqueID = i2 + 1;
        this.mUniqueID = i2;
        init(i);
    }

    public Event(int i, int i2) {
        int i3 = sUniqueID;
        sUniqueID = i3 + 1;
        this.mUniqueID = i3;
        init(i, i2);
    }

    @Deprecated
    public void init(int i) {
        init(-1, i);
    }

    public void init(int i, int i2) {
        init(i, i2, startUpdate.valueOf());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void init(int i, int i2, long j) {
        this.mSurfaceId = i;
        this.mViewTag = i2;
        this.mUIManagerType = i == -1 ? 1 : 2;
        this.mTimestampMs = j;
        this.mInitialized = true;
    }

    public final int getViewTag() {
        return this.mViewTag;
    }

    public final int getSurfaceId() {
        return this.mSurfaceId;
    }

    public final long getTimestampMs() {
        return this.mTimestampMs;
    }

    public T coalesce(T t) {
        return getTimestampMs() >= t.getTimestampMs() ? this : t;
    }

    public int getUniqueID() {
        return this.mUniqueID;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isInitialized() {
        return this.mInitialized;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void dispose() {
        this.mInitialized = false;
        onDispose();
    }

    public final int getUIManagerType() {
        return this.mUIManagerType;
    }

    @Deprecated
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap eventData = getEventData();
        if (eventData == null) {
            throw new IllegalViewOperationException("Event: you must return a valid, non-null value from `getEventData`, or override `dispatch` and `dispatchModern`. Event: " + getEventName());
        }
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), eventData);
    }

    @Deprecated
    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        WritableMap eventData;
        if (getSurfaceId() != -1 && (eventData = getEventData()) != null) {
            rCTModernEventEmitter.receiveEvent(getSurfaceId(), getViewTag(), getEventName(), canCoalesce(), getCoalescingKey(), eventData, getEventCategory());
        } else {
            dispatch(rCTModernEventEmitter);
        }
    }
}
