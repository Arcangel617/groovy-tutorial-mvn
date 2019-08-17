class BitwiseOperatorsExample {
    static void main(String [] args) {
        println('AND')
        andTruthTable()
        println('OR')
        orTruthTable()
        println('OR')
        xorTruthTable()
    }

    static def andTruthTable() {
        println(true & true)
        println(true & false)
        println(false & true)
        println(false & false)
    }

    static def orTruthTable() {
        println(true | true)
        println(true | false)
        println(false | true)
        println(false | false)
    }

    static def xorTruthTable() {
        println(true ^ true)
        println(true ^ false)
        println(false ^ true)
        println(false ^ false)

    }
}