package me.ham.demo.contoller

import me.ham.demo.entity.Ticket
import me.ham.demo.service.TicketService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("tickets")
//1. injection constructor
class TicketController(val ticketService: TicketService) {


    @GetMapping
    fun hello(): ResponseEntity<MutableList<Ticket>>{
        return ResponseEntity.ok(ticketService.findAll())
    }

    @GetMapping("{id}")
    fun hello(@PathVariable id:Int): ResponseEntity<Ticket>{
        return ResponseEntity.ok(ticketService.findById(id))
    }

    @PostMapping
    fun createTicket(): ResponseEntity<*>{
        val ticket = Ticket()
        ticketService.save(ticket)
        return ResponseEntity.ok(ticket)
    }


}