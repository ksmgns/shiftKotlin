class EmployeeShiftSchedule(private val employee: Employee) {
    private val shiftSchedule = mutableMapOf<Int, String>()

    fun generateRandomShift(numDays: Int) {
        val shifts = listOf("Morning Shift", "Afternoon Shift", "Night Shift")
        for (day in 1..numDays) {
            shiftSchedule[day] = shifts.random()
        }
    }

    fun getShiftSchedule(): Map<Int, String> {
        return shiftSchedule
    }
}