package com.app.dream11.myprofile.newprofile.model;

import com.sendbird.android.constant.StringSet;
import java.io.Serializable;
import o.invalidateFullSpansAfter;
import o.isFullSpan;
/* loaded from: classes6.dex */
public class UserLevelInfo implements Serializable {
    private static final long serialVersionUID = -1861505487193517838L;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "current")
    private LevelInfo current;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "isPending")
    private Boolean isPending = false;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = StringSet.next)
    private LevelInfo next;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "nextDonePerc")
    private float progress;

    public void setNext(LevelInfo levelInfo) {
        this.next = levelInfo;
    }

    public void setProgress(float f) {
        this.progress = f;
    }

    public LevelInfo getCurrent() {
        return this.current;
    }

    public void setCurrent(LevelInfo levelInfo) {
        this.current = levelInfo;
    }

    public LevelInfo getNext() {
        return this.next;
    }

    public int getProgress() {
        return (int) this.progress;
    }

    public Boolean getIsPending() {
        return this.isPending;
    }

    public void setIsPending(Boolean bool) {
        this.isPending = bool;
    }

    public String toString() {
        return "UserLevelInfo{current=" + this.current + ", next=" + this.next + ", progress=" + this.progress + ", isPending=" + this.isPending + '}';
    }
}
