package people.powers

trait RunFast {
    def nickName: String

    def run() = {
        println(s"$nickName runs too fast for ya.")
    } 
}
