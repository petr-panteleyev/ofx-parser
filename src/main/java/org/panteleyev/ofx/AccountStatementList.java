package org.panteleyev.ofx;

/*
 Copyright (c) Petr Panteleyev. All rights reserved.
 Licensed under the BSD license. See LICENSE file in the project root for full license information.
 */

import java.util.List;

public record AccountStatementList(List<AccountStatement>accountStatementList) {
    public AccountInfo getAccountInfo() {
        return accountStatementList.isEmpty() ?
            new AccountInfo() : accountStatementList.get(0).bankAccountFrom();
    }

    public BankTransactionList getBankTransactionList() {
        return accountStatementList.isEmpty() ?
            new BankTransactionList() : accountStatementList.get(0).bankTransactionList();
    }
}
