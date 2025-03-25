package com.bookstore.service;

import com.bookstore.model.Publisher;
import com.bookstore.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    public Publisher addPublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    public List<Publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }

    public Optional<Publisher> getPublisherById(Long id) {
        return publisherRepository.findById(id);
    }

    public Publisher updatePublisher(Long id, Publisher updatedPublisher) {
        return publisherRepository.findById(id)
                .map(existingPublisher -> {
                    existingPublisher.setName(updatedPublisher.getName());
                    existingPublisher.setCountry(updatedPublisher.getCountry());
                    return publisherRepository.save(existingPublisher);
                }).orElse(null);
    }

    public void deletePublisher(Long id) {
        publisherRepository.deleteById(id);
    }
}
