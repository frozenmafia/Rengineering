package com.app.dream11.model;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class SequenceInfo {
    private final String instrumentName;
    private final boolean isEnabled;
    private final String message;
    private Meta meta;
    private final int overallPosition;
    private final int relativePosition;
    private String sectionName;
    private int sectionPosition;

    public final int component1() {
        return this.relativePosition;
    }

    public final String component2() {
        return this.instrumentName;
    }

    public final String component3() {
        return this.message;
    }

    public final boolean component4() {
        return this.isEnabled;
    }

    public final int component5() {
        return this.overallPosition;
    }

    public final String component6() {
        return this.sectionName;
    }

    public final int component7() {
        return this.sectionPosition;
    }

    public final Meta component8() {
        return this.meta;
    }

    public final SequenceInfo copy(int i, String str, String str2, boolean z, int i2, String str3, int i3, Meta meta) {
        runAnimators.ag$a(str, "instrumentName");
        runAnimators.ag$a(str2, "message");
        runAnimators.ag$a(str3, "sectionName");
        return new SequenceInfo(i, str, str2, z, i2, str3, i3, meta);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SequenceInfo) {
            SequenceInfo sequenceInfo = (SequenceInfo) obj;
            return this.relativePosition == sequenceInfo.relativePosition && runAnimators.values((Object) this.instrumentName, (Object) sequenceInfo.instrumentName) && runAnimators.values((Object) this.message, (Object) sequenceInfo.message) && this.isEnabled == sequenceInfo.isEnabled && this.overallPosition == sequenceInfo.overallPosition && runAnimators.values((Object) this.sectionName, (Object) sequenceInfo.sectionName) && this.sectionPosition == sequenceInfo.sectionPosition && runAnimators.values(this.meta, sequenceInfo.meta);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.relativePosition;
        int hashCode = this.instrumentName.hashCode();
        int hashCode2 = this.message.hashCode();
        boolean z = this.isEnabled;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = this.overallPosition;
        int hashCode3 = this.sectionName.hashCode();
        int i4 = this.sectionPosition;
        Meta meta = this.meta;
        return (((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i2) * 31) + i3) * 31) + hashCode3) * 31) + i4) * 31) + (meta == null ? 0 : meta.hashCode());
    }

    public String toString() {
        int i = this.relativePosition;
        String str = this.instrumentName;
        String str2 = this.message;
        boolean z = this.isEnabled;
        int i2 = this.overallPosition;
        String str3 = this.sectionName;
        int i3 = this.sectionPosition;
        Meta meta = this.meta;
        return "SequenceInfo(relativePosition=" + i + ", instrumentName=" + str + ", message=" + str2 + ", isEnabled=" + z + ", overallPosition=" + i2 + ", sectionName=" + str3 + ", sectionPosition=" + i3 + ", meta=" + meta + ")";
    }

    public SequenceInfo(int i, String str, String str2, boolean z, int i2, String str3, int i3, Meta meta) {
        runAnimators.ag$a(str, "instrumentName");
        runAnimators.ag$a(str2, "message");
        runAnimators.ag$a(str3, "sectionName");
        this.relativePosition = i;
        this.instrumentName = str;
        this.message = str2;
        this.isEnabled = z;
        this.overallPosition = i2;
        this.sectionName = str3;
        this.sectionPosition = i3;
        this.meta = meta;
    }

    public /* synthetic */ SequenceInfo(int i, String str, String str2, boolean z, int i2, String str3, int i3, Meta meta, int i4, getTargetTypes gettargettypes) {
        this(i, str, str2, z, i2, str3, i3, (i4 & 128) != 0 ? null : meta);
    }

    public final int getRelativePosition() {
        return this.relativePosition;
    }

    public final String getInstrumentName() {
        return this.instrumentName;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final int getOverallPosition() {
        return this.overallPosition;
    }

    public final String getSectionName() {
        return this.sectionName;
    }

    public final void setSectionName(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.sectionName = str;
    }

    public final int getSectionPosition() {
        return this.sectionPosition;
    }

    public final void setSectionPosition(int i) {
        this.sectionPosition = i;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final void setMeta(Meta meta) {
        this.meta = meta;
    }
}
