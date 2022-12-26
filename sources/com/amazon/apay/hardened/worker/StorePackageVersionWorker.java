package com.amazon.apay.hardened.worker;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.dreampay.commons.constants.Constants;
import o.setHandler;
/* loaded from: classes.dex */
public class StorePackageVersionWorker extends Worker {
    public static String ag$a;
    public static PackageManager values;

    public StorePackageVersionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ag$a = context.getPackageName();
        values = context.getPackageManager();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        String str;
        setHandler.toString("appId", ag$a);
        try {
            str = values.getPackageInfo(Constants.AMAZON_PACKAGE_NAME, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        setHandler.toString("amazonShoppingIndiaAppVersion", str);
        return ListenableWorker.Result.success();
    }
}
