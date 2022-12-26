package o;

import java.util.Calendar;
/* loaded from: classes.dex */
public class getEmbeddedMenuWidthLimit {
    private int errorCode;
    private long syncTime;
    private String errorMsg = "";
    private long cacheTime = 3600000;

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public long getCacheTime() {
        return this.cacheTime;
    }

    public void setCacheTime(int i) {
        this.cacheTime = i;
    }

    public long getSyncTime() {
        return this.syncTime;
    }

    public void setSyncTime(long j) {
        this.syncTime = j;
    }

    public boolean IsCacheExpired() {
        return this.syncTime + this.cacheTime < Calendar.getInstance().getTimeInMillis();
    }
}
