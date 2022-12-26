package com.microsoft.fraudprotection.androidsdk;

import java.util.Date;
import java.util.List;
import o.isFullSpan;
/* loaded from: classes5.dex */
public class ConfigData {
    @isFullSpan(valueOf = "attributesToBeCollected")
    private List<AttributeType> attributesToBeCollected;
    @isFullSpan(valueOf = "attributesExpiryTime")
    private long cachedAttributesExpiryTime;
    @isFullSpan(valueOf = "configExpiryTime")
    private long configExpiryTime;
    @isFullSpan(valueOf = "shouldSendTelemetry")
    private boolean shouldSendTelemetry = true;
    @isFullSpan(valueOf = "collectAccelerometerReading")
    private boolean collectAccelerometerReading = true;
    @isFullSpan(valueOf = "collectGyroscopeReading")
    private boolean collectGyroscopeReading = true;

    ConfigData() {
    }

    long getConfigExpiryTime() {
        return this.configExpiryTime;
    }

    void setConfigExpiryTime(long j) {
        this.configExpiryTime = j;
    }

    public long getCachedAttributesExpiryTime() {
        return this.cachedAttributesExpiryTime;
    }

    public void setCachedAttributesExpiryTime(long j) {
        this.cachedAttributesExpiryTime = j;
    }

    public boolean shouldSendTelemetry() {
        return this.shouldSendTelemetry;
    }

    public void setShouldSendTelemetry(boolean z) {
        this.shouldSendTelemetry = z;
    }

    public boolean shouldCollectAccelerometerReading() {
        return this.collectAccelerometerReading;
    }

    public void setCollectAccelerometerReading(boolean z) {
        this.collectAccelerometerReading = z;
    }

    public boolean shouldCollectGyroscopeReading() {
        return this.collectGyroscopeReading;
    }

    public void setCollectGyroscopeReading(boolean z) {
        this.collectGyroscopeReading = z;
    }

    public List<AttributeType> getAttributesToBeCollected() {
        return this.attributesToBeCollected;
    }

    void setAttributesToBeCollected(List<AttributeType> list) {
        this.attributesToBeCollected = list;
    }

    public boolean isConfigExpired(long j) {
        return new Date().getTime() - j > this.configExpiryTime;
    }
}
