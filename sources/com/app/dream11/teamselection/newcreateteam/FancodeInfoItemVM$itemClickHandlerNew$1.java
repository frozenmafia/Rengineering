package com.app.dream11.teamselection.newcreateteam;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.compareStrings;
import o.getResultKey;
import o.isDataOnly;
import o.setAllowDataType;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class FancodeInfoItemVM$itemClickHandlerNew$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ getResultKey $itemClickHandler;
    final /* synthetic */ setAllowDataType this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancodeInfoItemVM$itemClickHandlerNew$1(getResultKey getresultkey, setAllowDataType setallowdatatype) {
        super(0);
        this.$itemClickHandler = getresultkey;
        this.this$0 = setallowdatatype;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        compareStrings comparestrings;
        getResultKey getresultkey = this.$itemClickHandler;
        comparestrings = this.this$0.ah$a;
        isDataOnly isdataonly = (isDataOnly) comparestrings.invoke();
        getresultkey.valueOf(isdataonly == null ? -1 : isdataonly.values());
    }
}
