package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public final class GameRequestContent implements ShareModel {
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new Parcelable.Creator<GameRequestContent>() { // from class: com.facebook.share.model.GameRequestContent.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public GameRequestContent createFromParcel(Parcel parcel) {
            return new GameRequestContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public GameRequestContent[] newArray(int i) {
            return new GameRequestContent[i];
        }
    };
    private final String HaptikSDK$a;
    private final List<String> HaptikSDK$c;
    private final ActionType ag$a;
    private final String ah$a;
    private final List<String> ah$b;
    private final String invoke;
    private final Filters toString;
    private final String valueOf;
    private final String values;

    /* loaded from: classes6.dex */
    public enum ActionType {
        SEND,
        ASKFOR,
        TURN,
        INVITE
    }

    /* loaded from: classes6.dex */
    public enum Filters {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GameRequestContent(valueOf valueof) {
        this.valueOf = valueof.ah$a;
        this.ah$a = valueof.toString;
        this.HaptikSDK$c = valueof.invoke;
        this.HaptikSDK$a = valueof.HaptikSDK$b;
        this.values = valueof.ag$a;
        this.ag$a = valueof.valueOf;
        this.invoke = valueof.HaptikSDK$c;
        this.toString = valueof.values;
        this.ah$b = valueof.HaptikSDK$a;
    }

    GameRequestContent(Parcel parcel) {
        this.valueOf = parcel.readString();
        this.ah$a = parcel.readString();
        this.HaptikSDK$c = parcel.createStringArrayList();
        this.HaptikSDK$a = parcel.readString();
        this.values = parcel.readString();
        this.ag$a = (ActionType) parcel.readSerializable();
        this.invoke = parcel.readString();
        this.toString = (Filters) parcel.readSerializable();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.ah$b = createStringArrayList;
        parcel.readStringList(createStringArrayList);
    }

    public String HaptikSDK$a() {
        return this.valueOf;
    }

    public String ag$a() {
        return this.ah$a;
    }

    public List<String> HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public String invoke() {
        return this.HaptikSDK$a;
    }

    public String values() {
        return this.values;
    }

    public ActionType ah$a() {
        return this.ag$a;
    }

    public String HaptikSDK$c() {
        return this.invoke;
    }

    public Filters valueOf() {
        return this.toString;
    }

    public List<String> ah$b() {
        return this.ah$b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.valueOf);
        parcel.writeString(this.ah$a);
        parcel.writeStringList(this.HaptikSDK$c);
        parcel.writeString(this.HaptikSDK$a);
        parcel.writeString(this.values);
        parcel.writeSerializable(this.ag$a);
        parcel.writeString(this.invoke);
        parcel.writeSerializable(this.toString);
        parcel.writeStringList(this.ah$b);
    }

    /* loaded from: classes6.dex */
    public static class valueOf {
        private List<String> HaptikSDK$a;
        private String HaptikSDK$b;
        private String HaptikSDK$c;
        private String ag$a;
        private String ah$a;
        private List<String> invoke;
        private String toString;
        private ActionType valueOf;
        private Filters values;

        public valueOf values(String str) {
            this.ah$a = str;
            return this;
        }

        public valueOf values(List<String> list) {
            this.invoke = list;
            return this;
        }

        public valueOf ag$a(String str) {
            this.ag$a = str;
            return this;
        }

        public valueOf toString(String str) {
            this.HaptikSDK$b = str;
            return this;
        }

        public valueOf ah$a(ActionType actionType) {
            this.valueOf = actionType;
            return this;
        }

        public valueOf ah$a(String str) {
            this.HaptikSDK$c = str;
            return this;
        }

        public valueOf values(Filters filters) {
            this.values = filters;
            return this;
        }

        public valueOf ag$a(List<String> list) {
            this.HaptikSDK$a = list;
            return this;
        }

        public GameRequestContent values() {
            return new GameRequestContent(this);
        }
    }
}
