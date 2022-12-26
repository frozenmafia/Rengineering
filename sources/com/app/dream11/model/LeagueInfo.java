package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.type.ContestJoinMessageType;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.sendbird.android.constant.StringSet;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import o.isFullSpan;
import o.loadFont;
/* loaded from: classes3.dex */
public class LeagueInfo extends JoinLeagueError implements Serializable {
    private static final long serialVersionUID = 121;
    private int AnalleaguePosition;
    private long AnaltimeSinceRoundLock;
    private String DateOfBirth;
    @isFullSpan(valueOf = "EntryFee", values = {"entryFee"})
    private double EntryFee;
    private int IsGuaranteed;
    private int IsMultiple;
    private int IsRecommended;
    private int JoinedCnt;
    private int LeagueSize;
    private String LeagueType;
    private int MultipleEntry;
    private int NoOfWinners;
    private String ParentLeagueId;
    private double PrizeAmount;
    private String PrizeDistributionTemplateId;
    @isFullSpan(valueOf = "RoundId", values = {HeadToHeadMatchPickerFlowState.ROUND_ID})
    private int RoundId;
    @isFullSpan(valueOf = "TourId", values = {"tourId"})
    private int TourId;
    private ContestJoinMessageType contestJoinMessageType;
    @isFullSpan(valueOf = "promotions", values = {"Promotions"})
    private PromotionsData promotions;
    private int rFreeEntry;
    private int sectionID;
    private int sectionSequenceNumber;
    private String sectionTitle;
    private String selfExclusionTimer;
    private String wlsSlug;
    private String LeagueCategory = "";
    private String leagueSubType = LeagueSubType.DEFAULT.toString();
    private boolean contestToLegacyJoin = true;
    private boolean isQuickJoinActive = false;

    public boolean isPrivateLeague() {
        return StringSet.PRIVATE.equalsIgnoreCase(this.LeagueType);
    }

    public int getSectionID() {
        return this.sectionID;
    }

    public void setSectionID(int i) {
        this.sectionID = i;
    }

    public String getSectionTitle() {
        return this.sectionTitle;
    }

    public void setSectionTitle(String str) {
        this.sectionTitle = str;
    }

    public int getSectionSequenceNumber() {
        return this.sectionSequenceNumber;
    }

    public void setSectionSequenceNumber(int i) {
        this.sectionSequenceNumber = i;
    }

    public Double getEntryFee() {
        return Double.valueOf(this.EntryFee);
    }

    public void setEntryFee(Double d) {
        this.EntryFee = d.doubleValue();
    }

    public String getLeagueCategory() {
        return this.LeagueCategory;
    }

    public void setLeagueCategory(String str) {
        this.LeagueCategory = str;
    }

    public int getLeagueSize() {
        return this.LeagueSize;
    }

    public void setLeagueSize(int i) {
        this.LeagueSize = i;
    }

    public String getLeagueType() {
        return this.LeagueType;
    }

    public void setLeagueType(String str) {
        this.LeagueType = str;
    }

    public String getParentLeagueId() {
        return this.ParentLeagueId;
    }

    public void setParentLeagueId(String str) {
        this.ParentLeagueId = str;
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

    public int getIsMultiple() {
        return this.IsMultiple;
    }

    public void setIsMultiple(int i) {
        this.IsMultiple = i;
    }

    public String getPrizeDistributionTemplateId() {
        return this.PrizeDistributionTemplateId;
    }

    public int getNoOfWinners() {
        return this.NoOfWinners;
    }

    public void setNoOfWinners(int i) {
        this.NoOfWinners = i;
    }

    public double getPrizeAmount() {
        return this.PrizeAmount;
    }

    public void setPrizeAmount(double d) {
        this.PrizeAmount = d;
    }

    public int getIsGuaranteed() {
        return this.IsGuaranteed;
    }

    public void setIsGuaranteed(int i) {
        this.IsGuaranteed = i;
    }

    public int getMultipleEntry() {
        return this.MultipleEntry;
    }

    public void setMultipleEntry(int i) {
        this.MultipleEntry = i;
    }

    public int getIsRecommended() {
        return this.IsRecommended;
    }

    public void setIsRecommended(int i) {
        this.IsRecommended = i;
    }

    public int getrFreeEntry() {
        return this.rFreeEntry;
    }

    public void setrFreeEntry(int i) {
        this.rFreeEntry = i;
    }

    public long getAnaltimeSinceRoundLock() {
        return this.AnaltimeSinceRoundLock;
    }

    public int getAnalleaguePosition() {
        return this.AnalleaguePosition;
    }

    public String getLeagueSubType() {
        return this.leagueSubType;
    }

    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    public void setDateOfBirth(String str) {
        this.DateOfBirth = str;
    }

    public PromotionsData getPromotions() {
        return this.promotions;
    }

    public void setPromotions(PromotionsData promotionsData) {
        this.promotions = promotionsData;
    }

    public Date getSelfExclusionEndtime() {
        return new Date(Long.parseLong(this.selfExclusionTimer));
    }

    public void setSelfExclusionTimer(String str) {
        this.selfExclusionTimer = str;
    }

    public ContestJoinMessageType getContestJoinMessageType() {
        return this.contestJoinMessageType;
    }

    public void setContestJoinMessageType(ContestJoinMessageType contestJoinMessageType) {
        this.contestJoinMessageType = contestJoinMessageType;
    }

    public void setPrizeDistributionTemplateId(String str) {
        this.PrizeDistributionTemplateId = str;
    }

    public boolean isContestToLegacyJoin() {
        return this.contestToLegacyJoin;
    }

    public void setContestToLegacyJoin(boolean z) {
        this.contestToLegacyJoin = z;
    }

    public String getWlsSlug() {
        return this.wlsSlug;
    }

    public void setWlsSlug(String str) {
        this.wlsSlug = str;
    }

    public boolean isQuickJoinActive() {
        return this.isQuickJoinActive;
    }

    public void setQuickJoinActive(boolean z) {
        this.isQuickJoinActive = z;
    }

    public LeagueInfo updateQuickJoinState(boolean z) {
        setQuickJoinActive(z);
        return this;
    }

    public LeagueInfo updateTeamIds(List<Integer> list) {
        if (loadFont.ag$a(list)) {
            setSelectedTeamIds(list);
        }
        return this;
    }
}
