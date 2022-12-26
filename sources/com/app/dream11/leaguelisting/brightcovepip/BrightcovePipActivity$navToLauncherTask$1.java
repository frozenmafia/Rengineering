package com.app.dream11.leaguelisting.brightcovepip;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class BrightcovePipActivity$navToLauncherTask$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Context $appContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BrightcovePipActivity$navToLauncherTask$1(Context context) {
        super(0);
        this.$appContext = context;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object systemService = this.$appContext.getSystemService(Constants.ACTIVITY);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        for (ActivityManager.AppTask appTask : ((ActivityManager) systemService).getAppTasks()) {
            Intent intent = appTask.getTaskInfo().baseIntent;
            runAnimators.ah$a(intent, "task.taskInfo.baseIntent");
            Set<String> categories = intent.getCategories();
            if (categories != null && categories.contains("android.intent.category.LAUNCHER")) {
                appTask.moveToFront();
                return;
            }
        }
    }
}
