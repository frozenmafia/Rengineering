package com.apxor.androidsdk.plugins.survey.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apxor.androidsdk.plugins.survey.R;
/* loaded from: classes6.dex */
public class e extends LinearLayout {
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    public static int n;

    /* renamed from: o  reason: collision with root package name */
    public static int f393o;
    public static String p;
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f394b;
    private TextView c;
    private TextView d;
    private LinearLayout e;
    private ImageView f;
    private View g;
    private boolean h;
    private int i;

    public e(Context context, com.apxor.androidsdk.plugins.survey.e.b bVar, com.apxor.androidsdk.plugins.survey.e.d dVar) {
        super(context);
        ImageView imageView;
        int i;
        this.i = -1;
        this.f394b = dVar.a() == 1;
        this.g = LayoutInflater.from(context).inflate(R.layout.apx_layout_option_with_text_icon, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(10, 15, 10, 15);
        this.g.setLayoutParams(layoutParams);
        this.f = (ImageView) this.g.findViewById(R.id.apx_icon);
        Resources resources = getResources();
        if (this.f394b) {
            imageView = this.f;
            i = R.drawable.apx_option_radio;
        } else {
            imageView = this.f;
            i = R.drawable.apx_multi_option_checkbox;
        }
        imageView.setImageDrawable(resources.getDrawable(i));
        LinearLayout linearLayout = (LinearLayout) this.g.findViewById(R.id.apx_other_text_layout);
        this.e = linearLayout;
        this.d = (TextView) linearLayout.findViewById(R.id.apx_text_response);
        this.c = (TextView) this.g.findViewById(R.id.apx_text);
        a((LinearLayout) this.g.findViewById(R.id.apx_option), f393o);
        com.apxor.androidsdk.plugins.survey.d.a(m, this.f);
        com.apxor.androidsdk.plugins.survey.d.a(k, this.c);
        com.apxor.androidsdk.plugins.survey.d.a(k, this.d);
        if (p.equals("none")) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.g.getLayoutParams();
            int a = com.apxor.androidsdk.plugins.survey.d.a(resources.getDisplayMetrics().densityDpi, 5.0d);
            layoutParams2.topMargin = a;
            layoutParams2.bottomMargin = a;
            this.g.setLayoutParams(layoutParams2);
            this.g.setPadding(0, 0, 0, 0);
        }
        this.c.setText(bVar.a().trim());
        this.h = bVar.d();
        this.i = bVar.c();
        addView(this.g);
    }

    private void a(LinearLayout linearLayout, int i) {
        char c;
        GradientDrawable gradientDrawable = (GradientDrawable) linearLayout.getBackground();
        String str = p;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -1383304148) {
            if (str.equals("border")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 3143043) {
            if (hashCode == 3387192 && str.equals("none")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("fill")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1) {
                gradientDrawable.setStroke(0, this.a ? n : f393o);
                com.apxor.androidsdk.plugins.survey.d.a(i, gradientDrawable);
            } else if (c == 2) {
                gradientDrawable = null;
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            gradientDrawable.setStroke(2, this.a ? n : f393o);
        }
        linearLayout.setBackground(gradientDrawable);
    }

    public boolean a() {
        return this.a;
    }

    public int getNextQuestionId() {
        return this.i;
    }

    public String getOtherText() {
        if (this.h) {
            return this.d.getText().toString();
        }
        return null;
    }

    public void setChecked(boolean z) {
        ImageView imageView;
        int i;
        this.a = z;
        LinearLayout linearLayout = (LinearLayout) this.g.findViewById(R.id.apx_option);
        Resources resources = getResources();
        a(linearLayout, this.a ? n : f393o);
        if (this.f394b) {
            imageView = this.f;
            i = this.a ? R.drawable.apx_option_radio_selected : R.drawable.apx_option_radio;
        } else {
            imageView = this.f;
            i = this.a ? R.drawable.apx_multi_option_checkbox_selected : R.drawable.apx_multi_option_checkbox;
        }
        imageView.setImageDrawable(resources.getDrawable(i));
        com.apxor.androidsdk.plugins.survey.d.a(this.a ? l : m, this.f);
        com.apxor.androidsdk.plugins.survey.d.a(this.a ? j : k, this.c);
        if (this.h) {
            if (!this.a) {
                this.e.setVisibility(8);
                com.apxor.androidsdk.plugins.survey.d.a(getContext(), this.d);
                return;
            }
            this.e.setVisibility(0);
            this.d.setMinLines(2);
            this.d.requestFocus();
            com.apxor.androidsdk.plugins.survey.d.b(getContext(), this.d);
        }
    }
}
