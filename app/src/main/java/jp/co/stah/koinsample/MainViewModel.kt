package jp.co.stah.koinsample

interface MainViewModelContract {
    fun greet() : String
}

class MainViewModel(private val greetingRepository: GreetingRepository) : MainViewModelContract {
    override fun greet(): String {
        return greetingRepository.greet()
    }
}