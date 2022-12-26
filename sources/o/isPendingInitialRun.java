package o;

import com.google.firebase.installations.local.PersistedInstallation;
import o.RecyclerView;
/* loaded from: classes7.dex */
public abstract class isPendingInitialRun {
    public static isPendingInitialRun ag$a = HaptikSDK$c().ag$a();

    public abstract isPendingInitialRun$ah$a HaptikSDK$a();

    public abstract PersistedInstallation.RegistrationStatus HaptikSDK$b();

    public abstract String ag$a();

    public abstract String ah$a();

    public abstract String ah$b();

    public abstract long invoke();

    public abstract String valueOf();

    public abstract long values();

    public boolean getInitSettings() {
        return HaptikSDK$b() == PersistedInstallation.RegistrationStatus.REGISTERED;
    }

    public boolean HaptikSDK$d() {
        return HaptikSDK$b() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
    }

    public boolean HaptikWebView() {
        return HaptikSDK$b() == PersistedInstallation.RegistrationStatus.UNREGISTERED;
    }

    public boolean HaptikSDK$e() {
        return HaptikSDK$b() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || HaptikSDK$b() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    public boolean getSignupData() {
        return HaptikSDK$b() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    public isPendingInitialRun values(String str) {
        return HaptikSDK$a().valueOf(str).toString(PersistedInstallation.RegistrationStatus.UNREGISTERED).ag$a();
    }

    public isPendingInitialRun values(String str, String str2, long j, String str3, long j2) {
        return HaptikSDK$a().valueOf(str).toString(PersistedInstallation.RegistrationStatus.REGISTERED).toString(str3).ag$a(str2).valueOf(j2).values(j).ag$a();
    }

    public isPendingInitialRun ag$a(String str) {
        return HaptikSDK$a().values(str).toString(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).ag$a();
    }

    public isPendingInitialRun a() {
        return HaptikSDK$a().toString(PersistedInstallation.RegistrationStatus.NOT_GENERATED).ag$a();
    }

    public isPendingInitialRun ah$a(String str, long j, long j2) {
        return HaptikSDK$a().toString(str).valueOf(j).values(j2).ag$a();
    }

    public isPendingInitialRun aj$a() {
        return HaptikSDK$a().toString((String) null).ag$a();
    }

    public static isPendingInitialRun$ah$a HaptikSDK$c() {
        return new RecyclerView.RecyclerViewDataObserver.toString().values(0L).toString(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).valueOf(0L);
    }
}
