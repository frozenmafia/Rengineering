package com.clevertap.android.sdk.inapp;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import o.setCollectionItemInfo;
import o.setCollectionItemInfo$ah$a;
/* loaded from: classes4.dex */
public class CTInAppNativeFooterFragment extends CTInAppBasePartialNativeFragment {
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        this.invoke = layoutInflater.inflate(setCollectionItemInfo$ah$a.inapp_footer, viewGroup, false);
        new FrameLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) this.invoke.findViewById(setCollectionItemInfo.toString.footer_frame_layout)).findViewById(setCollectionItemInfo.toString.footer_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(this.values.ag$a()));
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(setCollectionItemInfo.toString.footer_linear_layout_2);
        LinearLayout linearLayout2 = (LinearLayout) relativeLayout.findViewById(setCollectionItemInfo.toString.footer_linear_layout_3);
        Button button = (Button) linearLayout2.findViewById(setCollectionItemInfo.toString.footer_button_1);
        arrayList.add(button);
        Button button2 = (Button) linearLayout2.findViewById(setCollectionItemInfo.toString.footer_button_2);
        arrayList.add(button2);
        ImageView imageView = (ImageView) ((LinearLayout) relativeLayout.findViewById(setCollectionItemInfo.toString.footer_linear_layout_1)).findViewById(setCollectionItemInfo.toString.footer_icon);
        if (!this.values.aj$a().isEmpty()) {
            Bitmap ah$a = this.values.ah$a(this.values.aj$a().get(0));
            if (ah$a != null) {
                imageView.setImageBitmap(ah$a);
            } else {
                imageView.setVisibility(8);
            }
        } else {
            imageView.setVisibility(8);
        }
        TextView textView = (TextView) linearLayout.findViewById(setCollectionItemInfo.toString.footer_title);
        textView.setText(this.values.extraCallback());
        textView.setTextColor(Color.parseColor(this.values.ak$a()));
        TextView textView2 = (TextView) linearLayout.findViewById(setCollectionItemInfo.toString.footer_message);
        textView2.setText(this.values.onXdkEvent());
        textView2.setTextColor(Color.parseColor(this.values.ak()));
        ArrayList<CTInAppNotificationButton> HaptikSDK$c = this.values.HaptikSDK$c();
        if (HaptikSDK$c != null && !HaptikSDK$c.isEmpty()) {
            for (int i = 0; i < HaptikSDK$c.size(); i++) {
                if (i < 2) {
                    toString((Button) arrayList.get(i), HaptikSDK$c.get(i), i);
                }
            }
        }
        if (this.values.ah$a() == 1) {
            ah$a(button, button2);
        }
        this.invoke.setOnTouchListener(new View.OnTouchListener() { // from class: com.clevertap.android.sdk.inapp.CTInAppNativeFooterFragment.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                CTInAppNativeFooterFragment.this.ah$b.onTouchEvent(motionEvent);
                return true;
            }
        });
        return this.invoke;
    }
}
