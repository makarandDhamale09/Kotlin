package interviewQuestions.thread

class NewThread() : Thread("My Thread") {

    init {
        start()
    }

    override fun run() {
        println(this)
    }
}