package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.giphy.sdk.ui.views.GifView;
import o.getRawLegacyStreamType;
/* loaded from: classes4.dex */
public final class setUsage implements androidx.viewbinding.ViewBinding {
    public final FrameLayout HaptikSDK$a;
    public final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$b;
    public final TextView HaptikSDK$c;
    private final FrameLayout HaptikWebView;
    public final androidx.constraintlayout.widget.Guideline ag$a;
    public final TextView ah$a;
    public final ImageButton ah$b;
    public final ImageView getSignupData;
    public final GifView invoke;
    public final GifView toString;
    public final FrameLayout valueOf;
    public final View values;

    private setUsage(FrameLayout frameLayout, androidx.constraintlayout.widget.Guideline guideline, GifView gifView, FrameLayout frameLayout2, TextView textView, View view, FrameLayout frameLayout3, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, ImageButton imageButton, GifView gifView2, TextView textView2, ImageView imageView) {
        this.HaptikWebView = frameLayout;
        this.ag$a = guideline;
        this.toString = gifView;
        this.valueOf = frameLayout2;
        this.ah$a = textView;
        this.values = view;
        this.HaptikSDK$a = frameLayout3;
        this.HaptikSDK$b = constraintLayout;
        this.ah$b = imageButton;
        this.invoke = gifView2;
        this.HaptikSDK$c = textView2;
        this.getSignupData = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: ah$a */
    public FrameLayout getRoot() {
        return this.HaptikWebView;
    }

    public static setUsage valueOf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(getRawLegacyStreamType.toString.gph_user_profile_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return ag$a(inflate);
    }

    public static setUsage ag$a(View view) {
        View findViewById;
        int i = getRawLegacyStreamType$ah$a.avatarTopGuideline;
        androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
        if (guideline != null) {
            i = getRawLegacyStreamType$ah$a.bannerImage;
            GifView gifView = (GifView) view.findViewById(i);
            if (gifView != null) {
                i = getRawLegacyStreamType$ah$a.channelAvatarContainer;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                if (frameLayout != null) {
                    i = getRawLegacyStreamType$ah$a.channelName;
                    TextView textView = (TextView) view.findViewById(i);
                    if (textView != null && (findViewById = view.findViewById((i = getRawLegacyStreamType$ah$a.darkOverlay))) != null) {
                        i = getRawLegacyStreamType$ah$a.headerBackground;
                        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(i);
                        if (frameLayout2 != null) {
                            i = getRawLegacyStreamType$ah$a.headerLayout;
                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) view.findViewById(i);
                            if (constraintLayout != null) {
                                i = getRawLegacyStreamType$ah$a.infoButton;
                                ImageButton imageButton = (ImageButton) view.findViewById(i);
                                if (imageButton != null) {
                                    i = getRawLegacyStreamType$ah$a.userChannelGifAvatar;
                                    GifView gifView2 = (GifView) view.findViewById(i);
                                    if (gifView2 != null) {
                                        i = getRawLegacyStreamType$ah$a.userName;
                                        TextView textView2 = (TextView) view.findViewById(i);
                                        if (textView2 != null) {
                                            i = getRawLegacyStreamType$ah$a.verifiedBadge;
                                            ImageView imageView = (ImageView) view.findViewById(i);
                                            if (imageView != null) {
                                                return new setUsage((FrameLayout) view, guideline, gifView, frameLayout, textView, findViewById, frameLayout2, constraintLayout, imageButton, gifView2, textView2, imageView);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
