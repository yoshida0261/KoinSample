package jp.co.stah.koinsample

class MainViewModel(private val greetingRepository: GreetingRepository) {
    fun greet(): String {
        return greetingRepository.greet()
    }
}