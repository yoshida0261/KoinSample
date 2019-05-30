package jp.co.stah.koinsample

class DammyRepository : GreetingRepositoryContract {

    override fun greet(): String {
        return "dammy repos"
    }
}