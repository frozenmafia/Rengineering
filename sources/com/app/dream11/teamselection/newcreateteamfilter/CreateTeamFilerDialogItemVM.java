package com.app.dream11.teamselection.newcreateteamfilter;

import androidx.databinding.ObservableField;
import java.io.Serializable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class CreateTeamFilerDialogItemVM implements Serializable {
    private boolean checked;
    private transient CreateTeamFilerDialogItemVM$ag$a clickListener;
    private String displayName;
    private String fullName;
    private ObservableField<Boolean> fullNameVisible;
    private Integer squadId;
    private final String teamName;

    public CreateTeamFilerDialogItemVM(String str, String str2, Integer num, boolean z, String str3) {
        this.displayName = str;
        this.fullName = str2;
        this.squadId = num;
        this.checked = z;
        this.teamName = str3;
        ObservableField<Boolean> observableField = new ObservableField<>(true);
        this.fullNameVisible = observableField;
        String str4 = this.fullName;
        observableField.set(Boolean.valueOf((str4 == null ? 0 : str4.length()) > 0));
    }

    public /* synthetic */ CreateTeamFilerDialogItemVM(String str, String str2, Integer num, boolean z, String str3, int i, getTargetTypes gettargettypes) {
        this(str, str2, num, z, (i & 16) != 0 ? str : str3);
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final Integer getSquadId() {
        return this.squadId;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setFullName(String str) {
        this.fullName = str;
    }

    public final void setSquadId(Integer num) {
        this.squadId = num;
    }

    public final CreateTeamFilerDialogItemVM$ag$a getClickListener() {
        return this.clickListener;
    }

    public final void setClickListener(CreateTeamFilerDialogItemVM$ag$a createTeamFilerDialogItemVM$ag$a) {
        this.clickListener = createTeamFilerDialogItemVM$ag$a;
    }

    public final ObservableField<Boolean> getFullNameVisible() {
        return this.fullNameVisible;
    }

    public final void setFullNameVisible(ObservableField<Boolean> observableField) {
        runAnimators.ag$a(observableField, "<set-?>");
        this.fullNameVisible = observableField;
    }
}
