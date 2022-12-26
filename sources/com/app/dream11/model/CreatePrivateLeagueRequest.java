package com.app.dream11.model;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import o.isFullSpan;
import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class CreatePrivateLeagueRequest extends CommonRequest {
    @isFullSpan(valueOf = "entryFee")
    String EntryFee;
    @isFullSpan(valueOf = "isMultipleEntry")
    boolean IsMultipleEntry;
    @isFullSpan(valueOf = "contestName")
    String LeagueName;
    @isFullSpan(valueOf = "contestSize")
    String LeagueSize;
    private int RoundId;
    private int TourId;
    @isFullSpan(valueOf = "noOfWinners")
    String WinnerCount;
    @isFullSpan(valueOf = "prizeAmount")
    String WinningAmt;
    private String channelUrl;
    private String flow;
    private boolean isDynamicContest;
    private boolean isNewPrivateContest;
    private int templateId;
    private String wlsSlug;

    public CreatePrivateLeagueRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
        this.WinnerCount = SessionDescription.SUPPORTED_SDP_VERSION;
        this.channelUrl = "";
        this.templateId = 0;
        this.isNewPrivateContest = false;
        this.isDynamicContest = false;
        this.flow = "";
    }

    public String getWinningAmt() {
        return this.WinningAmt;
    }

    public void setWinningAmt(String str) {
        this.WinningAmt = str;
    }

    public String getLeagueSize() {
        return this.LeagueSize;
    }

    public void setLeagueSize(String str) {
        this.LeagueSize = str;
    }

    public String getEntryFee() {
        return this.EntryFee;
    }

    public void setEntryFee(String str) {
        this.EntryFee = str;
    }

    public boolean getIsMultipleEntry() {
        return this.IsMultipleEntry;
    }

    public void setIsMultipleEntry(boolean z) {
        this.IsMultipleEntry = z;
    }

    public String getLeagueName() {
        return this.LeagueName;
    }

    public void setLeagueName(String str) {
        this.LeagueName = str;
    }

    public int getRoundId() {
        return this.RoundId;
    }

    public void setRoundId(int i) {
        this.RoundId = i;
    }

    public int getTourId() {
        return this.TourId;
    }

    public void setTourId(int i) {
        this.TourId = i;
    }

    public String getWinnerCount() {
        return this.WinnerCount;
    }

    public void setWinnerCount(String str) {
        this.WinnerCount = str;
    }

    public int getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(int i) {
        this.templateId = i;
    }

    public void setNewPrivateContest(boolean z) {
        this.isNewPrivateContest = z;
    }

    public boolean isNewPrivateContest() {
        return this.isNewPrivateContest;
    }

    public String getFlow() {
        return this.flow;
    }

    public void setFlow(String str) {
        this.flow = str;
    }

    public String getChannelUrl() {
        return this.channelUrl;
    }

    public void setChannelUrl(String str) {
        this.channelUrl = str;
    }

    public String getWlsSlug() {
        return this.wlsSlug;
    }

    public void setWlsSlug(String str) {
        this.wlsSlug = str;
    }

    public void setDynamicContest(boolean z) {
        this.isDynamicContest = z;
    }

    public boolean isDynamicContest() {
        return this.isDynamicContest;
    }
}
