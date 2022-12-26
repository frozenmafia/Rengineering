package com.sendbird.android;

import com.sendbird.android.Command;
import com.sendbird.android.TimeoutScheduler;
import com.sendbird.android.log.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class AckSession implements TimeoutScheduler.TimeoutEventhandler {
    private final Command.SendCommandHandler handler;
    private final TimeoutScheduler scheduler;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AckSession(long j, Command.SendCommandHandler sendCommandHandler) {
        this.handler = sendCommandHandler;
        this.scheduler = new TimeoutScheduler(j, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ackReceived(Command command, SendBirdException sendBirdException) {
        Logger.d(">> AckSession::ackReceived()");
        this.scheduler.stop(true);
        sendResult(command, sendBirdException);
    }

    public void start() {
        Logger.d(">> AckSession::start()");
        this.scheduler.start();
    }

    @Override // com.sendbird.android.TimeoutScheduler.TimeoutEventhandler
    public void onTimeout(Object obj) {
        Logger.d(">> AckSession::onTimeout()");
        sendResult(null, new SendBirdException("Command received no ack.", SendBirdError.ERR_ACK_TIMEOUT));
    }

    public void cancel() {
        this.scheduler.stop(true);
        sendResult(null, new SendBirdException("Request was interrupted before receiving ack from the server. Maybe the connection was closed.", SendBirdError.ERR_ACK_TIMEOUT));
    }

    private void sendResult(final Command command, final SendBirdException sendBirdException) {
        SendBird.runOnUIThread(new Runnable() { // from class: com.sendbird.android.AckSession.1
            @Override // java.lang.Runnable
            public void run() {
                if (AckSession.this.handler != null) {
                    AckSession.this.handler.onResult(command, sendBirdException);
                }
            }
        });
    }
}
