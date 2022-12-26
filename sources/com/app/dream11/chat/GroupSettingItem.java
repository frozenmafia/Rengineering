package com.app.dream11.chat;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public abstract class GroupSettingItem extends BaseObservable {
    public /* synthetic */ GroupSettingItem(getTargetTypes gettargettypes) {
        this();
    }

    private GroupSettingItem() {
    }

    /* loaded from: classes.dex */
    public static final class SettingAdminOnlyMessageToggle extends GroupSettingItem {
        private final Handler handler;
        private boolean isEnabled;
        private final String settingDescription;

        /* loaded from: classes.dex */
        public interface Handler {
            void onAdminMessageOnlyToggled(SettingAdminOnlyMessageToggle settingAdminOnlyMessageToggle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettingAdminOnlyMessageToggle(String str, Handler handler) {
            super(null);
            runAnimators.ag$a(str, "settingDescription");
            runAnimators.ag$a(handler, "handler");
            this.settingDescription = str;
            this.handler = handler;
        }

        public final Handler getHandler() {
            return this.handler;
        }

        public final String getSettingDescription() {
            return this.settingDescription;
        }

        @Bindable
        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final void setEnabled(boolean z) {
            this.isEnabled = z;
            notifyPropertyChanged(97);
        }
    }
}
