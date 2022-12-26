package com.app.dream11.ui.picker;

import androidx.databinding.ObservableField;
import java.io.Serializable;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class PickerModel implements Serializable {
    private final String displayText;
    private final int id;
    private final ObservableField<Boolean> isSelected;
    private transient valueOf listener;
    private transient Styleable.ArcMotion<setAnimationMatrix> onItemClick;

    /* loaded from: classes3.dex */
    public interface valueOf {
        void valueOf(PickerModel pickerModel);
    }

    public PickerModel(int i, String str, boolean z) {
        runAnimators.ag$a(str, "displayText");
        this.id = i;
        this.displayText = str;
        this.isSelected = new ObservableField<>(Boolean.valueOf(z));
        this.onItemClick = new PickerModel$onItemClick$1(this);
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final int getId() {
        return this.id;
    }

    public final ObservableField<Boolean> isSelected() {
        return this.isSelected;
    }

    public final valueOf getListener() {
        return this.listener;
    }

    public final void setListener(valueOf valueof) {
        this.listener = valueof;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> getOnItemClick() {
        return this.onItemClick;
    }

    public final void setOnItemClick(Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        runAnimators.ag$a(arcMotion, "<set-?>");
        this.onItemClick = arcMotion;
    }
}
