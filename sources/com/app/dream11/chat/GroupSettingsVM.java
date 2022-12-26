package com.app.dream11.chat;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import com.app.dream11.chat.GroupSettingItem;
import com.app.dream11Pro.R;
import o.m;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupSettingsVM extends BaseObservable {
    private final m<GroupSettingItem> settingItemBinding;
    private ObservableArrayList<GroupSettingItem> settingItemList = new ObservableArrayList<>();
    private ObservableField<Boolean> showProgressBar = new ObservableField<>(false);

    public GroupSettingsVM() {
        m<GroupSettingItem> mVar = m.toString(GroupSettingsVM$$ExternalSyntheticLambda0.INSTANCE);
        runAnimators.ah$a(mVar, "of<GroupSettingItem> { i…_message)\n        }\n    }");
        this.settingItemBinding = mVar;
    }

    public final ObservableArrayList<GroupSettingItem> getSettingItemList() {
        return this.settingItemList;
    }

    public final void setSettingItemList(ObservableArrayList<GroupSettingItem> observableArrayList) {
        runAnimators.ag$a(observableArrayList, "<set-?>");
        this.settingItemList = observableArrayList;
    }

    public final ObservableField<Boolean> getShowProgressBar() {
        return this.showProgressBar;
    }

    public final void setShowProgressBar(ObservableField<Boolean> observableField) {
        runAnimators.ag$a(observableField, "<set-?>");
        this.showProgressBar = observableField;
    }

    public final m<GroupSettingItem> getSettingItemBinding() {
        return this.settingItemBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: settingItemBinding$lambda-0  reason: not valid java name */
    public static final void m99settingItemBinding$lambda0(m mVar, int i, GroupSettingItem groupSettingItem) {
        runAnimators.ag$a(mVar, "itemBinding");
        if (groupSettingItem instanceof GroupSettingItem.SettingAdminOnlyMessageToggle) {
            mVar.ah$a(380, R.layout.res_0x7f0d0113);
        }
    }
}
