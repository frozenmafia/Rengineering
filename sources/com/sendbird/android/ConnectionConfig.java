package com.sendbird.android;

import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
/* loaded from: classes.dex */
class ConnectionConfig {
    private static final int DEFAULT_BACKGROUND_CONNECTION_DURATION_MS = 500;
    private static final float DEFAULT_INTERVAL = 3.0f;
    private static final float DEFAULT_MAX_INTERVAL = 24.0f;
    private static final int DEFAULT_MULTIPLIER = 2;
    private static final int DEFAULT_PING_INTERVAL_MS = 15000;
    private static final int DEFAULT_PONG_TIMEOUT_MS = 5000;
    private static final int DEFAULT_RETRY_CUONT = 5;
    private static final int DEFAULT_UNREAD_COUNT_ON_SUPER_GROUP = 1;
    private float baseInterval = DEFAULT_INTERVAL;
    private float maxInterval = DEFAULT_MAX_INTERVAL;
    private int multiplier = 2;
    private int maxRetryCount = 5;
    private int pingInterval = DEFAULT_PING_INTERVAL_MS;
    private int pongTimeout = 5000;
    private long lastConnectedAt = 0;
    private long bcDuration = 500;
    private int maxUnreadCountOnSuperGroup = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getDefaultBgConnectionDurationMs() {
        return 500;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConnectionConfig() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConnectionConfig(JsonObject jsonObject) {
        upsert(jsonObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void upsert(JsonObject jsonObject) {
        if (jsonObject.has(StringSet.ping_interval)) {
            this.pingInterval = jsonObject.get(StringSet.ping_interval).getAsInt() * 1000;
        }
        if (jsonObject.has(StringSet.pong_timeout) && jsonObject.get(StringSet.pong_timeout).isJsonPrimitive()) {
            this.pongTimeout = jsonObject.get(StringSet.pong_timeout).getAsInt() * 1000;
        }
        if (jsonObject.has(StringSet.login_ts) && jsonObject.get(StringSet.login_ts).isJsonPrimitive()) {
            this.lastConnectedAt = jsonObject.get(StringSet.login_ts).getAsLong();
        }
        if (jsonObject.has(StringSet.max_unread_cnt_on_super_group)) {
            this.maxUnreadCountOnSuperGroup = jsonObject.get(StringSet.max_unread_cnt_on_super_group).getAsInt();
        }
        if (jsonObject.has(StringSet.bc_duration) && jsonObject.get(StringSet.bc_duration).isJsonPrimitive()) {
            long asInt = jsonObject.get(StringSet.bc_duration).getAsInt();
            this.bcDuration = asInt;
            int i = (asInt > 0L ? 1 : (asInt == 0L ? 0 : -1));
            if (i == 0) {
                this.bcDuration = 500L;
            } else if (i > 0) {
                this.bcDuration = asInt * 1000;
            }
        }
        if (jsonObject.has(StringSet.reconnect) && jsonObject.get(StringSet.reconnect).isJsonObject()) {
            JsonObject asJsonObject = jsonObject.get(StringSet.reconnect).getAsJsonObject();
            if (asJsonObject.has(StringSet.interval)) {
                this.baseInterval = Math.round(asJsonObject.get(StringSet.interval).getAsFloat() * 10.0f) / 10.0f;
            }
            if (asJsonObject.has(StringSet.max_interval)) {
                this.maxInterval = asJsonObject.get(StringSet.max_interval).getAsFloat();
            }
            if (asJsonObject.has(StringSet.mul)) {
                this.multiplier = asJsonObject.get(StringSet.mul).getAsInt();
            }
            if (asJsonObject.has(StringSet.retry_cnt)) {
                this.maxRetryCount = asJsonObject.get(StringSet.retry_cnt).getAsInt();
            }
        }
    }

    float getBackoffPeriod() {
        return this.multiplier;
    }

    float getBaseInterval() {
        return this.baseInterval;
    }

    float getMaxInterval() {
        return this.maxInterval;
    }

    int getMultiplier() {
        return this.multiplier;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMaxRetryCount() {
        return this.maxRetryCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getPingInterval() {
        return this.pingInterval;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getPongTimeout() {
        return this.pongTimeout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getLastConnectedAt() {
        return this.lastConnectedAt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getBcDuration() {
        return this.bcDuration;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getRetryDelayMillis(int i) {
        return Math.min(i == 0 ? 0.0f : this.maxInterval, this.baseInterval + (i * this.multiplier)) * 1000.0f;
    }

    public int getMaxUnreadCountOnSuperGroup() {
        return this.maxUnreadCountOnSuperGroup;
    }

    public String toString() {
        return "ConnectionConfig{DEFAULT_INTERVAL=3.0, DEFAULT_MAX_INTERVAL=24.0, DEFAULT_MULTIPLIER=2, DEFAULT_RETRY_CUONT=5, baseInterval=" + this.baseInterval + ", maxInterval=" + this.maxInterval + ", multiplier=" + this.multiplier + ", maxRetryCount=" + this.maxRetryCount + ", pingInterval=" + this.pingInterval + ", pongTimeout=" + this.pongTimeout + ", lastConnectedAt=" + this.lastConnectedAt + ", maxUnreadCountOnSuperGroup=" + this.maxUnreadCountOnSuperGroup + ", bcDuration=" + this.bcDuration + '}';
    }
}
