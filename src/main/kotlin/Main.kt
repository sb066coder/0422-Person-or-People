fun main() {
    var likes = 0
    println(rusLikePhrase(likes))
    likes = 1
    println(rusLikePhrase(likes))
    likes = 2
    println(rusLikePhrase(likes))
    likes = 3
    println(rusLikePhrase(likes))
    likes = 10
    println(rusLikePhrase(likes))
    likes = 11
    println(rusLikePhrase(likes))
    likes = 15
    println(rusLikePhrase(likes))
    likes = 21
    println(rusLikePhrase(likes))
    likes = 50
    println(rusLikePhrase(likes))
    likes = 101
    println(rusLikePhrase(likes))
    likes = 111
    println(rusLikePhrase(likes))
    likes = 151
    println(rusLikePhrase(likes))
    likes = 200
    println(rusLikePhrase(likes))
}

fun rusLikePhrase(likes: Int): String {
    return if (likes > 0) {
        if (likes % 10 == 1 && likes % 100 != 11) {
            "Понравилось $likes человеку"
        } else "Понравилось $likes людям"
    } else "Никому не понравилось"

}
