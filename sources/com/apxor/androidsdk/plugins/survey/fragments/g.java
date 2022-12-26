package com.apxor.androidsdk.plugins.survey.fragments;

import android.app.Fragment;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apxor.androidsdk.plugins.survey.R;
import com.apxor.androidsdk.plugins.survey.SurveyActivity;
import com.google.android.exoplayer2.ExoPlayer;
/* loaded from: classes6.dex */
public class g extends Fragment implements SurveyActivity.d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.getActivity().finish();
        }
    }

    private void b() {
        new Handler().postDelayed(new a(), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    @Override // com.apxor.androidsdk.plugins.survey.SurveyActivity.d
    public String a() {
        return null;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = getArguments().getInt("bgColor");
        int i2 = getArguments().getInt("textColor");
        String string = getArguments().getString("message");
        int i3 = getArguments().getInt("iconColor");
        View inflate = layoutInflater.inflate(R.layout.apx_custom_toast_view, viewGroup, false);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        GradientDrawable gradientDrawable = (GradientDrawable) getResources().getDrawable(R.drawable.apx_toast_border);
        com.apxor.androidsdk.plugins.survey.d.a(i, gradientDrawable);
        inflate.setBackground(gradientDrawable);
        TextView textView = (TextView) inflate.findViewById(R.id.apx_message);
        com.apxor.androidsdk.plugins.survey.d.a(i2, textView);
        textView.setText(string);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.apx_img_icon);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.apx_success_image));
        imageView.setColorFilter(i3);
        ((LinearLayout) getActivity().findViewById(R.id.apx_survey_layout)).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        inflate.startAnimation(alphaAnimation);
        b();
        return inflate;
    }
}
