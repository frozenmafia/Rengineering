package com.app.dream11.model;

import java.util.List;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class Sequence {
    private final List<SequenceInfo> options;
    private final String sectionName;
    private final int sectionPosition;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Sequence copy$default(Sequence sequence, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sequence.sectionName;
        }
        if ((i2 & 2) != 0) {
            i = sequence.sectionPosition;
        }
        if ((i2 & 4) != 0) {
            list = sequence.options;
        }
        return sequence.copy(str, i, list);
    }

    public final String component1() {
        return this.sectionName;
    }

    public final int component2() {
        return this.sectionPosition;
    }

    public final List<SequenceInfo> component3() {
        return this.options;
    }

    public final Sequence copy(String str, int i, List<SequenceInfo> list) {
        runAnimators.ag$a(str, "sectionName");
        runAnimators.ag$a(list, "options");
        return new Sequence(str, i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Sequence) {
            Sequence sequence = (Sequence) obj;
            return runAnimators.values((Object) this.sectionName, (Object) sequence.sectionName) && this.sectionPosition == sequence.sectionPosition && runAnimators.values(this.options, sequence.options);
        }
        return false;
    }

    public int hashCode() {
        return (((this.sectionName.hashCode() * 31) + this.sectionPosition) * 31) + this.options.hashCode();
    }

    public String toString() {
        String str = this.sectionName;
        int i = this.sectionPosition;
        List<SequenceInfo> list = this.options;
        return "Sequence(sectionName=" + str + ", sectionPosition=" + i + ", options=" + list + ")";
    }

    public Sequence(String str, int i, List<SequenceInfo> list) {
        runAnimators.ag$a(str, "sectionName");
        runAnimators.ag$a(list, "options");
        this.sectionName = str;
        this.sectionPosition = i;
        this.options = list;
    }

    public final String getSectionName() {
        return this.sectionName;
    }

    public final int getSectionPosition() {
        return this.sectionPosition;
    }

    public final List<SequenceInfo> getOptions() {
        return this.options;
    }
}
