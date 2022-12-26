package com.app.dream11.newmycontests.model;

import java.io.Serializable;
import java.util.List;
import o.setBaselineDistance;
/* loaded from: classes3.dex */
public class MatchesListVm implements Serializable {
    private boolean isPaginationEnable;
    private boolean isRefresh;
    private List<CardVm> matches;
    private int nextPageNo;
    private setBaselineDistance promotionalTourWiseMatchesData;
    private String url;

    public setBaselineDistance getTourWiseMatchesData() {
        return this.promotionalTourWiseMatchesData;
    }

    public void setTourWiseMatchesData(setBaselineDistance setbaselinedistance) {
        this.promotionalTourWiseMatchesData = setbaselinedistance;
    }

    public List<CardVm> getMatches() {
        return this.matches;
    }

    public void setMatches(List<CardVm> list) {
        this.matches = list;
    }

    public boolean isPaginationEnable() {
        return this.isPaginationEnable;
    }

    public void setPaginationEnable(boolean z) {
        this.isPaginationEnable = z;
    }

    public int getNextPageNo() {
        return this.nextPageNo;
    }

    public void setNextPageNo(int i) {
        this.nextPageNo = i;
    }

    public boolean isRefresh() {
        return this.isRefresh;
    }

    public void setRefresh(boolean z) {
        this.isRefresh = z;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
