package com.sendbird.android;
/* loaded from: classes5.dex */
enum CommandType {
    EROR(false),
    LOGI(true),
    MESG(true),
    FILE(true),
    EXIT(true),
    READ(true),
    MEDI(true),
    FEDI(true),
    ENTR(true),
    BRDM(false),
    ADMM(false),
    AEDI(false),
    TPST(false),
    TPEN(false),
    MTIO(false),
    SYEV(false),
    USEV(false),
    DELM(false),
    LEAV(false),
    UNRD(false),
    DLVR(false),
    NOOP(false),
    MRCT(false),
    PING(false),
    PONG(false),
    MACK(false),
    JOIN(false),
    MTHD(false),
    EXPR(false),
    NONE(false);
    
    private final boolean isAckRequired;

    CommandType(boolean z) {
        this.isAckRequired = z;
    }

    public boolean isAckRequired() {
        return this.isAckRequired;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CommandType from(String str) {
        CommandType[] values;
        for (CommandType commandType : values()) {
            if (commandType.name().equals(str)) {
                return commandType;
            }
        }
        return NONE;
    }
}
