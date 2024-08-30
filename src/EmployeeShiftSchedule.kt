class EmployeeShiftSchedule(private val employee: Employee) {
    private val shiftSchedule = mutableListOf<ShiftSchedule>()

    fun generateRandomShift(numDays: Int) {
        val shifts = listOf("Morning Shift", "Afternoon Shift", "Night Shift")
        for (day in 1..numDays) {
            val shift = shifts.random()
            shiftSchedule.add(ShiftSchedule(employee, day, shift))
        }
    }

    fun getShiftSchedule(): List<ShiftSchedule> {
        return shiftSchedule
    }
}