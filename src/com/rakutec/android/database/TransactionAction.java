package com.rakutec.android.database;

public interface TransactionAction {
    void execute(DatabaseHelper helper) throws Exception;
}
