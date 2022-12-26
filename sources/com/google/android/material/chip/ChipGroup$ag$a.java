package com.google.android.material.chip;

import android.widget.CompoundButton;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ChipGroup$ag$a implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ ChipGroup ag$a;

    private ChipGroup$ag$a(ChipGroup chipGroup) {
        this.ag$a = chipGroup;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (ChipGroup.values(this.ag$a)) {
            return;
        }
        if (this.ag$a.values().isEmpty() && ChipGroup.ah$a(this.ag$a)) {
            ChipGroup.ag$a(this.ag$a, compoundButton.getId(), true);
            ChipGroup.values(this.ag$a, compoundButton.getId(), false);
            return;
        }
        int id = compoundButton.getId();
        if (z) {
            if (ChipGroup.valueOf(this.ag$a) != -1 && ChipGroup.valueOf(this.ag$a) != id && ChipGroup.toString(this.ag$a)) {
                ChipGroup chipGroup = this.ag$a;
                ChipGroup.ag$a(chipGroup, ChipGroup.valueOf(chipGroup), false);
            }
            ChipGroup.ah$a(this.ag$a, id);
        } else if (ChipGroup.valueOf(this.ag$a) == id) {
            ChipGroup.ah$a(this.ag$a, -1);
        }
    }
}
