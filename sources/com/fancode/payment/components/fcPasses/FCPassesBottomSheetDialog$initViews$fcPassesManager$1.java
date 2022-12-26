package com.fancode.payment.components.fcPasses;

import android.widget.TextView;
import com.fancode.payment.GetOrdersQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.LifecycleService;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FCPassesBottomSheetDialog$initViews$fcPassesManager$1 extends Lambda implements Styleable.ChangeBounds<List<? extends GetOrdersQuery.valueOf>, setAnimationMatrix> {
    final /* synthetic */ LifecycleService $adapter;
    final /* synthetic */ FCPassesBottomSheetDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCPassesBottomSheetDialog$initViews$fcPassesManager$1(LifecycleService lifecycleService, FCPassesBottomSheetDialog fCPassesBottomSheetDialog) {
        super(1);
        this.$adapter = lifecycleService;
        this.this$0 = fCPassesBottomSheetDialog;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetOrdersQuery.valueOf> list) {
        invoke2((List<GetOrdersQuery.valueOf>) list);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetOrdersQuery.valueOf> list) {
        runAnimators.ag$a(list, "it");
        this.$adapter.HaptikSDK$a();
        this.this$0.valueOf().HaptikSDK$a.setVisibility(8);
        TextView textView = this.this$0.valueOf().HaptikSDK$d;
        runAnimators.ah$a(textView, "binding.tvNoPasses");
        textView.setVisibility(list.isEmpty() ? 0 : 8);
        this.$adapter.valueOf(new ArrayList<>(list));
    }
}
