package me.ham.demo.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Ticket {
    @Id
    @GeneratedValue
    var id: Int = 0

    var name: String = "defaultName"
}
