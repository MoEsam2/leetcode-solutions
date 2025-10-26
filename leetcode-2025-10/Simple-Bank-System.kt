class Bank(val balance: LongArray) {
    fun transfer(account1: Int, account2: Int, money: Long): Boolean {
        if (account1 > balance.size || account2 > balance.size) return false
        return if (balance[account1 - 1] >= money) {
            withdraw(account1,money)
            deposit(account2,money)
            true
        } else false
    }

    fun deposit(account: Int, money: Long): Boolean {
        if (account > balance.size) return false
        balance[account - 1] += money
        return true
    }

    fun withdraw(account: Int, money: Long): Boolean {
        if (account > balance.size) return false
        return if (balance[account - 1] >= money) {
            balance[account - 1] -= money
            true
        } else false
    }

}

/**
 * Your Bank object will be instantiated and called as such:
 * var obj = Bank(balance)
 * var param_1 = obj.transfer(account1,account2,money)
 * var param_2 = obj.deposit(account,money)
 * var param_3 = obj.withdraw(account,money)
 */