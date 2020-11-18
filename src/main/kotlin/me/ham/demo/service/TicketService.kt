package me.ham.demo.service

import me.ham.demo.entity.Ticket
import me.ham.demo.repository.TicketRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TicketService {

    //2. injection field
    @Autowired
    private lateinit var ticketRepository: TicketRepository


    //3. setter
    private lateinit var emptyService: EmptyService
    @Autowired
    fun setRepository(emptyService: EmptyService) {
        this.emptyService = emptyService
    }

    fun findAll(): MutableList<Ticket> {
        return ticketRepository.findAll()
    }

    fun findById(id: Int): Ticket{
        return ticketRepository.findById(id).get()
    }

    fun save(ticket: Ticket){
        ticketRepository.save(ticket)
    }
}