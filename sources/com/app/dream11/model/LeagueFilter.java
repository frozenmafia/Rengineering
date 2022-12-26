package com.app.dream11.model;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public class LeagueFilter {
    private String filterType;
    private List<InfoTextModel> infoText;
    private List<FilterOption> options;
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getFilterType() {
        return this.filterType;
    }

    public void setFilterType(String str) {
        this.filterType = str;
    }

    public List<FilterOption> getOptions() {
        return this.options;
    }

    public void setOptions(List<FilterOption> list) {
        this.options = list;
    }

    public List<InfoTextModel> getInfoText() {
        return this.infoText;
    }

    public void setInfoText(List<InfoTextModel> list) {
        this.infoText = list;
    }

    /* renamed from: clone */
    public LeagueFilter m992clone() {
        LeagueFilter leagueFilter = new LeagueFilter();
        leagueFilter.setTitle(this.title);
        leagueFilter.setFilterType(this.filterType);
        leagueFilter.setInfoText(this.infoText);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.options);
        leagueFilter.setOptions(arrayList);
        return leagueFilter;
    }
}
