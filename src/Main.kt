fun main() {
    val employee = Employee("Alice", "Smith", 1)
    val employeeSchedule = EmployeeShiftSchedule(employee)
    employeeSchedule.generateRandomShift(7) // 7 gün için rastgele vardiya oluştur

    println("${employee.firstName} ${employee.lastName}'nın Vardiya Programı:")
    employeeSchedule.getShiftSchedule().forEach { schedule ->
        println("Gün ${schedule.day}: ${schedule.shift}")
    }
}