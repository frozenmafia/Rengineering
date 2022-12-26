package com.app.dream11.model.viewmodel;

import java.util.List;
/* loaded from: classes6.dex */
public class LeagueFilterViewItem {
    private int filterIndex;
    private String filterType;
    private String infoText;
    private List<FilterOptionViewItem> options;
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

    public List<FilterOptionViewItem> getOptions() {
        return this.options;
    }

    public void setOptions(List<FilterOptionViewItem> list) {
        this.options = list;
    }

    public String getInfoText() {
        return this.infoText;
    }

    public void setInfoText(String str) {
        this.infoText = str;
    }

    public int getFilterIndex() {
        return this.filterIndex;
    }

    public void setFilterIndex(int i) {
        this.filterIndex = i;
    }
}
