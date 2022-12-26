package com.clevertap.android.sdk.inapp;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URLDecoder;
import java.util.HashMap;
import o.EditorInfoCompat;
import o.getColumnCount;
import o.setBoundsInScreen;
/* loaded from: classes4.dex */
public abstract class CTInAppBasePartialHtmlFragment extends CTInAppBasePartialFragment implements View.OnTouchListener, View.OnLongClickListener {
    private getColumnCount HaptikSDK$a;
    private final GestureDetector ah$b = new GestureDetector(new values());

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return true;
    }

    abstract View values(LayoutInflater layoutInflater, ViewGroup viewGroup);

    abstract ViewGroup values(View view);

    /* loaded from: classes4.dex */
    class values extends GestureDetector.SimpleOnGestureListener {
        private final int ag$a;
        private final int values;

        private values() {
            this.values = 120;
            this.ag$a = 200;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent.getX() - motionEvent2.getX() > 120.0f && Math.abs(f) > 200.0f) {
                return ah$a(motionEvent, motionEvent2, false);
            }
            if (motionEvent2.getX() - motionEvent.getX() <= 120.0f || Math.abs(f) <= 200.0f) {
                return false;
            }
            return ah$a(motionEvent, motionEvent2, true);
        }

        private boolean ah$a(MotionEvent motionEvent, MotionEvent motionEvent2, boolean z) {
            TranslateAnimation translateAnimation;
            AnimationSet animationSet = new AnimationSet(true);
            if (z) {
                translateAnimation = new TranslateAnimation(0.0f, CTInAppBasePartialHtmlFragment.this.valueOf(50), 0.0f, 0.0f);
            } else {
                translateAnimation = new TranslateAnimation(0.0f, -CTInAppBasePartialHtmlFragment.this.valueOf(50), 0.0f, 0.0f);
            }
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setDuration(300L);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.clevertap.android.sdk.inapp.CTInAppBasePartialHtmlFragment.values.3
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    CTInAppBasePartialHtmlFragment.this.ah$a(null);
                }
            });
            CTInAppBasePartialHtmlFragment.this.HaptikSDK$a.startAnimation(animationSet);
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return valueOf(layoutInflater, viewGroup);
    }

    @Override // com.clevertap.android.sdk.inapp.CTInAppBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ag$a();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ag$a();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.ah$b.onTouchEvent(motionEvent) || motionEvent.getAction() == 2;
    }

    private View valueOf(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        try {
            View values2 = values(layoutInflater, viewGroup);
            ViewGroup values3 = values(values2);
            this.HaptikSDK$a = new getColumnCount(this.valueOf, this.values.onMessageChannelReady(), this.values.getSignupData(), this.values.onRelationshipValidationResult(), this.values.HaptikSDK$e());
            this.HaptikSDK$a.setWebViewClient(new WebViewClient() { // from class: com.clevertap.android.sdk.inapp.CTInAppBasePartialHtmlFragment$ah$a
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    String string;
                    try {
                        Bundle valueOf = EditorInfoCompat.Api30Impl.valueOf(str, false);
                        if (valueOf.containsKey("wzrk_c2a") && (string = valueOf.getString("wzrk_c2a")) != null) {
                            String[] split = string.split("__dl__");
                            if (split.length == 2) {
                                valueOf.putString("wzrk_c2a", URLDecoder.decode(split[0], "UTF-8"));
                                str = split[1];
                            }
                        }
                        CTInAppBasePartialHtmlFragment.this.values(valueOf, (HashMap<String, String>) null);
                        setBoundsInScreen.ag$a("Executing call to action for in-app: " + str);
                        CTInAppBasePartialHtmlFragment.this.valueOf(str, valueOf);
                    } catch (Throwable th) {
                        setBoundsInScreen.valueOf("Error parsing the in-app notification action!", th);
                    }
                    return true;
                }
            });
            this.HaptikSDK$a.setOnTouchListener(this);
            this.HaptikSDK$a.setOnLongClickListener(this);
            if (values3 != null) {
                values3.addView(this.HaptikSDK$a);
            }
            return values2;
        } catch (Throwable th) {
            this.toString.HaptikSDK$c().values(this.toString.valueOf(), "Fragment view not created", th);
            return null;
        }
    }

    private void ag$a() {
        this.HaptikSDK$a.values();
        int i = this.HaptikSDK$a.valueOf.y;
        int i2 = this.HaptikSDK$a.valueOf.x;
        float f = getResources().getDisplayMetrics().density;
        String replaceFirst = this.values.HaptikWebView().replaceFirst("<head>", "<head>" + ("<style>body{width:" + ((int) (i2 / f)) + "px; height: " + ((int) (i / f)) + "px; margin: 0; padding:0;}</style>"));
        setBoundsInScreen.values("Density appears to be " + f);
        this.HaptikSDK$a.setInitialScale((int) (f * 100.0f));
        this.HaptikSDK$a.loadDataWithBaseURL(null, replaceFirst, "text/html", "utf-8", null);
    }
}
