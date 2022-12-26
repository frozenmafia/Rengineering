package com.apxor.androidsdk.plugins.realtimeui.inapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.ce.Constants;
import com.apxor.androidsdk.plugins.realtimeui.R;
import com.apxor.androidsdk.plugins.realtimeui.UIManager;
import com.apxor.androidsdk.plugins.realtimeui.utils.d;
/* loaded from: classes3.dex */
public class HtmlActivity extends Activity {
    private static final String a = "HtmlActivity";

    /* renamed from: b  reason: collision with root package name */
    private String f360b;
    private String c;
    private com.apxor.androidsdk.plugins.realtimeui.g.c.a d;
    private String e;
    private boolean f;
    private long g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;

    /* loaded from: classes3.dex */
    class a implements d {
        final /* synthetic */ RelativeLayout a;

        /* renamed from: com.apxor.androidsdk.plugins.realtimeui.inapp.activities.HtmlActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class animation.Animation$AnimationListenerC0276a implements Animation.AnimationListener {
            final /* synthetic */ boolean[] a;

            animation.Animation$AnimationListenerC0276a(boolean[] zArr) {
                this.a = zArr;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if ((HtmlActivity.this.e.equals("TOP") || HtmlActivity.this.e.equals("BOTTOM")) && !this.a[0]) {
                    a aVar = a.this;
                    HtmlActivity.this.a(aVar.a);
                    this.a[0] = true;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                if (HtmlActivity.this.e.equals("TOP") || HtmlActivity.this.e.equals("BOTTOM") || this.a[0]) {
                    return;
                }
                a aVar = a.this;
                HtmlActivity.this.a(aVar.a);
                this.a[0] = true;
            }
        }

        a(RelativeLayout relativeLayout) {
            this.a = relativeLayout;
        }

        @Override // com.apxor.androidsdk.plugins.realtimeui.utils.d
        public void a(WebView webView) {
            if (HtmlActivity.this.i) {
                return;
            }
            webView.setVisibility(0);
            if (!HtmlActivity.this.f) {
                HtmlActivity.this.a(this.a);
                return;
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(HtmlActivity.this.getApplicationContext(), R.anim.apx_fade_in);
            loadAnimation.setDuration(HtmlActivity.this.g);
            loadAnimation.setAnimationListener(new animation.Animation$AnimationListenerC0276a(new boolean[]{false}));
            webView.startAnimation(loadAnimation);
        }

        @Override // com.apxor.androidsdk.plugins.realtimeui.utils.d
        public void b(WebView webView) {
            if (HtmlActivity.this.i) {
                return;
            }
            HtmlActivity.this.i = true;
            UIManager.getInstance().a("IN_APP", false);
            HtmlActivity.this.finish();
            Log.e(HtmlActivity.a, "Failed to load page");
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = new Rect();
            int[] iArr = new int[2];
            HtmlActivity.this.d.getHitRect(rect);
            HtmlActivity.this.d.getLocationOnScreen(iArr);
            rect.offsetTo(iArr[0], iArr[1]);
            if (!rect.contains((int) x, (int) y)) {
                HtmlActivity.this.finish();
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HtmlActivity.this.finish();
            UIManager.getInstance().a("inapp_dismissed", HtmlActivity.this.f360b, HtmlActivity.this.c);
        }
    }

    private void a(RelativeLayout.LayoutParams layoutParams) {
        char c2;
        int i;
        String str = this.e;
        str.hashCode();
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == 83253) {
            if (str.equals("TOP")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != 1965067819) {
            if (hashCode == 1984282709 && str.equals("CENTER")) {
                c2 = 2;
            }
            c2 = 65535;
        } else {
            if (str.equals("BOTTOM")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        if (c2 != 0) {
            if (c2 == 1) {
                i = 12;
            } else if (c2 != 2) {
                return;
            } else {
                i = 13;
            }
            layoutParams.addRule(i);
            return;
        }
        layoutParams.addRule(10);
        Resources resources = getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            layoutParams.setMargins(0, resources.getDimensionPixelSize(identifier), 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RelativeLayout relativeLayout) {
        Resources resources;
        int i;
        if (this.h) {
            resources = getResources();
            i = R.drawable.apx_screen_background_dark_transparent;
        } else {
            resources = getResources();
            i = R.drawable.apx_screen_background_dark_full_transparent;
        }
        relativeLayout.setBackgroundDrawable(resources.getDrawable(i));
    }

    public void b() {
        this.j = true;
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.k) {
            return;
        }
        this.k = true;
        UIManager.getInstance().a("IN_APP", false);
        overridePendingTransition(0, 0);
        super.finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.j) {
            return;
        }
        this.j = true;
        finish();
        UIManager.getInstance().a("InAppBackButtonPressed", this.f360b, this.c);
        UIManager.getInstance().a("inapp_dismissed", this.f360b, this.c);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("config_id") || intent.getExtras() == null) {
            UIManager.getInstance().a("IN_APP", false);
            Log.e(a, "Missing intent extra");
            finish();
            return;
        }
        Bundle extras = intent.getExtras();
        this.f360b = intent.getStringExtra("config_id");
        this.c = intent.getStringExtra(Constants.MESSAGE_NAME);
        try {
            if (intent.getBooleanExtra("is_full", false)) {
                getWindow().setFlags(1024, 1024);
            }
            getWindow().getDecorView().setSystemUiVisibility(extras.getInt("flags"));
            getWindow().setFlags(extras.getInt("window_flags"), extras.getInt("window_flags"));
            com.apxor.androidsdk.plugins.realtimeui.c b2 = UIManager.getInstance().b(this.f360b);
            if (b2 == null) {
                Log.e(a, "Config is null. Can't proceed further");
                UIManager.getInstance().a("IN_APP", false);
                finish();
                return;
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            this.e = b2.v();
            this.f = b2.C();
            this.g = b2.g();
            this.h = b2.G();
            this.d = com.apxor.androidsdk.plugins.realtimeui.utils.b.a(this, b2, new a(relativeLayout));
            a(layoutParams);
            int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                layoutParams.topMargin -= getResources().getDimensionPixelSize(identifier);
                relativeLayout.setLayoutParams(layoutParams);
                layoutParams.topMargin = 0;
                this.d.setLayoutParams(layoutParams);
            }
            relativeLayout.addView(this.d, layoutParams);
            setContentView(relativeLayout);
            if (b2.J()) {
                relativeLayout.setOnTouchListener(new b());
            }
            if (b2.o() > 0) {
                SDKController.getInstance().dispatchToMainThread(new c(), b2.o());
            }
        } catch (Exception e) {
            UIManager.getInstance().a("IN_APP", false);
            SDKController.getInstance().logException("ma_show", e);
            finish();
            Log.e(a, "Failed to show due to " + e.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.d.onPause();
        this.d.stopLoading();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.d.onResume();
    }
}
