package com.lapangin.web.service;

import com.lapangin.web.model.Booking;
import com.lapangin.web.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking getBookingById(Long id) {
        Optional<Booking> booking = bookingRepository.findById(id);
        return booking.orElse(null); // Return null jika tidak ditemukan
    }

    public void saveBooking(Booking booking) {
        bookingRepository.save(booking);
    }
}
