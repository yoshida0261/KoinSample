package jp.co.stah.koinsample

interface GreetingRepositoryContract {
    fun greet(): String
}

class GreetingRepository : GreetingRepositoryContract{
    fun greet(): String {
        return "こんにちわ from Repository"
    }
}