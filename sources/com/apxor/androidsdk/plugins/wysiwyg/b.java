package com.apxor.androidsdk.plugins.wysiwyg;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.WindowManager;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.utils.application.ActivityChangeListener;
import java.lang.ref.WeakReference;
/* loaded from: classes6.dex */
public class b extends ActivityChangeListener {
    private boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    private d f406b;
    private WeakReference<Activity> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apxor.androidsdk.plugins.wysiwyg.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class DialogInterface$OnClickListenerC0283b implements DialogInterface.OnClickListener {
        final /* synthetic */ Context a;

        DialogInterface$OnClickListenerC0283b(Context context) {
            this.a = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + this.a.getPackageName()));
            intent.addFlags(268435456);
            this.a.startActivity(intent);
        }
    }

    public static void a(Context context, String str) {
        new AlertDialog.Builder(context, R.style._res_0x7f130019).setPositiveButton("OK", new DialogInterface$OnClickListenerC0283b(context)).setNegativeButton("CANCEL", new a()).setMessage(str).setTitle("Overlay Permission").setCancelable(false).create().show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d b() {
        return this.f406b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        SDKController.getInstance().registerForActivityCallbacks(this);
    }

    @Override // com.apxor.androidsdk.core.utils.application.ActivityChangeListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        d dVar = this.f406b;
        if (dVar != null) {
            dVar.setVisibility(8);
        }
        WeakReference<Activity> weakReference = this.c;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @Override // com.apxor.androidsdk.core.utils.application.ActivityChangeListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (this.a) {
            if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(activity.getApplicationContext())) {
                a(activity, "Do you want to enable overlay ?");
                return;
            }
            d dVar = this.f406b;
            if (dVar == null) {
                d dVar2 = new d(activity);
                this.f406b = dVar2;
                dVar2.a(activity);
            } else if (dVar.getParent() == null) {
                this.f406b.a(activity);
            } else {
                this.f406b.setVisibility(0);
            }
        }
        this.c = new WeakReference<>(activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        d dVar;
        this.a = z;
        if (z || (dVar = this.f406b) == null) {
            return;
        }
        WindowManager windowManager = (WindowManager) dVar.getContext().getSystemService("window");
        if (this.f406b.getParent() != null) {
            windowManager.removeView(this.f406b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity a() {
        WeakReference<Activity> weakReference = this.c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
