package com.app.dream11.contest;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import com.app.dream11.core.service.graphql.api.fragment.PlayerCompareMeta;
import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import o.FontResourcesParserCompat;
import o.applyFixedSizeWindow;
/* loaded from: classes.dex */
public class TeamCompareItemVM extends BaseObservable {
    private SectionType HaptikSDK$a;
    private Type HaptikSDK$b;
    private MatchStatus ag$a;
    private PlayerCompareMeta ah$a;
    private String ah$b;
    private double invoke;
    private applyFixedSizeWindow toString;
    private double valueOf;
    private PlayerCompareMeta values;

    /* loaded from: classes.dex */
    public enum Type {
        TITLE,
        PLAYER
    }

    public Type HaptikSDK$e() {
        return this.HaptikSDK$b;
    }

    public void ah$a(Type type) {
        this.HaptikSDK$b = type;
    }

    @Bindable
    public PlayerCompareMeta valueOf() {
        return this.ah$a;
    }

    public String ag$a() {
        return FontResourcesParserCompat.ProviderResourceEntry.ag$a(valueOf().getName().trim(), valueOf().getNameInitial());
    }

    public void valueOf(PlayerCompareMeta playerCompareMeta) {
        this.ah$a = playerCompareMeta;
    }

    @Bindable
    public PlayerCompareMeta invoke() {
        return this.values;
    }

    public String HaptikSDK$b() {
        return FontResourcesParserCompat.ProviderResourceEntry.ag$a(invoke().getName().trim(), invoke().getNameInitial());
    }

    public void values(PlayerCompareMeta playerCompareMeta) {
        this.values = playerCompareMeta;
    }

    public SectionType ah$b() {
        return this.HaptikSDK$a;
    }

    public void toString(SectionType sectionType) {
        this.HaptikSDK$a = sectionType;
    }

    @Bindable
    public double HaptikSDK$c() {
        return this.valueOf;
    }

    public void ah$a(double d) {
        this.valueOf = d;
    }

    @Bindable
    public double HaptikSDK$a() {
        return this.invoke;
    }

    public void ag$a(double d) {
        this.invoke = d;
    }

    @Bindable
    public String getSignupData() {
        return this.ah$b;
    }

    public void ah$a(String str) {
        this.ah$b = str;
    }

    public MatchStatus ah$a() {
        return this.ag$a;
    }

    public void ah$a(MatchStatus matchStatus) {
        this.ag$a = matchStatus;
    }

    public applyFixedSizeWindow values() {
        return this.toString;
    }

    public void ag$a(applyFixedSizeWindow applyfixedsizewindow) {
        this.toString = applyfixedsizewindow;
    }
}
