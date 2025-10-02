fun main() {
    while (true) {
        println("Enter student name (or type 'quit' to exit): ")
        val name = readln()
        if (name.lowercase() == "quit") {
            break
        }

        println("Enter student ID: ")
        val id = readln()

        println("Enter student course: ")
        val course = readln()

        println("Enter student mark: ")
        val mark = readln().toDouble()


        val student = student(id, name, course, mark)


        println(student)
    }
}
