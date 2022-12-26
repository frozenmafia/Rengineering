package com.app.dream11.contest;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;
import com.app.dream11.contest.FilterConstants;
import com.app.dream11.core.service.graphql.api.type.ContestFilterInput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import o.loadFont;
/* loaded from: classes.dex */
public class FilterData extends BaseObservable implements Serializable {
    private String activeScreenName;
    boolean isApplyButtonEnabled;
    private String perfTrackerSource;
    List<FilterConstants.ContestTypeFilter> selectedContestTypeFilter;
    List<FilterConstants.EntryFilter> selectedEntryFilters;
    List<FilterConstants.PrizeFilter> selectedPrizeFilters;
    List<FilterConstants.SpotsFilter> selectedSpotsFilters;

    public FilterData() {
        init();
    }

    private void init() {
        setSelectedEntryFilters(Collections.emptyList());
        setSelectedSpotsFilters(Collections.emptyList());
        setSelectedPrizeFilters(Collections.emptyList());
        setSelectedContestTypeFilter(Collections.emptyList());
    }

    @Bindable
    public List<FilterConstants.EntryFilter> getSelectedEntryFilters() {
        return this.selectedEntryFilters;
    }

    public void setSelectedEntryFilters(List<FilterConstants.EntryFilter> list) {
        this.selectedEntryFilters = Collections.unmodifiableList(list);
        notifyPropertyChanged(370);
    }

    @Bindable
    public List<FilterConstants.SpotsFilter> getSelectedSpotsFilters() {
        return this.selectedSpotsFilters;
    }

    public void setSelectedSpotsFilters(List<FilterConstants.SpotsFilter> list) {
        this.selectedSpotsFilters = Collections.unmodifiableList(list);
        notifyPropertyChanged(373);
    }

    @Bindable
    public List<FilterConstants.PrizeFilter> getSelectedPrizeFilters() {
        return this.selectedPrizeFilters;
    }

    public void setSelectedPrizeFilters(List<FilterConstants.PrizeFilter> list) {
        this.selectedPrizeFilters = Collections.unmodifiableList(list);
        notifyPropertyChanged(372);
    }

    @Bindable
    public List<FilterConstants.ContestTypeFilter> getSelectedContestTypeFilter() {
        return this.selectedContestTypeFilter;
    }

    public void setSelectedContestTypeFilter(List<FilterConstants.ContestTypeFilter> list) {
        this.selectedContestTypeFilter = Collections.unmodifiableList(list);
        notifyPropertyChanged(BR.selectedContestTypeFilter);
    }

    public void reset() {
        init();
    }

    public void setApplyButtonState(boolean z) {
        this.isApplyButtonEnabled = z;
        notifyPropertyChanged(7);
    }

    @Bindable
    public boolean getApplyButtonState() {
        return this.isApplyButtonEnabled;
    }

    /* renamed from: clone */
    public FilterData m978clone() {
        FilterData filterData = new FilterData();
        filterData.setSelectedContestTypeFilter(getSelectedContestTypeFilter());
        filterData.setSelectedPrizeFilters(getSelectedPrizeFilters());
        filterData.setSelectedSpotsFilters(getSelectedSpotsFilters());
        filterData.setSelectedEntryFilters(getSelectedEntryFilters());
        filterData.setPerfParams(this.perfTrackerSource, this.activeScreenName);
        return filterData;
    }

    public FilterData setPerfParams(String str, String str2) {
        this.perfTrackerSource = str;
        this.activeScreenName = str2;
        return this;
    }

    public boolean isEmpty() {
        return (loadFont.ag$a(this.selectedEntryFilters) || loadFont.ag$a(this.selectedSpotsFilters) || loadFont.ag$a(this.selectedPrizeFilters) || loadFont.ag$a(this.selectedContestTypeFilter)) ? false : true;
    }

    public List<ContestFilterInput> getFilters() {
        ArrayList<FilterConstants.toString> arrayList = new ArrayList();
        arrayList.addAll(this.selectedEntryFilters);
        arrayList.addAll(this.selectedPrizeFilters);
        arrayList.addAll(this.selectedSpotsFilters);
        arrayList.addAll(this.selectedContestTypeFilter);
        ArrayList arrayList2 = new ArrayList();
        if (loadFont.ag$a(arrayList)) {
            for (FilterConstants.toString tostring : arrayList) {
                if (tostring.getFilterOption() != null && tostring.getFilterValue() != null) {
                    arrayList2.add(new ContestFilterInput(tostring.getFilterOption(), tostring.getFilterValue()));
                }
            }
        }
        return arrayList2;
    }

    public List<Pair<String, String>> getDisplayFilters() {
        ArrayList<FilterConstants.toString> arrayList = new ArrayList();
        arrayList.addAll(this.selectedEntryFilters);
        arrayList.addAll(this.selectedPrizeFilters);
        arrayList.addAll(this.selectedSpotsFilters);
        arrayList.addAll(this.selectedContestTypeFilter);
        ArrayList arrayList2 = new ArrayList();
        if (loadFont.ag$a(arrayList)) {
            for (FilterConstants.toString tostring : arrayList) {
                arrayList2.add(new Pair(tostring.getFilterOption().name(), tostring.displayText()));
            }
        }
        return arrayList2;
    }

    public String getPerfTrackerSource() {
        return this.perfTrackerSource;
    }

    public String getActiveScreenName() {
        return this.activeScreenName;
    }
}
