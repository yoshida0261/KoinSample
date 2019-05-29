package jp.co.stah.koinsample

interface MainViewModelContract {
    fun greet() : String
}

class MainViewModel(private val greetingRepository: GreetingRepositoryContract) : MainViewModelContract {
    override fun greet(): String {
        return greetingRepository.greet()
    }
}