package com.example.minimoneybox.userAccounts

import com.example.minimoneybox.data.UserAccount

data class UserAccountViewModel(private val userAccount: UserAccount) {


    val name: String = userAccount.name

    val planValue: String = "Plan Value: ${userAccount.value}"

    val moneybox: String = "MoneyBox: ${userAccount.moneybox}"

}