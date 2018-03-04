package com.academy.learnprog.section3

class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            return name == other.name && id == other.id
        }
        return false
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + id
        return result
    }

    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}